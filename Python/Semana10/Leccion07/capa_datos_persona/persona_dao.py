
from Persona import Persona
from conexion import Conexion
from logger_base import log

class PersonaDAO:
    """
    DAO signfica: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read -> Seleccionar
                    Update -> Actualizar
                    Delete -> Eliminar
    """

    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES (%s,%s,%s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    #Clase 9: Lunes 5 de junio.

    #Definimos los métodos de clase
    @classmethod
    def seleccionar(cls):
        #armamos las conexiones automáticas
         with Conexion.obtenerConexion(): 
            #obtenemos el cursor también de manera automática
            with Conexion.obtenerCursor() as cursor:
                #creamos la query
                cursor.execute(cls._SELECCIONAR) #ejecuta la sentencia
                registros = cursor.fetchall()
                personas = [] #creamos una lista de personas vacía
                #recorremos el registro con un ciclo for each
                for registro in registros:
                     #cada registro es una columna (id_persona, nombre, apellido y email)
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas

    # 9.3 Método Insertar
    @classmethod
    def insertar(cls, persona):  # necesita recibir un parametro
        with Conexion.obtenerConexion():  # realizamos las conexiones
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)  # Ejecutamos el cursor
                log.debug(f'Persona Insertada: {persona}')
                return cursor.rowcount
            
    # 9.4 Método Actualizar
    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f'Persona actualizada: {persona}')
                return cursor.rowcount

    # 9.5 Método Eliminar
    @classmethod
    def eliminar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona,)
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f'Los objetos eliminados son: {persona}')
                return cursor.rowcount

            
if __name__ == '__main__':
    # Eliminar un registro
    #persona1 = Persona(id_persona=13)
    #personas_eliminadas = PersonaDAO.eliminar(persona1)
    #log.debug(f'Personas eliminadas: {personas_eliminadas}')

    # Actualizar un registro
    # persona1 = Persona(1, 'Juan José', 'Pena', 'jjpena@mail.com')
    # personas_actualizadas = PersonaDAO.actualizar(persona1)
    # log.debug(f'Personas actualidas: {personas_actualizadas}')


    # Insertar un registro
    #persona1 = Persona(nombre = 'Omero', apellido = 'Ramos', email = 'omeror@mail.com')
    #personas_insertadas = PersonaDAO.insertar(persona1) #insertamos utilizamos PersonaDAO
    #log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)


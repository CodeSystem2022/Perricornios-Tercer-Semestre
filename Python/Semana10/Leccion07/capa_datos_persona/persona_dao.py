from Leccion07.capa_datos_persona.Persona import Persona
from Leccion07.capa_datos_persona.conexion import Conexion
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

    _SELECCIONAR = 'SELECT + FROM persona ORDER BY id_persona'
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

            
if __name__ == '__main__':
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)


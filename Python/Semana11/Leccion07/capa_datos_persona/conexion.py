from psycopg2 import pool
from logger_base import log
import sys

#SE CREA LA CLASE PARA LA CONEXIÓN CON LA BASE DE DATOS 
class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None
    
    

    #se crean los métodos

    #Método para la conexion
    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion

    #Método para el cursor
    # 8.3 Creación de la Clase Conexion: Video 5

    @classmethod
    def obtenerCursor(cls):
        pass

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'creación del pool exitosa: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool


# Prueba de errores de la clase Conection:

if __name__ == '__main__':
    conexion1 = Conexion.obtenerConexion()
    conexion2 = Conexion.obtenerConexion()
    conexion3 = Conexion.obtenerConexion()
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()


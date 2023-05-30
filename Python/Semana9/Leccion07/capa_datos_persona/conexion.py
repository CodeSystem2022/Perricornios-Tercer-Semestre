import psycopg2 as bd #psycopg2 as bd, también puede importarse así
from logger_base import log
import sys

#SE CREA LA CLASE PARA LA CONEXIÓN CON LA BASE DE DATOS 
class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

#se crean los métodos

#Método para la conexion
@classmethod
def obtenerConexion(cls):
    if cls._conexion is None:
        try:
            cls._conexion = bd.connect(host=cls._HOST,
                                       user=cls._USERNAME,
                                       password=cls._PASSWORD,
                                       port=cls._DB_PORT,
                                       database=cls.DATABASE)
            log.debug(f'Conexión Exitosa: {cls._conexion}')
            return cls._conexion
        except Exception as e:
            log.error(f'Ocurrió un error: {e}')
            sys.exit()
        else:
            return cls._conexion

#Método para el cursor
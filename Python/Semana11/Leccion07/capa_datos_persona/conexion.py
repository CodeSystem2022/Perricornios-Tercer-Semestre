# 10.1 Se importa el pool para que la clase pueda manejar un pool de conexiones

from psycopg2 import pool  
#import psycopg2 as bd #psycopg2 as bd, también puede importarse así
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
        pass
        

    #Método para el cursor
    # 8.3 Creación de la Clase Conexion: Video 5

    @classmethod
    def obtenerCursor(cls):
        pass

# 10.1 Se agrega un método para el pool de conexiones:

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try: 
                cls._pool = pool.SimpleConnectionPool()

# Prueba de errores de la clase Conection:

if __name__ == '__main__':
    pass


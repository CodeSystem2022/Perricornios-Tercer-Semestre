from logger_base import log
from conexion import Conexion

#El cursor se obtiene de una conexión valida y esta se obtiene del pool
class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None


    #Contexto resource manager o context manager
    def __enter__(self): #Método dunder enter
        log.debug('Inicio del método with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor
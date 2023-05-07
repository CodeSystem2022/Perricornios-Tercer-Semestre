import os
#Creamos la clase "CatalogoPeliculas"
class CatalogoPeliculas: 

    ruta_archivo = 'peliculas.txt'  #definimos la variable de clase

    @classmethod     #definimos un método para agregar pelliculas
    def agregar_peliculas(cls, pelicula):
        with open(cls.ruta_archivo, 'a', encoding='utf8') as archivo:
            archivo.write(f'{pelicula.nombre}\n')

    
    #agregamos otro metodo para listar las peliculas
    @classmethod
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, 'r', encoding='utf8') as archivo:
            print(f'Catalogo de peliculas'.center(50, '-'))
            print(archivo.read())

    
    #definimos un nuevo método para eliminar las peliculas
    @classmethod
    def eliminar_peliculas(cls): #ahora importamos el "os" del sistema operativo el metodo remove (linea1)
        os.remove(cls.ruta_archivo)
        print(f'Archivo eliminado: {cls.ruta_archivo}')

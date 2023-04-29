# creamos el menu!
from dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp # renombramos la clase a cp

opcion = None

while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula.')
        print('2. Listar las peliculas.')
        print('3. Eliminar catálogo de peliculas.')
        print('4. Salir.')
        opcion = int(input('Digite una opcion de menú (1-4): ')) # le damos a elegir la opcion de menu al usuario

        if opcion == 1:  # si oprime opcion 1
            nombre_pelicula = input("Digite el nombre de la pelicula: ") # pedimos el nombre
            pelicula = Pelicula(nombre_pelicula) #
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()


    except Exception as e:  # reasignamos un valor a la opcion none
        print(f'Ocurrió un error de tipo: {e}')
        opcion = None # llevamos al menu al estado original
    else:
        print('Salimos del Programa...')


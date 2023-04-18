# creamos el menu!
opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula.')
        print('2. Listar las peliculas.')
        print('3. Eliminar catálogo de peliculas.')
        print('4. Salir.')
        opcion = int(input('Digite una opcion de menú (1-4): ')) # le damos a elegir la opcion de menu al usuario
    except Exception as e:
        print(f'Ocurrió un error de tipo: {e}')
        opcion = None # llevamos al menu al estado original
    else:
        print('Salimos del Programa')


from ManejoArchivos import ManejoArchivos
#MANEJO DE CONTEXTO WITH: sintaxis simplificada
#with open('prueba.txt', 'r', encoding='utf8') as archivo: 
#     print(archivo.read())

#No hace falta ni el try ni el finally
#En el contexto with lo que se ejecuta de manera automática son los metodos:
#__enter__: abre el recurso
#__exit__ : cierra el recurso 

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())

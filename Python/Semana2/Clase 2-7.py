archivo = open('Prueba.txr','r',
               encoding='utf8') #Las letras son: 'r' read, 'a' append, 'w' write, 'x'
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) #Continuamos con la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
    #print(linea): iteramos todos los elementos del archivo
print(archivo.readlines()[11]) #accedemos al archivo como si fuera una lista
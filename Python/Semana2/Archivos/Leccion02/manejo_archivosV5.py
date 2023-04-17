# Declaramos una variable

try:        # el metodo open puede llegar a arrojar una excepcion entonces lo hacemos dentro de un bloque try-catch
    archivo = open('prueba.txt', 'w', encoding='utf8')   # Declaramos una variable y  generamos el metodo open(), la w es de -write- nos va a permitir escribir informacion hacia el archivo. utf8 es para el juego de caracteres para los acentos.
    archivo.write('Progresamos con diferentestipos de archivos, ahora en -.txt- .\n')# Agregamos informacion al archivo con el metodo write
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Las letras son:\nr: "read" leer, \na: "append" anexa, \nw: "wrtite" escribe, \nx: crea un archivo')
    archivo.write('\nt: "text" especificamos el tipo de archivo con el cual vamos a trabajar')
    archivo.write('\nb: "binary" archivos tipo binario como imagenes, pdf, etc.')
    archivo.write('\nw+: "write and read" lee y escribe')
    archivo.write('\nr+: "read and write" al igual que la letra w+')
    archivo.write('\nCon esto terminamos.')

except Exception as e:     # capturamos lo que sea de tipo exception y lo renombramos a la letra e
    print(e)
finally:          # siempre se va a ejecutar
    archivo.close()           # cerramos el archivo aunque tenga un error

# Por default, en la primera ejecucion, se crea el archivo en caso de que no exista
# y se guarda dentro de la carpeta donde se este ejecutando el codigo.

# archivo.write('Todo quedó perfecto.')
# ValueError: I/O operation on closed file. ERROR - no podemos manipular un archivo ya cerrado.




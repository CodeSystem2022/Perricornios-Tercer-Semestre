# El método open puede arrojar alguna excepción
# se aconseja envolverlo en un bloque try except

#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w') # w -> write, podemos escribir información hacia el archivo
    # método open sirve para:
    # abrir un archivo existente
    # abrir un archivo inexistente (lo crea automatico)

    #vamos a agregar información al archivo con el método write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en .txt\n')
    archivo.write('Con esto terminamos.')

except Exception as e:
    print(e) #nos imprime el error

finally: #se ejecuta siempre
    archivo.close() #se cierra siempre el archivo aunque haya existido algun error
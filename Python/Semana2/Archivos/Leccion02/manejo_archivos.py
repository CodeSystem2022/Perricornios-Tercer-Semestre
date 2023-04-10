#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w') # w -> write, podemos escribir información hacia el archivo
    # método open sirve para
    # abrir un archivo existente
    # abrir un atrchivo inexistente (lo crea automatico)

    # El método open puede arrojar alguna excepción
    # se aconseja envolverlo en un bloque try except
except Exception as e:
    print(e) #nos imprime el error
finally: #se ejecuta siempre
    archivo.close() #se cierra siempre el archivo aunque haya existido algun error
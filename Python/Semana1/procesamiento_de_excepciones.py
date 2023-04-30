resultado = None
a = '10'
b = 0
try:
    resutado = a / b 

except ZeroDivisionError as e: #Que pasa si en lugar de un valor numerico, le asigno una cadena
    print(f'Ocurrio un error: {e}')

print('El resultado es: {resultado}')
print('El programa sigue funcionando')
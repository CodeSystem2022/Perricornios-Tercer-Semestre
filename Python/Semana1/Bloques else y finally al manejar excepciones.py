resultado = None

try:
    a = int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    resultado = a / b # Modificamos
except TypeError as e:
    print(f'Type error - ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'Type error - ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Type error - ocurrio un error: {type(e)}')
else:
    print('No se arrojo ninguna excepcion')
finally: # Siempre se va a ejecutar finally
    print('Ejecucion de este bloque finally')

print(f'El resultado es: {resultado}')
print('seguimos...')
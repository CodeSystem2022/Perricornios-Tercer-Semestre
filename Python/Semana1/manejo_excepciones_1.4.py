
resultado = None

try:
    a = int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    resultado = a / b #modificamos
except TypeError as e:
    print(f'TypeError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')

print(f'El resultado es: {resultado}')
print('seguimos...')
resultado = None
a = 10
b = 0

try:
    resultado = a / b 
except ZeroDivisionError as e:
    print(f'ZeroDivisionError Ocurrio un error : {type(e)}') # excepcion aritmetica por divicion de 0
except TypeError as e:
    print(f'TypeError Ocurrio un error : {e}') # excepcion de valor erroneo "caracter dividido por numero"
except Exception as e:
    print(f'Exception Ocurrio un error : {e}')

print(f'El resultado es {resultado}')
print(f'seguimos...')

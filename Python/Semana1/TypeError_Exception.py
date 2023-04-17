resultado=None
a="10"
b=0
try:
    resultado=a/b
except TypeError as e:
    print(f"Type Error-Ocurrio un error: {type(e)}")
print(f"El resultado es:{resultado}")
print("seguimos...")
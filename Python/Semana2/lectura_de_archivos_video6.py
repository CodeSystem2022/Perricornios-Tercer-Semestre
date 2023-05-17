archivo =  open('prueba.txt', 'r', encoding='utf8')#Las letras son: 'r' read, 'a' append, 'w' write,'x'
print(archivo.read())
print(archivo.read(16))
print(archivo.read(10))
print(archivo.readline())
print(archivo.readline())
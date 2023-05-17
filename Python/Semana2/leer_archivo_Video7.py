#para leer un archvio hay varios modos que podemos utilizar:
#1) el modo r por default
#abre un archivo para lectura y manda un error si el archivo no existe
#si el archivo esta en la misma carpeta en la cual estamos trabajando, no hace falta indicarle la ruta del archivo, de lo contrario sí. 
#se especifica archivo = open('c:\\usuario\nadia\tecnicaturaUTN2023\laboratorioIII\archivos\leccion2\prueba.txt')
archivo = open('prueba.txt', 'r', encoding='utf8')
#print(archivo.read())
#print(archivo.read(15)) #nos muestra los primeros caracteres de las primeras palabras
#print(archivo.read(10)) #continuamos desde la linea anterior
print(archivo.readline()) #lee la 1 linea
print(archivo.readline()) #lee la linea sig

import psycopg2 as bd #Renombramos e import para usar bd

#Creamos la variable para la conexion, ahora usamos bd.conect:
conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5432', database = 'test_bd') # podemos pasar una tupla, podemos tener varios parámetros y el ultimo parámetro que podemos pasar puede ser un diccionario


#MANEJO DE TRANSACCIONES: 
#Transaccion: ejecutar varias consultas en la bd. 
#En la transacción se ejecutan todos los query's de manera correcta, o ninguno se guarda en la bd (commit)
#Éstas modifican el estado de la bd (INSERT, DELETE, UPDATE)
#Se guardan unicamente cuando todos los cambios hayan sido exitosos
#Roleback: Dar marcha atras a los cambios

#Para observar el concepto de transacciones, no utilizamos el with conexion y lo hacemos de manera manual:

try:
    conexion.autocommit = False #Comprobamos el concepto de transacciones, para qe no se guarde de manera automática
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)' #La sentencia hacia la bd
    valores = ('María', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    print('Termina la transacción') 

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    #cerramos la conexion a la base de datos, tenemos abierto el objeto de tipo cursor
    conexion.close()


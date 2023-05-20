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
    # conexion.autocommit = False # esto no debe estar, le indicamos que no se guarde automaticamente
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparzaœmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() # Realizamos el commit manualmente
    print('Termina la transaccion')

except Exception as e:
    conexion.rollback()  # agregamos el rollback
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    #cerramos la conexion a la base de datos, tenemos abierto el objeto de tipo cursor
    conexion.close()


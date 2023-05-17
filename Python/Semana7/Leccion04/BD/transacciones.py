import psycopg2 as bd


conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)

print(conexion)

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
    conexion.close()


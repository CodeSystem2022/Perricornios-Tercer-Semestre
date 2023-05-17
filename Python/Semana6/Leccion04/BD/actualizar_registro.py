import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
                sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
                valores = ('Juan Carlos', 'Roldan', 'rcarlos@gmail.com', 1) # Es una tupla de tuplas
                cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia
                registros_insertados = cursor.rowcount
                print(f'Los registros insertados son: {registros_insertados}')

except Exception as e:
     print(f'Ocurrio un error: {e}')
finally:
     conexion.close()
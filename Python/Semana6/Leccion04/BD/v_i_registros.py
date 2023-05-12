import psycopg2 #para poder conectarnos a postgres
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Llinás', 'LinasMarcos@mail.com'),
                ('Marcelo', 'Cuenca', 'lacuencadeMarcelo@mail.com')
            ) # es una tupla de tuplas
            cursor.executemany(sentencia, valores) #de esta manera ejecutamos la sentencia
            # conexion.commit() esto se utiliza para guardar los cambios en la base de datos
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
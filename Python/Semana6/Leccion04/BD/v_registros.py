import psycopg2

conexion =psycopg2.connect(user='postgres', password="root", host='127.0.0.1', port='5432', database='test_db')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'select * from persona where id_persona in (1,2)'
            entrada = input('Digite los id persona a buscar (Separados por ,)')
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia)
            registros = cursor.fetchall()
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
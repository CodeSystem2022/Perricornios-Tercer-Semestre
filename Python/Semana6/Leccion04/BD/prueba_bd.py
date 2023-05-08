import psycopg2 #importamos para poder conectarnos a postgres

#Creamos la variable para la conexion
conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5432', database = 'test_bd') # podemos pasar una tupla, podemos tener varios parámetros y el ultimo parámetro que podemos pasar puede ser un diccionario

print(conexion) #vemos el objeto con la conexion creada exitosamente

try:
    with conexion:
        with conexion.cursor() as cursor: # con with cerramos el recurso del cursor

            #Creamos un cursor, objeto que permite ejecutar sentencias sql en postgres
            #cursor = conexion.cursor() #recuperamos el registro

            # Creamos la sentencia que queremos enviar
            sentencia = 'SELECT * FROM persona ORDER BY id_persona ASC' #cadena para la variable sentencia
            cursor.execute(sentencia) #ejecutamos la sentencia

            #vamos a recuperar los registros en una lista, donde cada registro es una tupla
            registros = cursor.fetchall() #método que recupera todos los registros de la sentencia ejecutada
            print(registros) #imprimimos los registros de la tabla persona
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    #cerramos la conexion a la base de datos, tenemos abierto el objeto de tipo cursor
    #cursor.close()
    conexion.close()

#Clase 5: Lunes 8 de mayo, sigue del archivo anterior
# Página de documentación : https://www.psycopg.org/docs/usage.html
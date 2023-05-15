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
            #sentencia = 'SELECT * FROM persona ORDER BY id_persona ASC' #cadena para la variable sentencia
            #sentencia = 'SELECT id_persona, nombre FROM persona ' #Especificamos de donde queremos obtener los datos (el * indica todo) con esta sentencia recuperamos el id y el nombre
            #sentencia = 'SELECT * FROM persona WHERE id_persona = 2'  #recupera los datos del id 1 
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' #Placeholder o parámetro posicional - (sustituye el código duro 1-2 por este parámetro que luego se reemplazara por una variable) 
            #id_persona = 2 #Definimos el parámetro que le pedimos en el placeholder 
            id_persona = input ('Ingrese un número para el id_persona que desea observar: ') #Le pedimos al usuario que ingrese el valor de lo que quiere ver 
            

            cursor.execute(sentencia, (id_persona,)) #ejecutamos la sentencia

            #vamos a recuperar los registros en una lista, donde cada registro es una tupla
            #registros = cursor.fetchall() #método que recupera todos los registros de la sentencia ejecutada
            registros = cursor.fetchone() #Método fetchone: Solo busca un registro, desaparece la lista y apunta a la tupla. 
            
            print(registros) #imprimimos los registros de la tabla persona
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    #cerramos la conexion a la base de datos, tenemos abierto el objeto de tipo cursor
    #cursor.close()
    conexion.close()

#Clase 5: Lunes 8 de mayo, sigue del archivo anterior
# Página de documentación : https://www.psycopg.org/docs/usage.html
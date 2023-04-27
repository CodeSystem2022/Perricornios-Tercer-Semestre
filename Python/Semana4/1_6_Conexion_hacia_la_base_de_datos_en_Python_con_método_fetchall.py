import psycopg2 ##Importamos la lib

conexion = psycopg2.connect( ## Definimos los datos de conexion
    user = 'postgres',
    password = 'admin',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_db'
)

cursor = conexion.cursor()
sentenciaSQL = 'SELECT * FROM pruebas' ## Creamos la querry
cursor.execute(sentenciaSQL) ## Ejecutamos la querry

registros = cursor.fetchall() ## Traemos los datos resultantes

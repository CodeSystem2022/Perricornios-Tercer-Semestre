# Manejo de contexto with: Sintaxis simplificada
# En el contexto with se ejecutan de manera automática
# los siguientes métodos:
# __enter__ (se abre el recurso)
# __exit__ (se cierra el recurso)

# abrimos el archivo prueba.txt en modo lectura
# con el juego de cacacteres que necesitamos y lo renombramos
with open('prueba.txt', 'r', encoding='utf8') as archivo:
    print(archivo.read())

# Context manager o administrador de recursos
# with abre el archivo de manera automática y también lo cierra
# sin necesidad de encerrarlo en un bloque try-except

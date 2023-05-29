import logging as log
# log = loggin -> también puede hacerse así

#esta va a ser la base para todos los demas archivos con el manejo de loggin
#Llamamos a una configuración básica

if __name__ == '__main__': #solo se ejecuta dentro de este archivo
    log.basicConfig(level=log.DEBUG) #se van a ejecutar todos los mensajes a continuación
    log.debug('Mensaje a nivel Debug')
    log.info('Mensaje a nivel Info')
    log.warning('Mensaje a nivel Warning')
    log.error('Mensaje a nivel Error')
    log.critical('Mensaje a nivel Critical')
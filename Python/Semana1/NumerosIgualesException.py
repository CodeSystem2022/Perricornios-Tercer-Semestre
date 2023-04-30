class NumerosIgualesException (Exception): # Extiende de la clase Exception
    def __init__(self, mensaje):
        self.messaje = mensaje

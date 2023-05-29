/*
*/
package test;

import accesodatos.*;

/**
Tipo Interface, obtenemos el comprotamiente¡o y obtenemos clases que adoptan este comportamiento
se ceran objetos de las clases que implementan el comportamineto de la interface
*/
public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql(); //instanciamos dese la clase que implementa el comportamiento de la interface
        datos.listar();
        
    }
}

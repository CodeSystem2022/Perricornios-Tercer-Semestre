
package paquete1;

import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        //ClaseHija2 claseH2 = new claseHija2();
        //claseHija2.atributoDefault = 'cambio desde la prueba';
        //System.out.println("claseH2 atributo default = " + claseH2.atributoDefault);
        
        //MODIFICADOR DE ACCESO PRIVATE NO APLICA EN CLASES
        //APLICA EN VARIABLES, ATRIBUTOS, MÉTODOS Y CONSTRUCTOR
        
        // Cuando lo usamos como modificador de acceso en atribtos,
        //no podemos modificar s valor desde otras clases.
        
        Clase4 clase4 = new Clase4("Público");
        System.out.println(clase4.getAtributoPrivate()); //vemos el valor inicial
        
        clase4.setAtributoPrivate("cambio");
        System.out.println("clase4 = " + clase4.getAtributoPrivate()); //vemos el cambio
    }
}

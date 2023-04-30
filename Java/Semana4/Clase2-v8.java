/*
Modificadores de acceso default o package.
Nivel 3 de restriccion.
Solo se puede utilizar desde dentro del mismo paquete.
Creamos un test dentro del mismo paquete.
 */
package paquete1;

/**
*/
class Clase2 extends Clase1{ //clase default o package, con la ausencia de modificador de acceso.
    String atributoDefault = "Valor del atributo default.";//atributo sin modificador por defaultç
    
    //creamos un contructor vacio
//    Clase2(){
//        System.out.println("Constructor Default.");
//    }
    
    //creamos un contructor public
    public Clase2(){
        super();
        this.atributoDefault = "Modificación del atributo default.";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();// llamamos al metodo default
    }
    
    //Método void
    void metodoDefault(){
        System.out.println("Método Default.");
    }
}

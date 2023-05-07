package test;
import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        imprimir(empleado1);
        //System.out.println("empleado1= "+ empleado1.obtenerDetalles());
        Gerente gerente1 = new Gerente ("Jose", 5000, "Sistemas");
        imprimir(gerente1);
        //System.out.println("gerente1= "+ gerente1.obtenerDetalles());
    
    }
    
    /* VIDEO 5 POLIMORFISMO: El principio del polimorfismo es tener m?todos m?s genericos
donde solo con el metodo imprmir, se puede imprimir informacion de varios
tipos de datos como aca de la clase padre y de la clase hija
Cuando hacemos la sobreescritura de metodos, si el de la clase padre esta en protected, 
en la clase hija el modificador de acceso no puede ser mas restrictivo:*/
    public static void imprimir(Empleado empleado) {
        System.out.println("Empleado= "+ empleado.obtenerDetalles());
    }
}

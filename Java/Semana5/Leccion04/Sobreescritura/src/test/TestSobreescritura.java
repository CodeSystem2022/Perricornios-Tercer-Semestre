
package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        //creamos un objeto de tipo Gerente
        Gerente gerente1 = new Gerente("José", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
        //Creamos un nuevo objeto de tipo Gerente
        System.out.println("Gerente 2");
        Gerente gerente2 = new Gerente("Alberto", 5000, "Desarrollo");
        System.out.println("gerente2 = " + gerente2.obtenerDetalles());
    }
}

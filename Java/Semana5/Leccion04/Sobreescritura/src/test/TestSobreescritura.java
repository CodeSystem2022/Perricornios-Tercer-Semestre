
package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        //creamos un objeto de tipo Gerente
        Gerente gerente1 = new Gerente("José", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}

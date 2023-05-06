package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("José", 5000, "Sistemas");

    }
    
    public static void determinarTipo(Empleado empleado) {
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}

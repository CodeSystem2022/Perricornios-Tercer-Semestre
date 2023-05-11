
package test;

import domain.*; //importamos todas las clases del paquete domain

//Instance of: Instancia de cierto tipo
public class TestInstanceOf {
    public static void main(String[] args) {
        //creamos un objeto de tipo Gerente
        //Gerente gerente1 = new Gerente("José", 5000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
 
        //POLIMORFISMO: MÚLTIPLES COMPORTAMIENTOS
        
        Empleado empleado1 = new Empleado("Jusn", 10000);
        determinarTipo(empleado1); //apunta a la clase padre
        
        empleado1 = new Gerente("José", 5000, "Sistemas");
        //determinarTipo(empleado1); //es de tipo Gerente
    }
    
    //una vez que identificamos de qué tipo es la variable, podemos convertir
    //una variable de tipo padre a una de tipo hija para volver a acceder a sus atributos
    
    //Instance of nos va a permitir preguntar de que tipo es la referencia
    //a la que apunta la variable
    public static void determinarTipo(Empleado empleado){
        //se recomienda empezar a preguntar por las clases más específicas(las hijas)
        //los últimos tipos son los más genéricos, hasta llegar a la clase Object (si fuese necesario)
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente"); //si es falso, no muestra nada
            //otra forma es convertirla a tipo Gerente
            Gerente gerente = (Gerente)empleado;
            //gerente.getDepartamento(); //llamamos al método de la clase Gerente
            //((Gerente) empleado).getDepartamento(); //hizo una conversión de tipo
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //se comenta porque genera error, no al compilar pero si al ejecutar
            //se muestra error de casteo en tiempo de ejecución
            //Gerente gerente = (Gerente)empleado;
            //gerente.getDepartamento(); //llamamos al método de la clase Gerente
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}

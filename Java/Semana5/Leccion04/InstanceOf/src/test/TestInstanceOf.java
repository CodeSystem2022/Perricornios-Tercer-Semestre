/*
--1.5 Instance of Parte 1 y 2--
package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("José", 5000, "Sistemas");
        determinarTipo(empleado1);
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
 */
package test;

import domain.*;

/**
 */
public class TestInstanceOf {
    public static void main(String[] args) { //metodo main
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1); //apunta al objeto de la clase padre
        //ClassCastException: error en tiempo de ejecucion
        empleado1 = new Gerente("José", 5000,"Sistemas"); // asignamos una nueva referencia a traves del metodo imprimir
        //determinarTipo(empleado1);
        
        
        
    }
    
    //InstanceOf - instancia de cierto tipo - determinar el tipo al cual apunta la memoria en tiempo de ejecucion
    
    //Definimos un metodo para determinarTipos
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            
            //accedemos al getDepartamento:
            //no se puede acceder al metodo Departameto directamente
            //el IDE nos ayuda a realizar una conversion de tipo:
            
            //empleado.getDepartamento(); - no es viable.
            
            //formato 1:
            
            //((Gerente) empleado).getDepartamento(); 
            //System.out.println("empleado = " + empleado);
            
            //formato 2:
            Gerente gerente = (Gerente)empleado; //convertimos a un tipo Gerente
            
            System.out.println("gerente = " + gerente.getDepartamento()); 
            
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //copiamos las lineas al tipo empleado: no da eror ya que el compilador detecta que el codigo es correcto
            //Gerente gerente = (Gerente)empleado; 
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
    
}



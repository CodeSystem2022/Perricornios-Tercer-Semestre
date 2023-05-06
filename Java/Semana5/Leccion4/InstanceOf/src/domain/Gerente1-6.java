/*
 Clase hija de Empleado
 */
package domain;

/**
*/
public class Gerente extends Empleado {
    private String departamento; //atributo string tipo private 
    
    //constructor de la clase hija
    public Gerente(String nombre, double sueldo, String departamento){
        //accedemos a los atributos de la clase padre y los llamamos a traves de super
        super(nombre, sueldo);
        //inicializamos el atributo departamento
        this.departamento = departamento;
        
        
    }
    
    //Sobreescribimos el método padre
    
    @Override //sobreescribimos un metodo de la clase padre
    public String obtenerDetalles(){ //identico a como figura en la clase padre
        return super.obtenerDetalles()+", Departamento: "+ this.departamento;
    }
 
    //Podemos convertir la variable de tipo padre de tipo hijo, para volver a 
    //tener acceso a los atributos o metodos de la clase hija.
    
    
    //1.6 Ejercicio con instanceof Parte 1 y 2:
    
    //Agregamos el Get & Set para el atributo Departamento

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
  
    
    
}

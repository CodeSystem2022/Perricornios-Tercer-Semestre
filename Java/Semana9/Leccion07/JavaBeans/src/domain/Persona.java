/*
//Manejo de JavaBeans: 
//Para que una clase se considere JavaBeans debe cumplir 
//ciertas caracteristicas, debe tener un constructor vacio y cada 
//atributo debe ser private, cada uno debe tener su metodo get y set 
//asociado utilizando el encapsulamienteo. A su vez integrar una 
//interface llamada serializable. Esta nos va a permitir enviar nuestra 
//clase entre diferentes equpos, diferentes servidores de java. 
//Va a ser importante que se implemente la interfaz de serializable. 
//Tiene mas usos pero al implemetar implement serializable lo va a 
//aplicar el servidor de java. Con cumplir ciertas caracteristicas 
//se va a considerar JavaBeans y con esto se acceden otras tecnologias 
//como java empresarial, framework y van a poder dar uso de estas clases. 
//De lo contrario las tecnologias no van a poder utilizar estas clases.
//La clase debe ser serializable ya que si es necesario transferir de un
//servidor a otro se debe de aplicar este concepto, basicamente convierte 
//nuestro objeto a ceros y unos.
*/
package domain;

import java.io.Serializable;


public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    
    
   //Constructor vacío: esto es obligatorio
    
   public Persona(){
       
   }
   //Constructor con parámetros
   public Persona(String nombre, String apellido){
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
   //Agregamos los Getters & Setters encapsulados: son reuqeridos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Complementos opcionales: toString, equals, hashCode
    
    //toString:
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
   
    
}

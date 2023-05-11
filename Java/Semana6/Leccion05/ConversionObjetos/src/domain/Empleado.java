
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    //Constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Método que vamos a sobreescribir en la clase hija
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
    
    //Métodos getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //se agrega el toString sobreescrito o heredado de la clase Object
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
}

package domain;
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Metodo para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", Sueldo: "+this.sueldo;
    }
    
    /* VIDEO 5 POLIMORFISMO    
Cuando hacemos la sobreescritura, si en la clase padre, 
el metodo esta marcado como protected, en la clase hija, no puede  
ser mas restrictivo:
    
    protected String obtenerDetalles(){
        return "Nombre: "+this.nombre+", Sueldo: "+this.sueldo;
    }
En este caso este método no funcionaria*/
    
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
}

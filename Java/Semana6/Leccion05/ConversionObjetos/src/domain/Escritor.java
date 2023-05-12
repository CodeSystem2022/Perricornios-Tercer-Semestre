
package domain;

//DOWNCASTING: Hacer el casteo desde la clase padre a la clase hija
//UPCASTING: Convertir una referencia de tipo hijo a tipo padre.

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Método para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }
    
    @Override
    public String toString(){
        return "Escritor{ " + "tipoEscritura=" + tipoEscritura + '}'+" " + super.toString();
    }
    
    //Método get
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}

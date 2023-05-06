
package domain;

public class Gerente extends Empleado{
    //declaramos los atributos como private, porque ya no extienden a mas clases hijas
    private String departamento;
    
    //Constructor: debemos pasar los atributos de la clase padre Empleado
    public Gerente(String nombre, double sueldo, String departamento){
        //accedemos a los atributos de la clase padre usando super() para llamar al constructor
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo
    @Override  //Override pertenece a las anotaciones de java
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento : "+ this.departamento;
    }
    
}


/* VIDEO 5 POLIMORFISMO PARTE 2-
Aca el método no podria ser más restrictivo que en la clase padre:
en el metodo obtener detalles no podriamos cambiar su modificador de acceso a private, porque eso es mas restrictivo:
    
    //protected String obtenerDetalles(){ //Si puede utilizarse la misma configuracion que en la clase padre como en este caso

@Override 
    private String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
Con este código saltaria el error

Sí se puede utilizar el mismo tipo de la clase padre: protected

@Override 
    protected String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;

Tambien se puede usar un método menos restrictivo: public 

@Override 
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;

*/
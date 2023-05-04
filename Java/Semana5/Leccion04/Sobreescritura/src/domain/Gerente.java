
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
    
}


package paquete1;

public class Clase1 {
    public String atributoPublic = "Valor atributo public"; //usamos el modif de acceso public a un atributo
    
    public Clase1 () {
        System.out.println("Constructor public"); //usamos el modificador public para un constructor 
    }
    
    public void metodoPublico(){ //metodo publico, no hay restricciones 
        System.out.println("Método public");
    }
}

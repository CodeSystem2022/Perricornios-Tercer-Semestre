
package paquete2;

public class Clase4 {
    //ATRIBUTO PRIVADO
    private String atributoPrivate = "atributo Privado"; //solo podremos accederlo por medio de métodos públicos get y set
 
    //CONSTRUCTOR PRIVADO
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    //Creamos un constructor public para poder crear objetos
    public Clase4(String argumento){ //acá se puede llamar al constructor vacío
        this();
        System.out.println("Constructor público");
    }
    
    //MÉTODO PRIVATE
    private void Clase4(){
        System.out.println("Método privado");
    }

    //Métodos Getter y Setter
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}

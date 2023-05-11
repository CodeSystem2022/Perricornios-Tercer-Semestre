
package domain;

public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripcion;
    
    //constructor
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Método get
    public String getDescripcion() {
        return this.descripcion;
    }
    
}

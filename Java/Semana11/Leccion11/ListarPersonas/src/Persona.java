public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0; //atributo estático
    
    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;//se incrementa desde el atributo de clase numeroPersonas
    }
    
    //Constructor con parámetros - Sobrecarga de constructores
    public Persona(String nombre, String tel, String email){
        //llamamos al constructor vacío
        this(); //por default lo hace automáticamente
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    
    
}

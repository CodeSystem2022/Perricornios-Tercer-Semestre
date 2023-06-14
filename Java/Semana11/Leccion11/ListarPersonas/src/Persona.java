public class Persona {
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0; //atributo estático
    
    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;//se incrementa desde el atributo de clase numeroPersonas
    }
}

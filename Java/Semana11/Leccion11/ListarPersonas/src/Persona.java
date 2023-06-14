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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public java.lang.String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "2617070701", "jperez@mail.com");
        System.out.println(persona1);
    }
}

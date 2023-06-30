package UTN.dominio;

public class Estudiante {
    //atributos privados
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    
    //Sobrecarga de constructores
    
    //Constructor vacio
    public Estudiante(){}//Para generar objetos de tipo estudiante con atributos null
    
    //Constructor para la llave primaria
    public Estudiante(int idEstudiante){
        this.idEstudiante = idEstudiante; //nos va aa permitir eliminar
    }
    
    //Constructor para insertar un nuevo estudiante
    public Estudiante(String nombre, String apellido, String telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    //Constructor para modificar un elemento en la base de datos
    public Estudiante(int idEstudiante, String nombre, String apellido, String telefono, String email){
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    //Métodos Getters & Setters

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Estudiante{" + 
               "idEstudiante=" + idEstudiante +
               ", nombre=" + nombre +
               ", apellido=" + apellido +
               ", telefono=" + telefono +
               ", email=" + email +
               '}';
    }
    
}

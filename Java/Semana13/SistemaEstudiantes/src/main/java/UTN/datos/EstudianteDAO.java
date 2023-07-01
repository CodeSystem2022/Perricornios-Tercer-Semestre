package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EstudianteDAO {
    //Método listar
    public List<Estudiante> listarEstudiantes() {

        //Creamos una lista de la clase Estudiante
        List<Estudiante> estudiantes = new ArrayList<>();

        //Creamos algunos objetos que son necesarios para comunicarnos con la bd
        PreparedStatement ps; //renombramos, sirve para preparar la sentencia sql
        ResultSet rs; //renombramos, permite almacenar el resultado obtenido de la bd

        //Creamos un objeto de tipo conexión
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY estudiantes2022";
        try { //Enviamos la consulta hacia la base de datos
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // recibimos la ejecucion del querry que estamos enviando
            while (rs.next()) { //mientras tengamos registros para iterar va a serguir operando
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiante2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiante.add(estudiante);

            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al seleccionar datos: " + e.getMessage());
        }
        finally {
            try {
                con.close()
            } catch (Exeption e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
            }
        }
        {//Fin finally
        return estudiantes;
    }//Fin metodo listar

    public static void main(String[] args) {
        //Listar los estudiantes
        var estudiantesDao = EstudianteDAO;
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudiantesDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Funcion lambda para imprimir

    }

        //Metodo por id -> find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //se encontro un registro
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("ocurrio un error al cerrar conexion"+e.getMessage());
            }//fin catch
        }//fin finally
        return false;

    }

    //Método agregar un nuevo estudiantes
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());

        } catch(Exception e){
            System.out.println("Ocurrio un error al agregar estudiante: " + e.getMessage());
        }
    }

    //Método para modificar estudiante:
    //Método para modificar estudiante- Parte13- Nadia
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        }//Fin catch
        finally{
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }//Fin catch 
        }//Fin finally
        return false;
    }//Fin método modificarEstudiante hasta aca video 13

    public static void main(String[] args) {
        
        //var estudianteDao = new EstudianteDAO(); la comento porque no esta en donde debe
        //Modificar estudiante - -video 14 Nadia
        var estudianteModificado = new Estudiante(1, "Juan Carlos", "Juarez", "5544663321", "juan@mail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if(modificado)
        System.out.println("Estudiante modificado: "+estudianteModificado);
        else
        System.out.println("No se modifico el estudiante: "+estudianteModificado);
        
        
        //Agregar estudiante
        //var nuevoEstudiante = new Estudiante("Carlos","Lara","5495544223", "carlosl@mail.com");
        //var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        //if(agregado)
        //    System.out.println("Estudiante agregado: " + nuevoEstudiante);
        //else
        //    System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);

        
        //Buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la busqueda"+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado){
            System.out.println("Estudiante encontrado"+ estudiante1);
        }else{
            System.out.println("No se encontro el estudiante: "+ estudiante1.getIdEstudiante());
        }
    }
}


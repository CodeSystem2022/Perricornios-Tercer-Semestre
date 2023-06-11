package accesodatos;

public class ImplementacionMySQL implements IAccessoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySQL");
    }
    
}

//una interface NO hereda de la clase Object
//puede heredar de otras interfaces
//La interfaz no tiene constructores
//al declarar los atributos hay que declarar un valor(constante)
//los métodos van a ser abstractos y públicos

package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10; //atributo constante, estático, publico y final
    
    //Método insertar: abstracto y sin cuerpo
    void insertar(); //no tiene {}
    void listar();
    void actualizar();
    void eliminar();
    //Son todos métodos tipicos al trabajar con base de datos
    
}

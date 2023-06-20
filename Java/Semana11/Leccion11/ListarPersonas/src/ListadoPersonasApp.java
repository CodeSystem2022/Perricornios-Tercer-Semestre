import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu(); //creamos un método
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch(Exception e){
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
            System.out.println();

        }//Fin del ciclo while
    }// Fin método main
    
    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("""
                           *******Listado de Personas*******
                           1. Agregar
                           2. Listar
                           3. Salir
                           """);
        System.out.print("Digite una de las opciones: ");
    }//Fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        
    }//Fin del metodo ejecutarOperacion

}//Fin de la clase ListadoPersonasApp


/*
 */
package test;

/*
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5); // llamamos al metodo desde el main
        imprimirNumeros(1, 2); // realizamos otro llamado, agregando los elemendos
        // el argumento variable debe ser el ultimo argumento del metodo
        variosParametros("Juan Esteban", "Colunga", 7, 5, 8);
    }
    
    // defiminmos otro elemento
    private static void variosParametros(String nombre, String apellido,  int ...numeros){  // el argumento variable debe ser el ultimo argumento del metodo con otros argumentos con otra funcion y mas parametros
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
    //    System.out.println("Apellido: " + apellido);
        imprimirNumeros(numeros);  // llamaos al metodo anterior con el nuevo parametro
    } 
    
    private static void imprimirNumeros(int ...numeros) { //tres puntos de argumento variable indefinidos, se va a convertir en un arreglo de tipo entero
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]); // concatenamos el arreglo con el iterador
        }
    }
}

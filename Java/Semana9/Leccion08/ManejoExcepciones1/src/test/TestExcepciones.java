package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) { //agregamos otro catch respetando la jerarquía de clases
            //van de menor a mayor: la de más jerarquía abajo y la de menor, arriba
            //la última es la más genérica
            System.out.println("Ocurrió un error de tipo: OperacionExcepcion"); //reportamos la excepci+on
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un Error: ");
            e.printStackTrace(System.out); //permite imprimir en consola la pila de excepciones
            System.out.println(e.getMessage());
        } finally { //el bloque finally siempre se va a ejecutars
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);
        //se ve el error ArithmeticException en tiempo de ejecución
        //como deriva de RuntimeException el error es de tipo uncheckException
    }
}

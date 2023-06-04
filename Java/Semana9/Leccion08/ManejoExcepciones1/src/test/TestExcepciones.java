
package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        //try{
            resultado = division(10, 0);
//        }catch(Exception e){
//            System.out.println("Ocurrió un Error: ");
//            e.printStackTrace(System.out); //permite imprimir en consola la pila de excepciones
//            System.out.println(e.getMessage());
//        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);
        //se ve el error ArithmeticException en tiempo de ejecución
        //como deriva de RuntimeException el error es de tipo uncheckException
    }
}



package test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        }catch(Exception e){
            System.out.println("Ocurrió un Error: ");
            e.printStackTrace(System.out); //permite imprimir en consola la pila de excepciones
        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);
        //se ve el error ArithmeticException en tiempo de ejecución
        //como deriva de RuntimeException el error es de tipo uncheckException
    }
}

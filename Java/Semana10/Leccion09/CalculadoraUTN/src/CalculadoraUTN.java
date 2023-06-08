
import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("******* aplicacion calculadora *******");

        //Mostramos el menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salír.
                """);
        System.out.print("operación a realizar?: ");
        var operacion = Integer.parseInt(entrada.nextLine());

        if(operacion >= 1 && operacion <= 4) {

            System.out.print("Digite el valor para el operando 1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite el valor para el operando 2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());

        }
    }
}

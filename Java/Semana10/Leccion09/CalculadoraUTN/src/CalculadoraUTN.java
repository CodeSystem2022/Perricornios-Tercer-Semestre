
import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("******* aplicacion calculadora *******");
        
        System.out.print("Digite el valor para el operando 1: ");
        var operando1 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Digite el valor para el operando 2: ");
        var operando2 = Integer.parseInt(entrada.nextLine());
        
        var resultado = operando1 + operando2;
        
        System.out.println("resultado = " + resultado);  
    }
}

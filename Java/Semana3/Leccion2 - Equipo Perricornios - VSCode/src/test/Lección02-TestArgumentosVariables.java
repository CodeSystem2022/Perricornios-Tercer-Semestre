package test;

public class TestArgumentosVariables {
    public static void main(String[] args){
       
    }
    
/*Vamos a empezar a ver los argumentos variables. Para ello ingresamos el tipo (int) + los ...  
Esto convierte la variable en un arreglo. La diferencia es que con los argumentos variables 
No necesitamos saber cuantos elementos van a pasar*/  
    
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) { /* i < numeros.length: el iterador menor a la longitud del arreglo que recibo */
            System.out.println("Elementos: "+numeros[i]);
            
        }
        
    }



}

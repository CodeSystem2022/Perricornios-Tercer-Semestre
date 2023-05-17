package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args){
        //Clases envolventes o Wrapper
        /*
        Clases envolventes de tipos primitivos
        int = la clase envolvente es Integer
        long = la clase envolvente es Long
        float = la clase envolvente es Float
        double = la clase envolvente es Double
        boolean = la clase envolvente es Boolean
        byte = la clase envolvente es Byte
        char = la clase envolvente es Character
        short = Short
        */ 

        int enteroPrim = 10; //Tipo primitivo
        System.out.println("EnteroPrim= "+ enteroPrim);
        Integer entero = 10;//Tipo objeto con la clase integer
        System.out.println("entero= "+ entero.doubleValue());

        int entero2 = entero; //Unboxing
        System.out.println("Entero2= "+ entero2);
    }
}

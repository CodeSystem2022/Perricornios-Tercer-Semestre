package domain

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //BLOQUE DE INICIALIZACIÓN ESTÁTICO
    //se ejecuta antes del constructor y también
    //antes de cualquier otro bloque no esttático
    //se ejecuta cuandop se carga la clase en memoria

    static{
        System.out.println("Ejecucuión del bloque esttático");
        ++Persona.contadorPersonas; //aumenta 1

        //idPersona = 10; NO se puede trabajar con atributos no estáticos
    }
}
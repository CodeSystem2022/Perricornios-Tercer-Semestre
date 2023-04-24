public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static{ //Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estatico un atributo, por esto tenemos un error
    }

    { //Bloque de inicializacion no estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersonas++; //incremento el atributo
    }

    // LOS BLOQUES ESTATICOS SE EJECUTAN UNA VEZ SE CREA UN OBJETO DE ESTE TIPO DE CLASE
    //Ejemplo Persona persona1 = new Persona(); al crear persona 1 se ejecutarian los bloques anteriores
    // Una aplicacion mas avanzada seria por ejemplo que el bloque ejecute una consulta sql que podria
    // devolvernos los datos de la persona basandose en la id que se le asigna al crear el objeto
 
}
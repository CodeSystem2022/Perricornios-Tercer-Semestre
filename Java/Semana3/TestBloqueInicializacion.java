package test;
import domain.Persona;

public class TestBloqueInicializacion {

	public static void main(String[] args) {
		// creamos un objeto de la clase Persona
		Persona persona1 = new Persona();
		System.out.println("persona1 = " + persona1);
		
		Persona persona2 = new Persona();
		System.out.println("persona2 = " + persona2);
		
		// En ejecución se ve de la siguiente manera
		// Primero se ejecuta el bloque estático y SOLO UNA VEZ
		// Después sigue el contexto dinámico con el idPersona
		// Luego el constructor
		
	}

}

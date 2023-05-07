package test;
import enumeraciones.Dias;

public class TestEnumeraciones {
	public static void main(String[] args) {
		System.out.println("Dia 1: " + Dias.LUNES);		
		
		//llamamos al método
		indicarDiaSemana(Dias.LUNES); //Las enumeraciones se tratan como cadena
		//pero no se deben usar " ", se accede con el operador de punto .
		
		System.out.println("Dia 2: " + Dias.MARTES);
		indicarDiaSemana(Dias.MARTES);
	}
	
	// usamos la enum para pasar un parámetro
	// al método e indicar qué día de la semana es
	
	private static void indicarDiaSemana(Dias dias){
		switch(dias) {
			case LUNES:
				System.out.println("Primer día de la semana");
				break;
				
			case MARTES:
				System.out.println("Segundo día de la semana");
				break;
				
				//TAREA: Completar todos los días de la semana
				//y agregar opción por default
				
			case MIERCOLES:
				System.out.println("Tercer día de la semana");
				break;
				
			case JUEVES:
				System.out.println("Cuarto día de la semana");
				break;
				
			case VIERNES:
				System.out.println("Quinto día de la semana");
				break;
				
			case SABADO:
				System.out.println("Sexto día de la semana");
				break;
			case DOMINGO:
				System.out.println("Último día de la semana");
				break;
				
			default:
				System.out.println("Igresaste un día NO VÁLIDO");
		}	
	}
}


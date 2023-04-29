package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
	public static void main(String[] args) {
		//System.out.println("Dia 1: " + Dias.LUNES);		
		
		//llamamos al método
		//indicarDiaSemana(Dias.LUNES); //Las enumeraciones se tratan como cadena
		//pero no se deben usar " ", se accede con el operador de punto .
		
		//System.out.println("Dia 2: " + Dias.MARTES);
		//indicarDiaSemana(Dias.MARTES);
		
		
		System.out.println("Continente N° 4: " + Continentes.AMERICA);
		System.out.println("Número de países en el 4° continente: " + Continentes.AMERICA.getPaises());
		System.out.println("Número de habitantes en el 4° continente: " + Continentes.AMERICA.getHabitantes());
		System.out.println("--------------------------------------");

		// TAREA: EJECUTAR TODOS LOS CONTINENTES CON SUS RESPECTIVA CANTIDAD DE HABITANTES
		// Y CHEQUEAR QUE LOS DATOS SEAN CORRECTOS

		//Fuente para cantidad habitantes:
		/*https://www.lasexta.com/tecnologia-tecnoxplora/ciencia/divulgacion/cuantas-personas-viven-cada-continente-cuales-son-paises-mas-poblados_202204256266b882d593ed0001a8b0a1.html */
		
		//Fuente para cantidad de paises:
		/*https://www.elespanol.com/curiosidades/paises/cuantos-paises-hay-mundo-numero/494701553_0.amp.html*/
	
		System.out.println("Continente N° 1: " + Continentes.AFRICA);
		System.out.println("Número de países en el 1° continente: " + Continentes.AFRICA.getPaises());
		System.out.println("Número de habitantes en el 1° continente: " + Continentes.AFRICA.getHabitantes());
		System.out.println("--------------------------------------");

		System.out.println("Continente N° 2: " + Continentes.EUROPA);
		System.out.println("Número de países en el 2° continente: " + Continentes.EUROPA.getPaises());
		System.out.println("Número de habitantes en el 2° continente: " + Continentes.EUROPA.getHabitantes());
		System.out.println("--------------------------------------");

		System.out.println("Continente N° 3: " + Continentes.ASIA);
		System.out.println("Número de países en el 3° continente: " + Continentes.ASIA.getPaises());
		System.out.println("Número de habitantes en el 3° continente: " + Continentes.ASIA.getHabitantes());
		System.out.println("--------------------------------------");

		System.out.println("Continente N° 5: " + Continentes.OCEANIA);
		System.out.println("Número de países en el 5° continente: " + Continentes.OCEANIA.getPaises());
		System.out.println("Número de habitantes en el 5° continente: " + Continentes.OCEANIA.getHabitantes());
		System.out.println("--------------------------------------");
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


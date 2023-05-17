package enumeraciones;

public enum Continentes { //lo convertimos en enum
	AFRICA(54, "1300 millones"),
	EUROPA(50, "750 millones"),
	ASIA(48, "4600 millones"),
	AMERICA(35, "1000 millones"),
	OCEANIA(14, "43 millones"); //podemos usar ;
	
	//Se agregan atributos y métodos para las enumeraciones
	//proporcionamos la cantidad de paises que tiene cada continente
	private final int paises;
	private String habitantes;
	
	
	//creamos el constructor para poder asociarlo a cada elemento de enum
	Continentes(int paises, String habitantes){
		this.paises = paises;
		this.habitantes = habitantes;
	}
	
	//Método Get
	public int getPaises() {
		return this.paises;
	}
	
	public String getHabitantes() {
		return this.habitantes;
	}
}

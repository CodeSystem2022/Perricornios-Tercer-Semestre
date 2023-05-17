package ar.com.system2023.mundopc;

public class Raton extends DispositivoEntrada{
	
	//atributos
	private final int idRaton; //cada objeto, su propio id
	private static int contadorRatones;
	
	//constructor
	public Raton(String tipoentrada, String marca) {
		super(tipoentrada, marca);
		this.idRaton = ++Raton.contadorRatones;
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", " + super.toString() + "]";
	}
	
	
}

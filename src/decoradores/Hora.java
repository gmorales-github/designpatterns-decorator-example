package decoradores;

import java.time.LocalTime;

import interfaces.Impresion;

public class Hora implements Impresion {

	private Impresion impresion;
	
	
	public Hora(Impresion impresion) {	
		this.impresion = impresion;
	}


	@Override
	public String imprimir() {
		
		return  impresion.imprimir() + " Hora Actual: " + LocalTime.now().withNano(0);
	}

}

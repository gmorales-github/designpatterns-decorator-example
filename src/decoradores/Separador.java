package decoradores;

import interfaces.Impresion;

public class Separador implements Impresion {

	private Impresion impresion;
	
	public Separador(Impresion impresion) {
		this.impresion = impresion;
	}
	@Override
	public String imprimir() {
		
		return impresion.imprimir() + "\n----------------------------------------------";
	}
	


}

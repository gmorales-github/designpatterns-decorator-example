package decoradores;

import interfaces.Impresion;

public class Vueltas implements Impresion {
	
	private Impresion impresion;
	private int cantidad = 0;
	
	public Vueltas (Impresion impresion) {
		
		this.impresion = impresion;
	}
	@Override
	public String imprimir() {
		
		cantidad++;
		return impresion.imprimir() + " #" + cantidad;
	}

}

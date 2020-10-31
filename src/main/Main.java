package main;


import components.ImpresionNombre;

import decoradores.*;

import interfaces.Impresion;


public class Main {
	
	

	public static void main(String[] args) {
		
		Impresion nombre = new ImpresionNombre();//Imprime el nombre
				  nombre = new Vueltas(nombre);//Imprime el nombre y la cantidad de vueltas
				  nombre = new Hora(nombre);//Imprime el nombre, cantidad de vueltas y la hora actual.
				  nombre = new Separador(nombre);//Imprime el nombre, cantidad de vueltas, la hora actual y un separador
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println(nombre.imprimir());
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	
	}	

}

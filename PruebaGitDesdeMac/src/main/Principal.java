package main;

public class Principal {
	
	static SumaNumeros sn;

	public static void main(String[] args) {
		System.out.println("Saludos desde MAC");
		//Desde windows
		System.out.println("Saludos desde WINDOWS:");
		//Fin windows
		System.out.println("Trabajando desde MAC");
		//Inicio WIndows
		System.out.println("Desde Windows");
		sn = new SumaNumeros(10, 12);
		System.out.println("La suma es: "+sn.sumar());
		
		//Fin windows
		
		

	}

}

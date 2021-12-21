package actividadesMetodos;

import java.util.Scanner;

public class MetodoAdicional3 {
	// Devuelve el precio tras sumarle un 21% de IVA
	public static double precioConIVA(double precio) {
		precio*=1.21;
		
		return precio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int precios;
		int preciosIntroducidos=1;
		
		//-------------------------------------------------------------------------------
		//Creamos un bucle para que repita los numeros necesarios
	do {
		
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduce tu precio");//Introducimos los precios necesarios
		precios = kb.nextInt();
		 preciosIntroducidos++;
		
		
		System.out.println("Tu precio es " + precioConIVA(precios) );// Y despues lo imprimimos por pantalla
	}while(preciosIntroducidos<=5);
		
	
	}

}

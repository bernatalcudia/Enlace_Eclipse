package actividadesArrays;

import java.util.Scanner;

public class Actividad1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Crea un array de 10 números enteros y rellénalo con valores que se pidan por
		teclado al usuario. Muestra posteriormente los valores introducidos.
		*/
		Scanner kb = new Scanner(System.in);
		
		
		int[] arrayint = new int[10] ;
		
		
			
		for(int cont=0;cont<arrayint.length;cont++) {
			System.out.println("Introduce un valor");
			arrayint[cont]  = kb.nextInt();
			
		}for(int z=0;z<arrayint.length;z++) {
			
			System.out.println("Tu posicion es : " + z + " = " + arrayint[z]);
		
		}
		
	}

}

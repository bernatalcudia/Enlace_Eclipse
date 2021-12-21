package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad2 {
	/**
	 * Aqui se calculara la media de los pares introducidos
	 */
	public static int mediaPares(int numeros []) {
		int sumaTotalPares=0;
		int contPares=0;
		for(int cont=0;cont<numeros.length;cont++) {
			if(cont%2==0) {
				sumaTotalPares+=numeros[cont];
				contPares++;
			}
		}
		return sumaTotalPares/contPares;
	}
	/**
	 * Aqui se calculara la media de los impares introducidos
	 */
	public static int mediaInpares(int numeros []) {
		int sumaTotalInPares=0;
		int contInPares=0;
		for(int cont=0;cont<numeros.length;cont++) {
			if(cont%2!=0) {
				sumaTotalInPares+=numeros[cont];
				contInPares++;
			}
		}
		return sumaTotalInPares/contInPares;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**2)	Diseñar un programa que pida al usuario que introduzca 10 números enteros, guardándolos en un array.
Una vez se hayan introducido los números en el array, el programa debe calcular y mostrar la media de los números en posición par y en posición impar por separado.
*/
		//Variables
		int []numerosEnteros = new int[10];
		int mediasPares=0;
		int mediasInpares=0;
		//--------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		for(int cont=0;cont<numerosEnteros.length;cont++) {
			System.out.println("Introduce el numero que desees:");
			numerosEnteros[cont] = kb.nextInt();
		}
		
		 mediasPares = mediaPares( numerosEnteros );
		mediasInpares = mediaInpares( numerosEnteros );
		System.out.println("La media de tus pares son:" + mediasPares);
		System.out.println("La media de tus inpares son:" + mediasInpares);
	}

}

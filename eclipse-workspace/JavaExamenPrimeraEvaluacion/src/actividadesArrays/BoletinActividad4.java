package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad4 {
	/**
	 *Con este metodo calcularemos el numero maximo del array 
	 * */
	public static int calcularMaximo(int numerosArray[]) {
		//La primera vez defineremos como elemento maximo y minimo el primer elemento de nuestra array.
		int maximo=numerosArray[0];
		//Dentro del bucle comprobaremos si el numero minimo es menor o mayor y si es mayor redefinirlo.
		for(int cont=0;cont<numerosArray.length;cont++) {
			if (numerosArray[cont]>maximo) {
				maximo =numerosArray[cont];
			}
		}
		return maximo;
	}
	/**
	 *Con este metodo calcularemos el numero minimo del array 
	 * */
	public static int calcularMinimo(int numerosArray[]) {
		int minimo=numerosArray[0];
		for(int cont=0;cont<numerosArray.length;cont++) {
			//Dentro del bucle comprobaremos si el numero minimo es menor o mayor y si es menor redefinirlo.
			if (numerosArray[cont]<minimo) {
				minimo =numerosArray[cont];
			}
		}
		return minimo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4)	Crea un programa que pida diez números reales por teclado, los almacene en
un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos
por pantalla.
		 */
		Scanner kb = new Scanner(System.in);

		//Variables
		int [] MaximoMinimo= new int [10];
		int maximo=0;
		int minimo=0;
		//--------------------------------------------------------------------
		for ( int cont=0;cont<MaximoMinimo.length;cont++) {
			System.out.println("Introduce el numero que desees: ");
			MaximoMinimo[cont] = kb.nextInt();

		}
		maximo = calcularMaximo(MaximoMinimo);
		minimo =calcularMinimo(MaximoMinimo);
		System.out.println("Tu numero maximo es :" + maximo);
		System.out.println("Tu numero minimo es :" + minimo);
	}

}

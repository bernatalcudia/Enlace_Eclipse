package actividadesArrays;

import java.util.Scanner;

public class ArrayEjercicio3Evaluable {
	/**Este metodo cambiara los valores de la array a otros 
	 * */
	public static int[] modificarArray(int vector []) {
		Scanner kb = new Scanner(System.in);
		int valoresNuevos=0;
		
		for(int cont=0;cont < vector.length;cont++) {
			System.out.println("Dame los nuevos valores");
			valoresNuevos = kb.nextInt();
			vector[cont] = valoresNuevos;
		}
		
		
		return vector;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Diseña un programa que contenga una función que dado un array como parámetro modifique sus valores en base a la siguiente tabla:
El array se pedirá al usuario y tendrá una longitud de 10 valores. Al finalizar el proceso, se mostrará el array original y en nuevo array generado con los cambios de valores
*/
		//Variables
		int arrayInicial[] = new int [10];
		int valoresIniciales=0;
		//-----------------------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		for(int cont=0;cont<arrayInicial.length;cont++) {
			System.out.println("Dame tus valores iniciales:" );
			 valoresIniciales = kb.nextInt();
			 arrayInicial[cont] = valoresIniciales;
			
		}
		int[] almacenarInicial = arrayInicial.clone();
		modificarArray(arrayInicial);
		//Esta es nuestra array inicial
		for(int cont=0;cont < almacenarInicial.length;cont++) {
			System.out.print(almacenarInicial[cont]);
		}
		System.out.println("");
		//Esta es nuestra array modificada
		for(int cont=0;cont < almacenarInicial.length;cont++) {
			System.out.print(arrayInicial[cont]);
		}
	}
	
}

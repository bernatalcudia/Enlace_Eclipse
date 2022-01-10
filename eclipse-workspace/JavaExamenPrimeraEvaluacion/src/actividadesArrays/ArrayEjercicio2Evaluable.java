package actividadesArrays;

import java.util.Scanner;

public class ArrayEjercicio2Evaluable {
	public static boolean esMayoritario(int[] vector) {
		boolean comprobacion=false;
		int contComprobacion=0;
		double longitudVector =  Math.ceil(vector.length/2);
		
		for(int cont1=0;cont1<vector.length;cont1++) {
			contComprobacion=0;
			for(int cont=0;cont<vector.length;cont++) {
				if(vector[cont1] == vector[cont] ) {
					contComprobacion++;
				}
			}
			if(contComprobacion>=longitudVector) {
				comprobacion=true;
				break;
			}
		}
		return comprobacion;
	}
	public static void main(String[] args) {
/*Se dice que un array de tamaño ‘n' es Mayoritario, si existe un elemento almacenado en el array que aparece en el más de n/2 veces.

	Escribe un programa que contenga una función que dado un array por parámetro determine si el mismo es Mayoritario o no. La cabecera de la función es:

	Public static boolean esMayoritario(int[] vector)

	El programa deberá llamar a la función y mostrar por pantalla si el array generado es mayoritario o no.

	El array deberá generarse recogiendo datos introducidos por el usuario.*/

		// TODO Auto-generated method stub
		//Variables
		int tamanoArray=0;
		int valorArray=0;
		
		//--------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Dame el tamaño de la array");
		tamanoArray = kb.nextInt();
		
		int [] arrayUsuario = new int[tamanoArray];
		
		
		for(int cont=0;cont<arrayUsuario.length;cont++) {
			System.out.println("Dame los valores de la array");
			valorArray = kb.nextInt();
			arrayUsuario[cont] = valorArray;
		}
		
		 boolean finalizacion = esMayoritario(arrayUsuario);
		 if(finalizacion==true) {
			 System.out.println("Es mayoritario");
		 }else {
			 System.out.println("No es mayoritario");
			 
		 }
	}

}

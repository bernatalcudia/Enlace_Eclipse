package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5)Crea un programa que pida dos valores enteros “N” y “M”, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla*/
		//Variables
		int n=0;
		int m=0;
		//--------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduce el valor de n");
		n = kb.nextInt();
		System.out.println("Introduce el valor de m");
		m = kb.nextInt();
		//En este caso n sera el tamaño de nuestra array y m el valor que tednra cada posicion de la misma.
		int [] arrayigual = new int [n];
		//Con este for recorremos y le añadimos el valor de m a la array.
		for(int cont=0;cont<arrayigual.length;cont++) {
			arrayigual[cont] = m;
			System.out.println("El valor del array " + cont + " = " + arrayigual[cont]);
		}
		
	}

}

package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6)	Crea un programa que pida dos valores enteros “P” y “Q”, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.*/
		//Variables
		int p=0;
		int q=0;
		int tamano=0;
		int cont=0;

		//-------------------------------------------------
		Scanner kb = new Scanner(System.in);

		System.out.println("Introduce el valor de p");
		p = kb.nextInt();
		System.out.println("Introduce el valor de q");
		q = kb.nextInt();
		tamano=q-p+1;
		int [] arrayPQ = new int [tamano];
		
		
			while(cont<arrayPQ.length) {
				for(;p<=q;p++) {
				arrayPQ[cont]=p;
				System.out.println("La posicion del array es " + cont + " y su valor es " + arrayPQ[cont]);
				cont++;
			}
		}
	}
}
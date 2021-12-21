package dam.bernat;

import java.util.Scanner;

public class B_Siendo_Mayor_A_Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		/*7.	Realiza un programa que pida dos números enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares.*/
		int b=0;
		int a=0;
		int contarPares=0;
		
		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce un numero");
		b = kb.nextInt();
		System.out.println("Introduce otro numero");
		a = kb.nextInt();
		
		if(b>a) {
			while(a<=b) {
				System.out.println(a);
				a++;
				if(a%2==0) {
					contarPares++;
				}
			}
		}else {
			System.out.println("B tiene que ser mayor Introduce otro numero");
		}
		System.out.println("Tu numero de pares es: " + contarPares);
	}
}
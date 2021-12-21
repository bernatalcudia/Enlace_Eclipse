package dam.bernat;

import java.util.Scanner;

public class NumeroAstericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.*/
		//Variables
		int numeroIntroducido=0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduce el numero que desees:");
		numeroIntroducido = kb.nextInt();
		
		if(numeroIntroducido<=0) {
			System.out.print("*");
			
		}for(int cont=1;cont<=numeroIntroducido;cont++) {
			System.out.print("*");
			
		}

	}

}

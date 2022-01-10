package actividadesArrays;

import java.util.Scanner;

public class ArrayEjercicio1Evaluable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa que recoja números introducidos por el usuario hasta que este introduzca un 0. Los números se irán guardando en dos arrays. Uno contendrá los números pares y el otro contendrá los números impares.

		Al finalizar la introducción de números se mostrará por pantalla el contenido de ambos arrays.
		*/
		
		//Variables
			int numerosIntroducidos=0;
			int contP=0;
			int contI=0; 
			int[] arrayPares =new int [45]  ;
			int[] arrayInPares= new int [45];
		//----------------------------------------------------------------------
	
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero");
			numerosIntroducidos = kb.nextInt();
			if(numerosIntroducidos%2==0) {
				arrayPares[contP] = numerosIntroducidos;
				contP++;
				
				
			}else {
				arrayInPares[contI] = numerosIntroducidos;
			
				contI++;	
				}
				
			
			
		}while(numerosIntroducidos!=0);
		
		for(int cont1=0;cont1<arrayPares.length;cont1++ ) {
			System.out.println("Tus numeros pares son :  "  + arrayPares[cont1] ); 
		}
		
		for(int cont2=0;cont2<arrayInPares.length;cont2++ ) {
			System.out.println("Tus numeros inpares son :  "  + arrayInPares[cont2] ); 
		}
	
		
		

	}

}

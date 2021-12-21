package dam.bernat;

import java.util.Scanner;

public class NumerosFallados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**3. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
		El total de números introducidos, excluido el 0.
		El total de números fallados.*/
		//Variables
		int contarFallos=0,numerosIntroducidos=0,contarNumeros=0,numerosIntroducidos2=0;
		
		Scanner kb = new Scanner (System.in);
		do {
			System.out.println("Introduce un numero:");
			numerosIntroducidos = kb.nextInt();
			System.out.println("Introduce otro numero:");
			numerosIntroducidos2 = kb.nextInt();
			
			
			

			
			if(numerosIntroducidos>numerosIntroducidos2) {
				int mayor=numerosIntroducidos;
				
				
			}if(numerosIntroducidos<numerosIntroducidos2){
				int mayor=numerosIntroducidos2;
			}else {
				System.out.println("Fallo el numero es menor ");
				contarFallos++;
			}
			contarNumeros+=2;
			
		}while(numerosIntroducidos > 0  && numerosIntroducidos2 > 0); 
			
		
		
		
		System.out.println("Total de numeros introducidos: " + contarNumeros);
		System.out.println("Total de  numeros fallados: " + contarFallos);
		
		
		
	}

}

package dam.bernat;

import java.util.Scanner;

public class esPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un numero primo es primo cuando es divisible por si mismo y entre 1.
		//Variables
		int contadorPrimo=0;
		Scanner kb = new  Scanner(System.in);

		System.out.println("Introduce un numero");
		 int numeroIntroducido = kb.nextInt();
		 
		 for( int contf=1;contf<=numeroIntroducido;contf++) {
			 if((numeroIntroducido % contf  ) ==0) {
				 contadorPrimo++;
				 
			 } 
		 }
		 if(contadorPrimo==2){
			 System.out.println("Tu numero " + numeroIntroducido + " Es primo");
		 }else {
			 System.out.println( "Tu numero " +numeroIntroducido +" No es primo ");
		 }
		
			 
		
	}

}

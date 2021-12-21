package actividadesMetodos;

import java.util.Scanner;

public class Actividad7Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIntroducido;
		Scanner kb = new Scanner(System.in);
		System.out.println(" Introduce el numero que desees :");
		numeroIntroducido = kb.nextInt();
		esPrimo(numeroIntroducido);

	}
	public static int esPrimo(int numeroMetodo) {
		int contadorPrimo=0;
		 for( int contf=1;contf<=numeroMetodo;contf++) {
			 if((numeroMetodo % contf  ) ==0) {
				 contadorPrimo++;
				 
			 } 
		 }
		 if(contadorPrimo==2){
			 System.out.println("Tu numero " + numeroMetodo + " Es primo");
		 }else {
			   System.out.println( "Tu numero " +numeroMetodo +" No es primo ");
		 }
		
		return numeroMetodo;
	}
}

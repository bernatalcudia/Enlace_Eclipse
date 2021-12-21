package dam.bernat;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int multiploIntroducido=0,numeroDeseado=0;
		int multiplos=0;

		Scanner kb = new  Scanner(System.in);
		
		System.out.println("Introduce el  numero del multiplo que quieras averiguar");
		 multiploIntroducido = kb.nextInt();
		System.out.println("Introduce el numero que desees");
		numeroDeseado = kb.nextInt();
		
		for(int cont=1;cont<=numeroDeseado;cont++) {
			if(cont%multiploIntroducido==0){
				multiplos++;
				
			}
		}
		System.out.println("Tus multiplos son " + multiplos);
	}

}

package dam.bernat;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		
		
		
		
		int numerointroducido=0;
		int resultado=1;
		
		Scanner kb = new  Scanner(System.in);
		 
		 System.out.println("Introduce un numero");
		 numerointroducido = kb.nextInt();
		 
		 
		 for(int contador=1; contador<=10; contador++) {
			 	resultado=numerointroducido * contador;
			 	
			 	System.out.println(" Tu resultado es "  + resultado);
			 
		 }
		 
		 			
		
		 			kb.close();
		 		}
		 		

	}



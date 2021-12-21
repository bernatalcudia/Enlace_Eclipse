package dam.bernat;
import java.util.Scanner;

public class IntercambiarValores {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	        int A, B, AUX;
	        System.out.print("Introduzca valor de A: ");
	        A = sc.nextInt();
	        System.out.print("Introduzca Valor de B: ");
	        B = sc.nextInt();
	        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
	        //instrucciones para hacer el intercambio
	        //se utiliza una variable auxiliar
	        AUX = A;
	        A = B;
	        B = AUX;      
	        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
	        
	        sc.close();
	    }
	
	 		


	}






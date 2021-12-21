package dam.bernat;
import java.util.Scanner;

//PRUEBAS PROGRAMACION	

public class Main {

	
	public static void main(String[] args) {
		int ni1=0;
		int ni2=0;
		int resultado=0;
		
		
		
		Scanner kb = new Scanner (System.in);
		
		
		System.out.println("*************************************************************");
		System.out.println("Introduce un numero");
		System.out.println("*************************************************************");
		ni1 = kb.nextInt();
		
		
		System.out.println("*************************************************************");
		System.out.println("Introduce un numero");
		System.out.println("*************************************************************");
		ni2 = kb.nextInt();
		
		resultado = ni1 + ni2;
		
		
		
		
		System.out.println("*************************************************************");
		System.out.println("Tu resultado es " +resultado);
		System.out.println("*************************************************************");
		
		
		
			kb.close();
	}

}

package dam.bernat;
import java.util.Scanner;

public class MayorOMenorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int Introduciredad=0;
		
		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce tu edad");
		Introduciredad = kb.nextInt();
		
		if (Introduciredad>=18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		kb.close(); 
	}














	;
}









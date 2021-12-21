package dam.bernat;
import java.util.Scanner;

public class DosValoresNumericosMayorYDividirlos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int num1,num2,resto;

		Scanner kb = new  Scanner(System.in);

		System.out.println("Introduce un numero");
		num1 = kb.nextInt();
		
		
		System.out.println("Introduce un numero");
		num2 = kb.nextInt();
		kb.close();
		
		if(num1>=num2) {
			System.out.println("El primer numero es el mayor");
			 resto = num1%num2;
			 
		}else {
			System.out.println("El segundo numero es el mayor");
			 resto = num2%num1;	
		}
		
		System.out.println("Tu resto es " + resto);
	}

}

package dam.bernat;

import java.util.Scanner;

public class SumaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num1,num2;
		int sumaMain=0;
		System.out.println("Dame un numero");
		num1 = kb.nextInt();
		System.out.println("Dame otro numero");
		num2 = kb.nextInt();
		sumaMain = realizarSuma(num1,num2);
		
		System.out.println("Tu suma es : " + sumaMain);

	}
	public static int realizarSuma(int num1a , int num2b) {
		
	int suma;
	
	
	   suma = num1a + num2b;
	 
	 return suma;
	}
}

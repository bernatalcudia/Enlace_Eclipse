package dam.bernat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Variables
		int numerointroducido1=0;
		int numerointroducido2=0;
		int operacionarealizar=0;
		int resultado;
		//---------------------------------------
		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce un numero");
		numerointroducido1 = kb.nextInt();
		System.out.println("Introduce otro numero");
		numerointroducido2 = kb.nextInt();
	
		System.out.println("-----------------------------------------------------------");
		System.out.println("Que operacion desea realizar: 1.Sumar || 2.Restar || 3.Dividir || 4.Multiplicar");
		System.out.println("-----------------------------------------------------------");
		operacionarealizar = kb.nextInt();
		
		switch(operacionarealizar)
		
		{
			case 1:
				
				resultado=numerointroducido1+numerointroducido2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Tu resultado es " + resultado);
				System.out.println("-----------------------------------------------------------");
				
				break;
			case 2:
				
				resultado=numerointroducido1-numerointroducido2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Tu resultado es " + resultado);
				System.out.println("-----------------------------------------------------------");
				
				break;
			case 3:
				resultado=numerointroducido1/numerointroducido2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Tu resultado es " + resultado);
				System.out.println("-----------------------------------------------------------");
				
				break;
			case 4:
				resultado=numerointroducido1*numerointroducido2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Tu resultado es " + resultado);
				System.out.println("-----------------------------------------------------------");
				break;
				
			
		}
		
		
		

	}

}

package actividadesMetodos;

import java.util.Scanner;

public class Actividad6Metodo {

	public static void main(String[] args) {
		
		/*6) Realizar una función que reciba el radio y la altura y calcule el área o el volumen de un cilindro, según se especifique. Para distinguir un caso de otro se le pasará: 
		• 1 para calcular el área. 
		• 2 para el volumen. 
		Realiza un programa que llame a la función e imprima el resultado por pantalla. Además, debe dar la opción de repetirlo hasta que el usuario quiera terminar con la ejecución de la aplicación
		*/
		int radioMain=0,alturaMain=0,operacionRealizar;
		Scanner kb = new Scanner(System.in);
		System.out.println(" Que operacion desea realizar? ");
		operacionRealizar = kb.nextInt();
		System.out.println("• 1 para calcular el área.");
		System.out.println("• 2 para el volumen.");
		System.out.println("• 3 para salir.");
		
		while(operacionRealizar>0) {
		switch(operacionRealizar) {
		case 1:
			areaCilinro(radioMain,alturaMain);
		case 2:
			volumenCilindro(radioMain,alturaMain);
		case 3:
			operacionRealizar=-1;
		default:
			System.out.println(" Tu operacion no es valida introduzca otra ");
			
		}
		}
		
	}

	public static int areaCilinro(int radioArea,int alturaArea) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println(" Introduce el radio");
		radioArea = kb.nextInt();
		System.out.println(" Introduce la altura");
		alturaArea = kb.nextInt();
		int resulArea=0;
		return resulArea;
	}
	public static int volumenCilindro(int radioVolumen, int alturaVolumen) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println(" Introduce el radio");
		radioVolumen = kb.nextInt();
		System.out.println(" Introduce la altura");
		alturaVolumen = kb.nextInt();
		int resulVolumen=0;
		return resulVolumen;
		
	}
	
}

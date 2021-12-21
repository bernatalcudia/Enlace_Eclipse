package actividadesMetodos;

import java.util.Scanner;

public class Actividad1Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int numeroIntroducido;
		Scanner kb = new Scanner(System.in);
		System.out.println("Dame un numero");
		numeroIntroducido=kb.nextInt();
		System.out.println("El resultado de tu numero es " + dobleNumero(numeroIntroducido));
		
		
	}
	
	public static int dobleNumero(int numero) {
		numero*=2;
		
		return numero;
	}

}

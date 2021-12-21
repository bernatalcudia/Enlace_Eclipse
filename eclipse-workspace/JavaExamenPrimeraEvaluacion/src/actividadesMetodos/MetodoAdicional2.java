package actividadesMetodos;

import java.util.Scanner;

public class MetodoAdicional2 {
	
	public static double millas_a_kilometros(int millas) {
		// Devuelve la conversión de millas a kilómetros
		double resul=1.60934*millas;
		
		return resul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int numeroMillas;
		
		//---------------------------------------------------------------------------------------
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduce el numero de millas:");
		numeroMillas = kb.nextInt();
		
		millas_a_kilometros(numeroMillas);
		System.out.println("Tus kilometros son " + millas_a_kilometros(numeroMillas));
	}

}

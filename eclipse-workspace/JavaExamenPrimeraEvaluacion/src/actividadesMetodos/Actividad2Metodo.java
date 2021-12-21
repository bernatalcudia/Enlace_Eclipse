package actividadesMetodos;

import java.util.Scanner;

public class Actividad2Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int numeroIntroducido,numeroIntroducido2;
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Dame un numero");
		numeroIntroducido=kb.nextInt();
		System.out.println("Dame otro numero");
		numeroIntroducido2=kb.nextInt();
		
		System.out.println("El resultado de tu numero es " + productoDosNumeros(numeroIntroducido,numeroIntroducido2));
		
		
	}
	
	public static int productoDosNumeros(int numero,int numero2) {
		int resultado=numero*numero2;
		
		
		return resultado;
	}

}

package actividadesMetodos;

import java.util.Scanner;

public class Actividad3Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		
		int numeroIntroducido,numeroIntroducido2;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Dame un numero");
		numeroIntroducido=kb.nextInt();
		System.out.println("Dame otro numero");
		numeroIntroducido2=kb.nextInt();
		
		System.out.println("El resultado de tu numero es " + numeroMayor(numeroIntroducido,numeroIntroducido2));
		
		
	}
	
	public static int numeroMayor(int numero,int numero2) {
		int mayor=0;
		
		if(numero>numero2) {
			mayor=numero;
			
		}else {
			mayor=numero2;
		}
		
		
		return mayor;
	}

	}



package actividadesMetodos;

import java.util.Scanner;

public class Actividad8Metodo {
	public static int numerosImparesSuma(int numeroIntroducido){
		
		int resul=0;
		for(int  cont=0;cont<=numeroIntroducido;cont++) {
			if(cont%2!=0 ) {
				 resul += cont;
			}
		}
		
		
		return numeroIntroducido = resul;
	}
	public static void main(String[] args) {

		/*8) Realiza una función que devuelva la suma de los “N” primeros números impares. 

		*/
		Scanner kb = new Scanner(System.in);
		int nNumerosImparesSuma;
		System.out.println(" Introduce el numero que desees calcular : ");
		nNumerosImparesSuma = kb.nextInt();
		System.out.println(" Tu resultado es  : " + numerosImparesSuma(nNumerosImparesSuma));
		
	}
	
}

package dam.bernat;
import java.util.Scanner;

public class Numerosnonulosnegativos {

	public static void main(String[] args) {
		
		//VARIABLES
		int numerointroducido=0;
		int numerosnegativos=0;
		int numerospositivos=0;

		Scanner kb = new  Scanner(System.in);


		for(int cont=1;cont<=10;cont ++) {

			System.out.println("Introduce un numero");
			numerointroducido = kb.nextInt();

			if(numerointroducido<0) {
				numerosnegativos++;
			}else if(numerointroducido>=0) {
				numerospositivos++;
			}
		}
		if(numerosnegativos > 0) {
			System.out.println("Hay números negativos");
		}
		System.out.println("La cantidad de numeros introducidos son 10.\nLa cantidad de numeros positivos son " + numerospositivos +".\nLa cantidad de numeros negativos son " + numerosnegativos + ".");	
	}
}
package dam.bernat;

import java.util.Scanner;

public class RepetirCadaLineaSuValor {

	public static void main(String[] args) {
		/**6. Realiza un programa que pida un número entero N entre 0 y 20
 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, 
repitiendo cada número tantas veces como su valor.
**/
		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce un numero");
		int valorIntroducido= kb.nextInt();
		
		for(int contnumeros=0;contnumeros<=valorIntroducido;contnumeros++) {
			System.out.println("");
			for(int contvalores=0;contvalores<contnumeros;contvalores++) {
				System.out.print(contnumeros);
			}
		}
	}

}

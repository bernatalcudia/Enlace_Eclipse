package dam.bernat;
import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//Programa que comprueba si eres o no mayor de edad.
				//Variables
				int numerointroducido=0;


				Scanner kb = new Scanner (System.in);

				//Introducimos el numero que deseemos para comprobarlo.
				System.out.println("*************************************************************");
				System.out.println("Introduce el numero que desees");
				System.out.println("*************************************************************");
				numerointroducido = kb.nextInt();

				//Comprobamos si es positivo o negativo.
				if(numerointroducido>=0) {
					System.out.println("*************************************************************");
					System.out.println("Tu numero es positivo");
					System.out.println("*************************************************************");

				}else {


					System.out.println("*************************************************************");
					System.out.println("Tu numero es negativo");
					System.out.println("*************************************************************");
				}

				kb.close();
			}
	}



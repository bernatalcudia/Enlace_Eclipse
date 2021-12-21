package dam.bernat;
import java.util.Scanner;
public class FactorialNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int numerointroducido=0;
		int resultado=0;

		Scanner kb = new  Scanner(System.in);

		System.out.println("Introduce un numero");
		numerointroducido = kb.nextInt();

		for(int contador=1; contador<numerointroducido; contador++) {

			resultado =contador * numerointroducido;

			kb.close();
		}

		System.out.println("El factorial de tu " + numerointroducido+ " es "+ resultado); 

	}	

}

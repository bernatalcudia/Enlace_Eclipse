package dam.bernat;
import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numUsuario,aleatorio;

		Random Rand = new Random();

		aleatorio = (int) (Rand.nextDouble()*100);
		do 	{
			Scanner kb= new Scanner(System.in);
			System.out.println("Introduceme un numero:");
			numUsuario = kb.nextInt();

			if(numUsuario>aleatorio) {
				System.out.println("Introduceme un numero menor:");

			}if(numUsuario<aleatorio){
				System.out.println("Introduceme un numero mayor:");
			}if(numUsuario==aleatorio){
				System.out.println("Has acertado:");
			}
			

		}while(numUsuario!=aleatorio);

	}

}

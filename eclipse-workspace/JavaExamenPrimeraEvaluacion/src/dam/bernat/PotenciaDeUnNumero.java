package dam.bernat;
import java.util.Scanner;

public class PotenciaDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables

		int numerointroducido=0;
		int potencia=0;
		int resultado=1;

		Scanner kb = new  Scanner(System.in);

		System.out.println("Introduce un numero");
		numerointroducido = kb.nextInt();
		System.out.println("Introduce la potencia de tu numero");
		potencia = kb.nextInt();

		while(potencia!=0){
			resultado =resultado * numerointroducido;
			potencia--;

		}





		System.out.println("Tu numero base es " + numerointroducido+ " y tu potencia es "+potencia+ " y tu resultado es "+ resultado); 
		kb.close();
	}

}

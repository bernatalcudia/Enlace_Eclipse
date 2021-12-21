package dam.bernat;
import java.util.Scanner;

public class CalcularIndiceMasaCorporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso,altura,imc;
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduzca tu peso porfavor");
		peso = kb.nextInt();
		System.out.println("Introduzca tu altura porfavor");
		altura = kb.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("Tu indice de masa corporal es " + imc);
		
		kb.close();
	}

}

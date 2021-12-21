package dam.bernat;
import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Calificacion;

		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce tu nota");
		Calificacion = kb.nextInt();

		switch(Calificacion)
		{

		case 0:
		case 1:
		case 2:
			System.out.println("Tu nota es muy deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Tu nota es Insuficiente");
			break;
		case 5:
			System.out.println("Tu nota es Bien");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Tu nota es notable");
			break;
		case 9:
		case 10:
			System.out.println("Tu nota es Sobresaliente");
			break;
		default:
			System.out.println("Introduce otra nota");
			break;
		}
	}

}

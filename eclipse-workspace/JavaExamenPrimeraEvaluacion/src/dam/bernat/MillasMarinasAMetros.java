package dam.bernat;
import java.util.Scanner;

public class MillasMarinasAMetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int millasmarinas,metros;

		Scanner kb = new Scanner (System.in);

		//Introducimos la edad por pantalla y la almacenamos en su respectiva variable.
		System.out.println("*************************************************************");
		System.out.println("Introduce las millas marinas");
		System.out.println("*************************************************************");
		millasmarinas = kb.nextInt();

		metros = millasmarinas *1852;





		System.out.println("*************************************************************");
		System.out.println("Tus millas marinas son : " + metros);
		System.out.println("*************************************************************");


		kb.close();

	}

}

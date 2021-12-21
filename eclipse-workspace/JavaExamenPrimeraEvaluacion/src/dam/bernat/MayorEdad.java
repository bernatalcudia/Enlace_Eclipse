package dam.bernat;
import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que comprueba si eres o no mayor de edad.
		//Variables
		int edad=0;


		Scanner kb = new Scanner (System.in);

		//Introducimos la edad por pantalla y la almacenamos en su respectiva variable.
		System.out.println("*************************************************************");
		System.out.println("Introduce tu edad");
		System.out.println("*************************************************************");
		edad = kb.nextInt();

		//Comprobamos que la edad sea mayor de 18 o no y le decimos al usuario si lo es.
		if(edad>=18) {
			System.out.println("*************************************************************");
			System.out.println("Eres mayor de  edad");
			System.out.println("*************************************************************");

		}else {


			System.out.println("*************************************************************");
			System.out.println("Eres menor de  edad");
			System.out.println("*************************************************************");
		}

		kb.close();
	}


}




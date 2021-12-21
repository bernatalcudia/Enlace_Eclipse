package dam.bernat;
import java.util.Scanner;

public class PrecioViajeAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables 

		int alumnos=0;
		int precioviaje=0;


		Scanner kb = new Scanner(System.in);



		System.out.println("*************************************************************");
		System.out.println("Cuantos alumnos son");
		System.out.println("*************************************************************");
		alumnos = kb.nextInt();


		if(alumnos>=100){
			precioviaje = alumnos*65;

			System.out.println("*************************************************************");
			System.out.println("El precio de tu viaje es " + precioviaje);
			System.out.println("*************************************************************");


		} else if(alumnos>=50 && alumnos<=99){
			precioviaje = alumnos*70;

			System.out.println("*************************************************************");
			System.out.println("El precio de tu viaje es " + precioviaje);
			System.out.println("*************************************************************");


		} else if(alumnos>=30 && alumnos<=49){
			precioviaje = alumnos*95;

			System.out.println("*************************************************************");
			System.out.println("El precio de tu viaje es " + precioviaje);
			System.out.println("*************************************************************");

		} else if(alumnos<30){
			precioviaje = 4000;

			System.out.println("*************************************************************");
			System.out.println("El precio de tu viaje es " + precioviaje);
			System.out.println("*************************************************************");



		}else {
			System.out.println("*************************************************************");
			System.out.println("Introduce otro numero de alumnos");
			System.out.println("*************************************************************");

		}


	}

}

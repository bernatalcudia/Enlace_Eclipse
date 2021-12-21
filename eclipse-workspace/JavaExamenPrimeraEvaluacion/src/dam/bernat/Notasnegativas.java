package dam.bernat;
import java.util.Scanner;

public class Notasnegativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas,sobresalientes=0;

		Scanner kb = new Scanner (System.in);

		//Introducimos las notas que necesitemos.
		System.out.println("*************************************************************");
		System.out.println("Introduce las notas que necesites");
		System.out.println("*************************************************************");
		notas = kb.nextInt();
		while(notas!=-1) {
			//Introducimos las notas que necesitemos.
			System.out.println("*************************************************************");
			System.out.println("Introduce las notas que necesites");
			System.out.println("*************************************************************");
			notas = kb.nextInt();
			if(notas<0){
				System.out.println("*************************************************************");
				System.out.println("Esta nota no es valida");
				System.out.println("*************************************************************");
				if(notas==10){
					sobresalientes++;
					//Introducimos las notas que necesitemos.
					System.out.println("*************************************************************");
					System.out.println("Hubo algun sobresaliente");
					System.out.println("*************************************************************");
				}if(sobresalientes<1){

					//Introducimos las notas que necesitemos.
					System.out.println("*************************************************************");
					System.out.println("No hubo ningun sobresaliente");
					System.out.println("*************************************************************");
				}
			}
		}
	}
}

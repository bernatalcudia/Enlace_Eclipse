package dam.bernat;
import java.util.Scanner;

public class metodosvarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primero definimos las variables para proceder con el calculo de las respectivas areas.
		int ni=0;
		int base=0,altura=0;
		int apotemam=0,perimetrom=0;
		int radio=0;
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Que area deseas calcular?");
		System.out.println("1. Rectangulo || 2. Triangulo || 3. Circulo || 4. Hexagono");
		System.out.println("*************************************************************");
		ni = kb.nextInt();
		//Cuando el usuario a introducido el numero correspondiente para calcular su area el programa lo analiza y depende del numero ejectuta un metodo o otro.
		while (ni>0) {
			if 	(ni==1) {
				arectangulo(base,altura);

			}if (ni==2)  {
				atriangulo(base,altura);

			}if (ni==3) {
				acirculo(radio);

			}if (ni==4) {
				ahexagono(apotemam,perimetrom);
			}


		}


	}


	public static void ahexagono(int apotema,int perimetro) {
		// TODO Auto-generated method stub
		//Despues que el usuario introduzca el perimetro y el apotema realizamos la operacion para calcular el area.
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce el perimetro por favor");
		System.out.println("*************************************************************");
		perimetro = kb.nextInt();

		System.out.println("*************************************************************");
		System.out.println("Introduce  el apotema por favor");
		System.out.println("*************************************************************");
		apotema = kb.nextInt();

		int resul = (perimetro * apotema) / 2;

		System.out.println("*************************************************************");
		System.out.println("Tu area es :" + " " + resul);
		System.out.println("*************************************************************");

	}

	public static void acirculo(int radio) {
		// TODO Auto-generated method stub
		//En este caso el usuario nos introduce el radio para calcular su area.
		double resul=0;
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce el radio por favor");
		System.out.println("*************************************************************");
		radio = kb.nextInt();

		resul = (radio * radio) * Math.PI;

		System.out.println("*************************************************************");
		System.out.println("Tu area es :" + " " + resul);
		System.out.println("*************************************************************");


	}

	public static void atriangulo(int b,int al) {
		// TODO Auto-generated method stub

		//En este caso el usuario introduce tanto la base como la altura para calcular su  respectiva area.

		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce la base por favor");
		System.out.println("*************************************************************");
		b = kb.nextInt();

		System.out.println("*************************************************************");
		System.out.println("Introduce la altura por favor");
		System.out.println("*************************************************************");
		al = kb.nextInt();
		int resul = (b * al)/2;


		System.out.println("*************************************************************");
		System.out.println("Tu area es :" + " " + resul);
		System.out.println("*************************************************************");

	}

	public static void arectangulo(int b,int al) {
		// TODO Auto-generated method stub

		//En este caso el usuario introduce tanto la base como la altura para calcular su  respectiva area.

		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce la base por favor");
		System.out.println("*************************************************************");
		b = kb.nextInt();

		System.out.println("*************************************************************");
		System.out.println("Introduce la altura por favor");
		System.out.println("*************************************************************");
		al = kb.nextInt();
		int resul = b * al;

		System.out.println("*************************************************************");
		System.out.println("Tu area es :" + " " + resul);
		System.out.println("*************************************************************");




	}


}

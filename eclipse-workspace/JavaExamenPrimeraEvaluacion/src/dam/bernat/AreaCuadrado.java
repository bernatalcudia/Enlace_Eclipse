package dam.bernat;
import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area =0;
		int lado=0;

		lado = ClaseEscaner.escanear("Introduce el valor del lado");

		System.out.println("a: " + lado);
		area = lado*lado;

		System.out.println("*************************************************************");
		System.out.println("TU area es " + area);
		System.out.println("*************************************************************");
	}

}

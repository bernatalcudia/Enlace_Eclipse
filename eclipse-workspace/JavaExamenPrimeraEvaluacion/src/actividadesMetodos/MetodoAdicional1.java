package actividadesMetodos;

import java.util.Scanner;

public class MetodoAdicional1 {
	//Metodos
	public static boolean MayorEdad( int numeroMetodo) {
		//Comprobamos el valor introducido
		if(numeroMetodo>=18) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int numero;
		//-------------------------------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Introduce un  numero ");
		numero = kb.nextInt();//Introducimos un valor
		//Lo enviamos al metodo
		if (MayorEdad(numero)==true) {
			System.out.println("Eres mayor de edad ");
		}else {
			System.out.println("Eres menor de edad ");
		}
	}
}
package dam.bernat;
import java.util.Scanner;
public class Saludo {

	public static void main(String[] args) {
	
		//**************************'
		//Variables
		String nombre="";//Como es un nombre sera String porque es una cadena de texto
		//***************************
		
		//Indicarle al usuario que introduzca su nombre y la funcion Scanner leera sus valores
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce tu nombre");
		System.out.println("*************************************************************");
		nombre = kb.nextLine();//Se guardara en la varible nombre.
		
		
		
		System.out.println("*************************************************************");
		System.out.println("hola buenos dias " + nombre);//Con el System.out se lo imprimimos al usuario.
		System.out.println("*************************************************************");
		
		
		
					kb.close();
	}

}

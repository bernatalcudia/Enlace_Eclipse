package dam.bernat;

import java.util.Scanner;

public class Ejemplo_CajaDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Variables(Main)
		String cadena;
		System.out.print("Introduce una cadena de texto: ");
		cadena = sc.nextLine();
		System.out.println(cajaTexto(cadena)); //Llamada al metodo
		
		
		
		
	}
			//Metodos
	public static String cajaTexto(String texto) {
		//Variables(Metodos)
		 String resultado="";
		int tex = texto.length();//Longitud del texto
		for(int i=0; i < tex +4 ; i++ ) {
			resultado +="#";
		}
		
		resultado +="\n#" + texto +"#\n" ;
		
		for(int i=0; i < tex +4 ; i++ ) {
			resultado +="#";
		}
		return  resultado;
	}
		
}

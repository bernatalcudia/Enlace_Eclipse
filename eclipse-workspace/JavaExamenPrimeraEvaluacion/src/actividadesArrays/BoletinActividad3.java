package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad3 {
	/**
	 *En este metodo calcularemos la nota media de los alumnos introducidos. 
	 * 
	  */
	public static float mediaNotas(float [] notas) {
		float mediaGrupo=0;
		
		for(int cont=0;cont<notas.length;cont++) {
			
			 mediaGrupo+=notas[cont];
			
		}
		return mediaGrupo/notas.length;
	}
	
	/**
	 *En este metodo calcularemos los alumnos que superan la media de los alumnos introducidos. 
	 * 
	  */
	public static float notasAlumnosSuperiores(float [] notas) {
		float alumnosNotas=0;
		
		for(int cont=0;cont<notas.length;cont++) {
			if(mediaNotas(notas)<notas[cont]) {
				 alumnosNotas++;
			}
			
			
		}
		return alumnosNotas;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3)	Diseñar un programa que pida al usuario que introduzca las notas de programación de los alumnos de la clase, guardando estas en un array.
Posteriormente a la inserción el programa debe calcular y mostrar la nota media del grupo.
Además, también mostrar los alumnos con notas superiores a la media.
*/
		//Variables
		float[] notasAlumnos = new float[5];
		//--------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		for(int cont=0;cont<notasAlumnos.length;cont++) {
			System.out.println("Introduce tu notas :");
			notasAlumnos[cont] = kb.nextInt();
			
		}
		
		System.out.println("La media del grupo es : " + mediaNotas(notasAlumnos));
		System.out.println("Los alumnos con notas superiores a la media son : " + notasAlumnosSuperiores(notasAlumnos));
	}

}

package dam.bernat;

import java.util.Scanner;

public class CincoAlumnosMedia {

	public static void main(String[] args) {
		//Variables
		int Edad,mediaEdad = 0,mayorEdad=0,masUnoSetentayCinco=0,totalEdad=0;
		double Altura,mediaEstatura =0,totalAltura = 0;
		//+++++++++++++++++++++++++++++++++++++++++++++++
		Scanner kb = new  Scanner(System.in);
		
		
		
		for(int cont=1;cont<=5;cont++) {
			 System.out.println("Introduzca la edad del alumno");
			 Edad = kb.nextInt();
			 System.out.println("Introduzca la altura del alumno");
			 Altura = kb.nextDouble();
			 totalEdad=totalEdad+Edad;
			 totalAltura=totalAltura+Altura;
			 mediaEdad=totalEdad/5;
			 mediaEstatura=totalAltura/5;
			 
			 if(Edad<=18){
				 mayorEdad++;
			if(Altura<1.75){
				masUnoSetentayCinco++;
			}
			 }
		}
		
		 System.out.print("/lnLos alumnos mayor de edad son " + mayorEdad + " los que son mas altos de uno setenta y cinco son " + masUnoSetentayCinco+ " La media de edad es " + mediaEdad + " la media de estatura es " +  mediaEstatura );
	}
}

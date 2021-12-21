package actividadesArrays;

import java.util.Scanner;

public class BoletinActividad1 {
	public static float media( float [] temperaturas) {//En este programa el usuario despues de introducir las temperaturas en el main calculara sus medias (negativas y positivas)
		Scanner kb = new Scanner(System.in);
		float sumaPositivas=0;
		float sumaNegativas=0;
		
		int opcion=0;
		
		for (int cont=0;cont<temperaturas.length;cont++) {
			
			if (temperaturas[cont] >0) {
				sumaPositivas+=temperaturas[cont];
				
				
			}else {
				sumaNegativas+=temperaturas[cont];
				
				
			}
		}
		System.out.println("Que temperatura desea ");//El usuario decide la media deseada
		System.out.println("1-Positiva||2-Negativa ");
		opcion = kb.nextInt();
		
		if(opcion==1) {
			return sumaPositivas/temperaturas.length;
		}else {
			return sumaNegativas/temperaturas.length;
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Diseñar un programa que pida al usuario que introduzca 10 temperaturas enteras, guardándolas en un array.
Posteriormente, después de haber introducido todas las temperaturas, el programa debe calcular e imprimir por pantalla la media de las temperaturas negativas y la media de las temperaturas positivas.
*/			
		
		//Variables
		float[] temperaturas = new float[10];
		float temp=0;
		//------------------------------------------------------------------
		Scanner kb = new Scanner(System.in);
		
		for (int cont=0;cont<temperaturas.length;cont++) {//Con este bucle el usuario introduce sus temperaturas.
			System.out.println("Introduce una temperatura");
			 temperaturas[cont] =kb.nextFloat();
		}
		temp = media(temperaturas);
		System.out.println("Tus temperaturas son:" + temp);
	}

}

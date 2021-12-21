package actividadesMetodos;

import java.util.Scanner;

public class MetodoAdicional4 {
	
	 public static int suma1aN(int numeroSuma) {// Devuelve la suma de enteros de 1 a n
		 int resul=0;
		for(int cont=1;cont<=numeroSuma;cont++) {
				resul  +=cont;
		}
		 
		 return resul;
	}
	
	
	
	 public static int producto1aN(int numeroProductos) { // Devuelve el producto de enteros de 1 a n
		int resul=1;
		 for(int cont=1;cont<=numeroProductos;cont++) {
			 
				resul*=cont;
			}
		 
		 return resul;
	}
	
	 public static double intermedio1aN(int numeroPromedio) {// Devuelve el valor intermedio entre 1 y n
		 int contNumeros=0;

		 for(int cont=1;cont<=numeroPromedio;cont++) {
				contNumeros++;
			}
		 
		return suma1aN(numeroPromedio)/contNumeros;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int numeroFinal=1;
		//---------------------------------------------------------------
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduce tu numero final");
		numeroFinal = kb.nextInt();
		
		System.out.println("Tu resultado es " + suma1aN(numeroFinal));
		System.out.println("Tu resultado es " + producto1aN(numeroFinal));
		System.out.println("Tu resultado es " + intermedio1aN(numeroFinal));

	}

}
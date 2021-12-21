package dam.bernat;

import java.util.Scanner;

public class contarCifras {

	public static void main(String[] args) {
	int contarcifras=0;
		
		Scanner kb= new Scanner(System.in);
		System.out.println("Introduceme un numero:");
		  int  num = kb.nextInt();
		  
		  while(num>0) {
			  num =num/10;
			  contarcifras++;
		  }
		  System.out.println("Tu numero de cifras es:" + contarcifras);   		
}
}
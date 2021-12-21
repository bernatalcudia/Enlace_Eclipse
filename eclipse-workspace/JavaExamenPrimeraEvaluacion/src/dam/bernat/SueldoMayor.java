package dam.bernat;

import java.util.Scanner;

public class SueldoMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sueldos=0;
	int sueldoMayor=0;
	
	Scanner kb = new  Scanner(System.in);
	System.out.println("Introduce tus sueldos ");
	sueldos = kb.nextInt();

		while(sueldos>0) {
			if(sueldos>=sueldoMayor) {
				sueldoMayor=sueldos;
			}
			
		if(sueldos<sueldoMayor) {
			System.out.println("Este sueldo es menor");
			
		}
		
		System.out.println("Introduce tus sueldos ");
		sueldos = kb.nextInt();
		
		
		}
		System.out.println("Tu sueldo mayor es " + sueldoMayor);

	}

}

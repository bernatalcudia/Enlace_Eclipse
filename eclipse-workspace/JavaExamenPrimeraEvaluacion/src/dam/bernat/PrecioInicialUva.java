package dam.bernat;
import java.util.Scanner;

public class PrecioInicialUva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//**************************
		//Variables
		int preciouva;
		int ni1;

		//**************************

		Scanner kb = new  Scanner(System.in);

		System.out.println("*************************************************************");
		System.out.println("Que precio tiene la uva inicalmente");
		System.out.println("*************************************************************");
		preciouva = kb.nextInt();

		System.out.println("*************************************************************");
		System.out.println("Que tipo deseas 1-A 2-B");
		System.out.println("*************************************************************");
		ni1 = kb.nextInt();
	
		while(ni1>0) {
			
		
		if(ni1==1){
			int tam;

			System.out.println("*************************************************************");
			System.out.println("Que tamaño deseas 1 o 2");
			System.out.println("*************************************************************");
			tam = kb.nextInt();
			if(tam==1){
				preciouva=preciouva+20;
				System.out.println("*************************************************************");
				System.out.println("Tu precio final es: " + preciouva);
				System.out.println("*************************************************************");

			}if(tam==2){
				preciouva=preciouva+30;
				System.out.println("*************************************************************");
				System.out.println("Tu precio final es: " + preciouva);
				System.out.println("*************************************************************");
			
			}else {
				System.out.println("*************************************************************");
				System.out.println("Ese tamaño no existe introduce otro");
				System.out.println("*************************************************************");
				tam = kb.nextInt();	
			}


		}if(ni1==2){
			int tam;

			System.out.println("*************************************************************");
			System.out.println("Que tamaño deseas 1 o  2");
			System.out.println("*************************************************************");
			tam = kb.nextInt();
			if(tam==1){
				preciouva=preciouva-30;
				System.out.println("*************************************************************");
				System.out.println("Tu precio final es: " + preciouva);
				System.out.println("*************************************************************");

			}if(tam==2){
				preciouva=preciouva-50;
				System.out.println("*************************************************************");
				System.out.println("Tu precio final es: " + preciouva);
				System.out.println("*************************************************************");
			
			}else {
				System.out.println("*************************************************************");
				System.out.println("Ese tamaño no existe introduce otro");
				System.out.println("*************************************************************");
				tam = kb.nextInt();	
			}


		}else {

			System.out.println("*************************************************************");
			System.out.println("Que precio tiene la uva inicalmente");
			System.out.println("*************************************************************");
			preciouva = kb.nextInt();

			System.out.println("*************************************************************");
			System.out.println("Que tipo deseas 1-A 2-B");
			System.out.println("*************************************************************");
			ni1 = kb.nextInt();
		}
		}
		kb.close();

	}
}

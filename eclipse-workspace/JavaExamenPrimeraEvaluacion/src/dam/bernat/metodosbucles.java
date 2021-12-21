package dam.bernat;
import java.util.Scanner;

public class metodosbucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ni=0;
		int cont=0;
		int ni1=0;
		int ni2=0;
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Que ejercicio quieres visualizar?");
		System.out.println("1. While Mostrar Sumando || 2. Do While Mostrar Sumando || 3. For Sumando || 4. While Restando || 5. Do While Restando || 6. For Restando");
		System.out.println("*************************************************************");
		ni = kb.nextInt();


		if 	(ni==1) {
			wmostrars(cont);

		}if (ni==2)  {
			dwsm(ni1); 

		}if (ni==3) {
			fs(ni2);

		}if (ni==4) {
			wr(cont);
		}if (ni==5) {
			hacerDoWhileRestando(ni1);	
		}if (ni==6) {
			fr(ni1);

		}

		
	}

	public static void fr(int ni1) {
		// TODO Auto-generated method stub


		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce un 200 porfavor");
		System.out.println("*************************************************************");
		ni1 = kb.nextInt();

		for (int cont=100;cont<ni1;cont--) {
                    
                System.out.println("*************************************************************");
		System.out.println("Tus numeros son " + cont);
		System.out.println("*************************************************************");


		}

		
	}

	private static void hacerDoWhileRestando(int ni1) {
		// TODO Auto-generated method stub

		do { 

			ni1 = introduceUn(200);

			

		}while (ni1>100); {
			ni1--;
			System.out.println("Tus numeros son :" + " " + ni1 );


		}



	}

	private static void wr(int cont) {
		// TODO Auto-generated method stub

		while(cont>100) {
			cont++;
			System.out.println("Tus numeros son :" + " " + cont);
		}



	}

	private static void fs(int ni2) {
		// TODO Auto-generated method stub
		ni2 = introduceUn(200);

		

		for ( int cont=0;cont<ni2;cont++) {

		}


	}

	private static void dwsm(int ni1) {
		// TODO Auto-generated method stub
		ni1 = introduceUn(1);
		do { 
			ni1++;
			System.out.println("Tus numeros son :" + " " + ni1 );	
		}while (ni1<100);
	}

	public static void wmostrars(int cont) {
		// TODO Auto-generated method stub

		while(cont<100) {
			cont++;
			System.out.println("Tus numeros son :" + " " + cont);
		}

	} 
	
	public static int introduceUn(int numeroAIntro) {
		String texto = ("*************************************************************\nIntroduce un " + numeroAIntro + " por favor\n*************************************************************");
		int ni = ClaseEscaner.escanear(texto);
		return ni;
	}
}

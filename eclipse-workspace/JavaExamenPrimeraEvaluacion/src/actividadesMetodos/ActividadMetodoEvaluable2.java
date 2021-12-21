package actividadesMetodos;

import java.util.Scanner;



public class ActividadMetodoEvaluable2 {
	
	public static double consultarSaldo(double saldo) {//Metodo para comprobar el saldo en el valor correspondiente
		int metodoConsulta;
		Scanner kb = new Scanner(System.in);
		System.out.println("1:Euros||2:Dolares||3:Bitcoins");
		System.out.println("En que valor lo desea consultar");
		metodoConsulta = kb.nextInt();
		
		
		if(metodoConsulta==1) {
			return saldo;
		}
		if(metodoConsulta==2) {
			return saldo*1.13;
					
				}
		if(metodoConsulta==3) {
			return saldo*0.000024;
		}else {
			return saldo;
		}
		
		
	}
	
	public static double retirarDinero(double saldo,double saldoretirar) {//Metodo para retirar el dinero
		double saldototal=0;
		if(saldo<saldoretirar) {
			System.out.println("No se puede retirar tanto saldo");
		}else {
			 saldototal=saldo-saldoretirar;
			System.out.println("Saldo retirado");
		}
		
		
		return saldototal;
		
	}
	public static double ingresarDinero(double saldo,double dinero) {//Metodo para añadir dinero.
		saldo+=dinero;
		return saldo;
		
	}
	public static boolean validacionPin(int pin) {//Metodo para comprabar el pin correspondinete
		if(pin==1234) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un simulador de cajero automático. El cajero automático deberá permitir:

			.- Acceder al cajero (solamente se podrá acceder mediante la utilización de un pin válido (1234).
			.- Una vez dentro de la cuenta personal, el usuario tendrá un saldo de 5000€. A partir de ahí, el usuario podrá:
			.- Ingresar dinero
			.- Retirar dinero (solo se podrá retirar el saldo restante que haya en la cuenta).
			.- Consultar saldo (en euros, en dólares, en btc).
			.- Salir del cajero.

			Como en el ejercicio anterior, al final de cada operación, se le preguntará al usuario si quiere realizar otra acción o desea salir del programa.

			Para la realización del ejercicio hay que utilizar métodos. Como orientación se proponen los siguientes:

			-	loginValido
			-	ingresarDinero
			-	retirarDinero
			-	consultarSaldo*/
		
		//Variables
		int pin=0;
		double saldo=5000;
		int operacion=0;
		boolean correcto=false;
		//---------------------------------------------------
		Scanner kb = new Scanner(System.in);
		while(correcto==false) {
			
		
		System.out.println("Introduce tu pin");
		pin = kb.nextInt();
		correcto=validacionPin(pin);
		}
		do {
			System.out.println("1:Ingresar dinero:");
			System.out.println("2:Retirar dinero");
			System.out.println("3:Consultar saldo");
			System.out.println("4:Salir del cajero");
			System.out.println("Introduce la operacion a realizar");
			operacion = kb.nextInt();
			
			switch (operacion) 
			{
			case 1:
				double dinero=0;
				System.out.println(" Cuanto dinero desea ingresar:");
				dinero = kb.nextDouble();
				saldo = ingresarDinero(saldo,dinero);
				break;
			case 2:
				System.out.println(" Cuanto dinero desea retirar:");
				dinero = kb.nextDouble();
				 saldo = retirarDinero(saldo,dinero);
				break;
				
			case 3:
				 System.out.println(consultarSaldo(saldo));
				break;
			case 4:
				operacion=-1;
				break;
			}
			
		
		
		
		}while(operacion>0);
	}

}

package dam.bernat;

import java.util.Scanner;

public class ProgramaBilletes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   cantidadDinero,billetesQuinientos,billetesDoscinetos,billetesCien,billetesCincuenta,billetesVeinte,billetesDiez,billetesCinco;



		Scanner kb= new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" Introduceme una cantidad:");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		cantidadDinero = kb.nextInt();
		while(cantidadDinero>0) {
			
			if(cantidadDinero>=500){
				billetesQuinientos=cantidadDinero/500;
				billetesDoscinetos=0;
				billetesCien=0;
				billetesCincuenta=0;
				billetesVeinte=0;
				billetesDiez=0;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%500;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				}
			}
			if(cantidadDinero>=200){
				billetesQuinientos=0;
				billetesDoscinetos=cantidadDinero/200;
				billetesCien=0;
				billetesCincuenta=0;
				billetesVeinte=0;
				billetesDiez=0;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%200;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				}
			}
			if(cantidadDinero>=100){
				billetesQuinientos=0;
				billetesDoscinetos=0;
				billetesCien=cantidadDinero/100;
				billetesCincuenta=0;
				billetesVeinte=0;
				billetesDiez=0;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%100;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
			}
			}
			if(cantidadDinero>=50) {
				billetesQuinientos=0;
				billetesDoscinetos=0;
				billetesCien=0;
				billetesCincuenta=cantidadDinero/50;
				billetesVeinte=0;
				billetesDiez=0;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%50;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
						System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				}
				}
			if(cantidadDinero>=20) {
				billetesQuinientos=0;
				billetesDoscinetos=0;
				billetesCien=0;
				billetesCincuenta=0;
				billetesVeinte=cantidadDinero/20;
				billetesDiez=0;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%20;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
			}
			}
			if(cantidadDinero>=10) {
				billetesQuinientos=0;
				billetesDoscinetos=0;
				billetesCien=0;
				billetesCincuenta=0;
				billetesVeinte=0;
				billetesDiez=cantidadDinero/10;
				billetesCinco=0;
				cantidadDinero=cantidadDinero%10;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
			}
			}//Comprueba si es mayor a 5
			if(cantidadDinero>=5) {
				billetesQuinientos=0;
				billetesDoscinetos=0;
				billetesCien=0;
				billetesCincuenta=0;
				billetesVeinte=0;
				billetesDiez=0;
				billetesCinco=cantidadDinero/5;
				cantidadDinero=cantidadDinero%5;
				System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
				//Comprueba que ek resto no sea 0
				if(cantidadDinero==0) {
					System.out.println("La cantidad en billetes es " + " 500: " + billetesQuinientos + " 200: " +  billetesDoscinetos + " 100: " +billetesCien + " 50: " + billetesCincuenta + " 20: " +  billetesVeinte+ " 10: "+billetesDiez+ " 5: "+ billetesCinco);
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(" Introduceme una cantidad:");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			cantidadDinero = kb.nextInt();
			}
		}
}
}
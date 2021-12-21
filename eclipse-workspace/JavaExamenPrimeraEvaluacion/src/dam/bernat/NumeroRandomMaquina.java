package dam.bernat;

import java.util.Random;

public class NumeroRandomMaquina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroMenor=0,numeroMayor=100;
		int numeroMaquina;
		
		Random r = new Random();
		numeroMaquina = r.nextInt(numeroMayor-numeroMenor+1)+numeroMenor;
		System.out.println("Has ejecutado el programa adivina un numero");
		System.out.println("1-Es mayor | 2-Es Menor");
		
		
		if(numeroMaquina>numeroMayor){
			numeroMaquina=numeroMenor;
				
			
		}if(numeroMaquina<numeroMenor){
			numeroMaquina=numeroMayor;
			
		}if(numeroMaquina==numeroMaquina){
			
			
		}

		
		
		

	}

}

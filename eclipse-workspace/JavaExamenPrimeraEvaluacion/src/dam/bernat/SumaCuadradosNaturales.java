package dam.bernat;

public class SumaCuadradosNaturales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales.
		
		//Variables
		int resultado=0;
		
		for(int cont=1;cont<=5;cont++) {
			int contmulti = cont*cont;
			resultado+=contmulti;
			
		}
		
		System.out.println("Tu resultado es " + resultado);
		
		
	}

}

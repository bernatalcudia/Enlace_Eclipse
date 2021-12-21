package actividadesArrays;

public class Actividad5Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea un array que contenga los números del 1 al 100. Al finalizar, realiza la suma
										de todos los elementos del array y la media de estos.*/
		
		int [] numeros100 = new int [100];
		int sumatotal=0;
		
		for(int cont=0;cont<numeros100.length;cont++) {
			
			sumatotal+=cont;
		}
		System.out.println("La media total es: " + (sumatotal/numeros100.length));
	}

}

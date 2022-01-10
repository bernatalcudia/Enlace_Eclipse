package actividadesArrays;

public class ArrayEjercicio4Evaluable {
	/*
	 * Este metodo devolvera la suma de las matrices que se le pasen por parametro
	 * */
	public static void  sumarMatrices(int matriz1[][],int matriz2[][]) {
		
		for(int cont1=0;cont1 <matriz1.length;cont1++) {
			for(int cont2=0;cont2 <matriz1[cont1].length;cont2++) {
			int suma=matriz1[cont1][cont2] + matriz2[cont1][cont2];
			System.out.print(suma + " / ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa que calcule la suma de dos matrices A y B y muestre el resultado por pantalla. La suma de matrices se realizará desde una función que reciba las dos matrices por parámetro y devuelva la matriz suma al programa principal.
		NOTA: La suma de matrices se realiza sumando elemento a elemento. */
		
		//Variables
		int [][] matriz1 = {{5,10},{4,12}};
		int [][] matriz2 = {{6,7},{3,8}};
		//---------------------------------------------------
		sumarMatrices(matriz1,matriz2);
	}

}

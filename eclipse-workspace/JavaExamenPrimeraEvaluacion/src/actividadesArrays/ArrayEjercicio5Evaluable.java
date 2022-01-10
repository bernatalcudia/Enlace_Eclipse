package actividadesArrays;

public class ArrayEjercicio5Evaluable {
	/**
	 * Este metodo devolvera el orden inverso del vector introducido
	 * */
	public static String inverso(char vector[]) {
		String cadena="";
		for(int cont=vector.length -1;cont>=0;cont--) {
			 cadena +=vector[cont];
			
		}
		return cadena;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa que haga uso de una función que dado un String o Array de caracteres devuelva la cadena en orden inverso.*/
		//Variables
		String recogerinverso="";
		char[] letrasnombreape = {'b','e','r','n','a','t', ' ','a','l','c','u','d','i','a'} ;
		//------------------------------------------------
		
		 recogerinverso = inverso(letrasnombreape);
		 System.out.print(recogerinverso);
	}
 
}

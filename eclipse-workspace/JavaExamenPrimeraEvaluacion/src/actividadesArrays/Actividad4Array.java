package actividadesArrays;

public class Actividad4Array {
	
	public static int rellenararrays(int [] array ) {
		 int sumatotal=0;
		
		
		for (int x=0;x<array.length;x++) {
			  array[x] = (int) (Math.random()*100)+1;
			sumatotal+=array[x];
		}
		
		
		return sumatotal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int[] numeros = new int[10];
		
		suma = rellenararrays(  numeros);
		
		
		System.out.println("Tu suma de numeros aleatorios es:" + suma);
	}
	

}

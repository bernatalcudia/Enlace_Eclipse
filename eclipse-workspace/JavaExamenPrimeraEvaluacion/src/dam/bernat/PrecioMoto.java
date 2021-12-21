package dam.bernat;
import java.util.Scanner;

public class PrecioMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diadecompra;
		double preciomoto;

		Scanner kb = new  Scanner(System.in);
		System.out.println("Introduce el dia que la compraste ");
		System.out.println("1.Lunes || 2.Martes || 3.Miercoles || 4.Jueves || 5.Viernes || 6.Sabado || 7.Domingo");
		diadecompra = kb.nextInt();

		switch(diadecompra)
		{

		case 0:
		case 1:
		case 2:
			//Si es martes el decuento del 12%
			System.out.println("---------------------------------------------");
			System.out.println("Introduce el precio de tu moto");
			System.out.println("---------------------------------------------");
			preciomoto = kb.nextDouble();
			preciomoto = preciomoto*0.12;
			System.out.println("---------------------------------------------");
			System.out.println("El precio de tu moto es " + preciomoto);
			System.out.println("---------------------------------------------");
			break;
		case 3:
		case 4:
			//Si es jueves el decuento del 18%
			System.out.println("---------------------------------------------");
			System.out.println("Introduce el precio de tu moto");
			System.out.println("---------------------------------------------");
			preciomoto = kb.nextDouble();
			preciomoto = preciomoto*0.18;
			System.out.println("---------------------------------------------");
			System.out.println("El precio de tu moto es " + preciomoto);
			System.out.println("---------------------------------------------");
			break;
		case 5:
			break;
		case 6:
			//Si es sabado el decuento del 25%
			System.out.println("---------------------------------------------");
			System.out.println("Introduce el precio de tu moto");
			System.out.println("---------------------------------------------");
			preciomoto = kb.nextDouble();
			preciomoto = preciomoto*0.25;
			System.out.println("---------------------------------------------");
			System.out.println("El precio de tu moto es " + preciomoto);
			System.out.println("---------------------------------------------");
		}
	}

}
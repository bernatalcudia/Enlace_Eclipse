package dam.bernat;
import java.util.Scanner;

public class DescuentoRealizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioarticulo,precioreal,descuento;

		Scanner kb = new Scanner (System.in);

		System.out.println("*************************************************************");
		System.out.println("Introduce el precio de tu articulo");
		System.out.println("*************************************************************");
		precioarticulo = kb.nextDouble();

		System.out.println("*************************************************************");
		System.out.println("Introduce el precio real");
		System.out.println("*************************************************************");
		precioreal = kb.nextDouble();

		descuento = ((precioarticulo-precioreal)/precioarticulo)/100;





		System.out.println("*************************************************************");
		System.out.println("Tu descuento es:  " +  "%"  + descuento);
		System.out.println("*************************************************************");

		kb.close();
	}

}

package dam.bernat;
import java.util.Scanner;

public class AreaACalcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ni=0;
		int base=0;
		int alt=0;
		int lado=0;
		int radio=0;
		int area=0;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Que area deseas calcular?");
		System.out.println("1. Triangulo || 2. Cuadrado || 3. Circulo || 4. Rectangulo");
		System.out.println("*************************************************************");
		ni = kb.nextInt();
		
		switch(ni)
		{
		case 1:
			
			System.out.println("*************************************************************");
			System.out.println("Introduce la base :");
			System.out.println("*************************************************************");
			base = kb.nextInt();
			
			System.out.println("*************************************************************");
			System.out.println("Introduce la altura :");
			System.out.println("*************************************************************");
			alt = kb.nextInt();
			
			area = (base * alt)/2;
			
			
			System.out.println("*************************************************************");
			System.out.println("Tu area es :" + " " + area);
			System.out.println("*************************************************************");
			
			break;
		case 2:
			
			System.out.println("*************************************************************");
			System.out.println("Introduce el lado :");
			System.out.println("*************************************************************");
			lado = kb.nextInt();
			area = lado*lado;

			System.out.println("*************************************************************");
			System.out.println("TU area es " + area);
			System.out.println("*************************************************************");
			
			break;
		case 3:
			System.out.println("*************************************************************");
			System.out.println("Introduce el radio :");
			System.out.println("*************************************************************");
			radio = kb.nextInt();
			
			area = (int) ((radio * radio) * Math.PI);
			
			System.out.println("*************************************************************");
			System.out.println("Tu area es :" + " " + area);
			System.out.println("*************************************************************");
			break;
		case 4:
			
			System.out.println("*************************************************************");
			System.out.println("Introduce la base :");
			System.out.println("*************************************************************");
			base = kb.nextInt();
			
			System.out.println("*************************************************************");
			System.out.println("Introduce la altura :");
			System.out.println("*************************************************************");
			alt = kb.nextInt();
			
			 area = base * alt;
			
			System.out.println("*************************************************************");
			System.out.println("Tu area es :" + " " + area);
			System.out.println("*************************************************************");
			
			break;
		
		
		
		
		
		
		}

	}

}

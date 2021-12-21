package dam.bernat;
import java.util.Scanner;

public class Radio_Areas_Volumenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int longradio=0;
		int longcirc=0;
		int areacirculo=0;
		int volumenesfera=0;
		
		
		
		Scanner kb = new Scanner (System.in);
		System.out.println("*************************************************************");
		System.out.println("Introduce la longitud del radio");
		System.out.println("*************************************************************");
		longradio = kb.nextInt();
		
		longradio = longcirc;
		
		System.out.println("*************************************************************");
		System.out.println("Tu longitud del circulo es"+ longcirc);
		System.out.println("*************************************************************");
		longcirc = kb.nextInt();
		
		longradio = areacirculo;
		
		System.out.println("*************************************************************");
		System.out.println("El area de tu circulo es" + areacirculo);
		System.out.println("*************************************************************");
		areacirculo = kb.nextInt();
		
		longradio = volumenesfera;
		
		System.out.println("*************************************************************");
		System.out.println("El volumen de tu esfera es" + volumenesfera + "tu radio es" + longradio  );
		volumenesfera = kb.nextInt();
		
		
		
						kb.close();
	}

}

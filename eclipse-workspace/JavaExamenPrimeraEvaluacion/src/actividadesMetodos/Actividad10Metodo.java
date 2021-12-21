package actividadesMetodos;
import java.util.Scanner;

public class Actividad10Metodo {
	//bARAST=Funcion que realiza un rectangulo con asteriscos dependiendo de  la base y altura introducida.
	public static void bARAST(int base , int altura) {
		for(int cont1=1;altura>=cont1;cont1++) {
			System.out.println("");
			for(int cont2=1;base>=cont2;cont2++) {
				System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10) Escriba una función que dado dos números (base y altura), dibuje un rectángulo. 
			Ejemplo: base= 4 altura=2
		*/
		//Variables
		int baseMain=0,alturaMain=0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Introduce la base ");
		baseMain = kb.nextInt();
		System.out.println(" Introduce la altura ");
		alturaMain = kb.nextInt();
		
		bARAST(baseMain,alturaMain);
	}
}
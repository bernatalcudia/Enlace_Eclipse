package dam.bernat;
import java.util.Scanner;

public class OrdenAscendente  {
	//De menor a mayor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int num1=0;
		int num2=0;
		int num3=0;
		int mayor=0;
		int menor=0;
		int medio=0;

		Scanner kb = new  Scanner(System.in);

		System.out.println("Introduce un numero");
		num1 = kb.nextInt();
		System.out.println("Introduce un segundo numero");
		num2 = kb.nextInt();
		System.out.println("Introduce un tercer numero");
		num3 = kb.nextInt();

		if(num2>num3 && num2>num1) {
			mayor =  num2;

		}if(num1>num3 && num1>num2){
			mayor = num1;

		}if(num3>num1 && num3>num2) {
			mayor = num3;

		}if(num2<num3 && num2<num1){
			menor = num2;

		}if(num3<num1 && num3<num2){
			menor =num3;

		}if(num1<num3 && num1<num2 ){
			menor =num1;

		}if(num2<num3 && num2>num1 || num2>num3 && num2<num1){
			medio = num2;

		}if(num3<num1 && num3>num2 || num3>num1 && num3<num2){
			medio =num3;

		}if(num1<num3 && num1>num2 || num1>num3 && num1<num3){
			medio =num1;
		}



		System.out.println("El orden es " +menor + medio+    ""+ mayor);
		kb.close();
	}

}

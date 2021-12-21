package actividadesMetodos;

import java.util.Scanner;

public class ActividadMetodoEvaluable1 {
	
		public static int factorial(int numeroIntroducido) {
			int resul=1;
			for(int cont=1;cont<=numeroIntroducido;cont++) {
				resul*=cont;
				
			}
			return resul;
			
		}
		public static int signo(int numeroIntroducidoSigno) {
			int resul=0;
			
			if(numeroIntroducidoSigno>0) {
				resul =numeroIntroducidoSigno-numeroIntroducidoSigno-numeroIntroducidoSigno;
			}else {
				resul =numeroIntroducidoSigno+numeroIntroducidoSigno+numeroIntroducidoSigno;
				
				
			}
			
			return resul;
		}
		public static int minimoDosNumeros(int num1Func,int num2Func) {
			int resul=0;
			
			if(num1Func<num2Func) {
				resul =num1Func;
			}else {
				resul =num2Func;
			}
			
			return resul;
		}
		public static int maximoDosNumeros(int num1Func,int num2Func) {
			int resul=0;
			if(num1Func>num2Func) {
				resul =num1Func;
			}else {
				resul =num2Func;
			}
			
			return resul;
		}
		public static int elevarPotencia(int baseFunc,int exponenteFunc) {
			int resul=1;
			
			for(int cont=1;cont<=exponenteFunc;cont++) {
				resul*=baseFunc;
				
			}
			
			
			return resul;
		}
	
		
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 1:
			Escribe un programa USANDO MÉTODOS que realice las siguientes operaciones: 

			-	Cálculo del factorial de un número dado(Multiplicar acumulando)
			-	Cambiar número de signo
			-	Detectar el mínimo de dos números dados
			-	Detectar el máximo de dos números dados
			-	Elevar a la potencia dados el número y el exponente

			El programa se repetirá mientras el usuario no seleccione la opción 99 – SALIR.

	Al finalizar cada cálculo, el programa preguntará si desea realizar otro cálculo lo que volverá a mostrar el menú principal.*/
		
		int operacion=0;
		do {
			
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("¿Que operacion desea realizar?");
		System.out.println("1:Factorial");//Multiplicar acumulando
		System.out.println("2:Cambiar Signo");//Negativo o positivo
		System.out.println("3:Minimo de dos numeros");//Calculara el minimo de los dos numeros
		System.out.println("4:Maximo de dos numeros");//Calculara el maximo de los dos numeros
		System.out.println("5:Elevar potencia ");//Calculara el numero a la potencia elevada
		System.out.println("99:Salir");
		 operacion = kb.nextInt();
		
		
		 
			
			
		
		
		switch(operacion) 
		{
		case 1 :
			int numeroDado=0;
			System.out.println("Imtroduce un numero para el factorial");
			 numeroDado =  kb.nextInt();
			 System.out.println("Tu factorial es " + factorial(numeroDado) );
			
			break;
		case 2 :
			int numeroIntroducido=0;
			System.out.println("Introduce un numero para cambiarlo de signo");
			numeroIntroducido =  kb.nextInt();
			System.out.println("Aqui esta cambiado" + signo(numeroIntroducido));
			signo(numeroIntroducido);
			break;
		case 3 :
			int num1Mi=0,num2Mi=0;
			System.out.println("Introduce un numero");
			num1Mi =  kb.nextInt();
			System.out.println("Introduce otro numero");
			num2Mi =  kb.nextInt();
			minimoDosNumeros(num1Mi,num2Mi);
			System.out.println("El minimo de los dos numeros es " + minimoDosNumeros(num1Mi,num2Mi) );
			break;
		case 4 :
			int num1Ma=0,num2Ma=0;
			System.out.println("Introduce un numero");
			num1Ma =  kb.nextInt();
			System.out.println("Introduce otro numero");
			num2Ma =  kb.nextInt();
			maximoDosNumeros(num1Ma,num2Ma);
			System.out.println("El maximo de los dos numeros es " + maximoDosNumeros(num1Ma,num2Ma) );
			break;
		case 5 :
			int numeroBase,exponente;
			System.out.println("Introduce el numero base");
			numeroBase =  kb.nextInt();
			System.out.println("Introduce el exponente");
			exponente =  kb.nextInt();
			System.out.println("Tu resultado final es " + elevarPotencia(numeroBase,exponente)) ;
			elevarPotencia(numeroBase,exponente);
			break;
		case 99 :
			operacion=-1;
			break;
			
			default :
				System.out.println("Introduce otra operacion");
				break;
			
			
		
		 
		}
		}while(operacion>0);
		
	}

}

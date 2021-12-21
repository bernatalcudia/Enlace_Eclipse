package dam.bernat;

import java.util.Scanner;

public class sumaNprimos {

	public static void main(String[] args) {
		//suma de los n primeros números impares
		int num;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Introduzca un número entero positivo");
			num=sc.nextInt();
		}while(num<=0);
		imprimir_nimp(num);
	}
	
	public static void imprimir_nimp(int n)
	{
		int i, suma=1;
		for (i=1;i<=n;i++)
		{
			if (i%2!=0) //El problema es que no suma los impares soo los imprime  suma deberia ser suma = suma + i
			{
				System.out.println(i);
				suma=i++;
			}else{
				suma = i;
			}

		}
		System.out.println("suma:"+suma);
	}

}
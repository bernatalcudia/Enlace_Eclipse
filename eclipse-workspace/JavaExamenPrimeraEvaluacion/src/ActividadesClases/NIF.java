package ActividadesClases;

import java.util.Scanner;
/**
 * <blockquote><pre>
 *Esta es una clase java  para poder obtener el NIF de una persona. 
 *@version 1.0 
 *@author Bernat Alcudia Grimaldos 
 * @since 01/02/2022
 * </pre></blockquote>
 * */
/*Crea una clase NIF que represente el DNI con su correspondiente letra.
.- Los atributos de la clase serán el número de DNI y su letra.
Incluye, al menos, los siguientes métodos:
.- Un constructor por defecto.
.- Un constructor que reciba como parámetro el DNI y calcule y asigne la letra que le 
Xúquer Centre Educatiu. Unitat TIC.
DAM. Progamación
corresponde.
.- Un método leer(): que pida por teclado el número de DNI y calcule a partir del DNI
introducido la letra que le corresponde.
.- Método toString() que muestre el NIF de la siguiente forma: ocho dígitos, un guión y la
letra en mayúscula. Por ejemplo: 12345678-Z
.- Método para obtener la letra del NIF: La letra del NIF se calculará usando un método
privado. La forma de obtener la letra del NIF es la siguiente: Se obtiene el resto de la
división entera del número de DNI entre 23 y se usa la siguiente tabla para obtener la
letra que corresponde:
0→T; 1 →R; 2→W; 3→A; 4→G; 5→M; 6 → Y; 7 → F; 8 → P; 9 →D; 10 →X; 11 →B; 12
→N; 13 →J; 14 →Z; 15 →S; 16 → Q; 17 → V; 18 →H 19 → L;
20 → C; 21 → K; 22 → E
.- Una vez creada la clase, desde la clase Main, escribe un programa que pida al usuario
el número de su NIF y le devuelva el NIF completo.
.- NOTA: https://www.letranif.com/formula-para-calcular-la-letra-del-dni/
 * 
 * */
public class NIF {
	//Atributos
	private int numeroDni;
	private char letraDni;
	//Constructores
	public NIF() {
		
	}
	public NIF(int numeroDni) {
		this.numeroDni=numeroDni;
		this.letraDni= obtenerLetraNif(numeroDni);
	}
	//Metodos(Constructores)
	
		//Getters
	/**
	 *Con este get obtendremos el numero de dni de nuestra clase */
	public int getNumeroDni() {
		return this.numeroDni;
	}
	/**
	 *Con este get obtendremos la letra del dni de nuestra clase */
	public char getLetraDni() {
		return this.letraDni;
	}
		//Setters
	/**
	 *Con este set modificaremos el numero de dni  */
	public void setNumeroDni(int numeroDni) {
		this.numeroDni=numeroDni;
	}
	/**
	 *Con este set modificaremos la letra de dni */
	public void setLetraDni(char letraDni) {
		this.letraDni=letraDni;
	}
	//Metodos
	/**
	 *<h2>En este metodo pediremos al usuario su dni con el que calcularemos su letra correspondiente</h2>
	 *
	 *
	 *
	 * 
	 * 
	 * */
	public void leer() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Dame tu dni");
		this.numeroDni = kb.nextInt();
		obtenerLetraNif(numeroDni);
		kb.close();
	}
	/**
	 *<h2>En este metodo leeremos simplemente los atributos que tenemos en nuestro objeto</h2>
	 *
	 *@return
	 *Numero DNI + letra DNI
	 * */
	public String toString() {
		return "Tu numero de dni es "  +this.numeroDni + "-" + this.letraDni;
	}
	/**
	 *<h2>En este metodo pediremos al usuario su dni con el que calcularemos su letra correspondiente</h2>
	 *
	 *
	 * 
	 *@return Letra del NIF obtenida
	 * 
	 * */
	public char obtenerLetraNif(int numeroDni) {
		int resultado=numeroDni%23;
		char[] letrasNif = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'} ;
		this.letraDni=letrasNif[resultado];
		return letrasNif[resultado];
		
		}
	
}


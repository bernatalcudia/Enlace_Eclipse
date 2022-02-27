package ActividadesClases;
/*Biblioteca.
Para la realización de este ejercicio, necesitamos dos clases:
Clase Libro: Esta clase modelará el objeto libro que utilizaremos desde la clase Main.
Atributos:
- Id (int)
- ISBN (String).
- Titulo (String).
- Autor (String).
- Nº páginas (int).
- Temática (Char: (T)error, (C)iencia Ficción, (H)umor, (S)uspense 
- Estado (int. Solo podrá tomar dos valores: 0 – Disponible, 1 – Prestado). 
Métodos:
- Getters y Setters
Constructores:
- Constructor por defecto
- Constructor con todos los parámetros

A continuación, deberás mostrar un menú al usuario para que indique que opciones 
quiere realizar:

1.- Ver libros: Mostrará un listado de los títulos de los libros que tenemos en nuestra 
biblioteca.

2.- Solicitar préstamo de libro: Mostrará un listado de libros (mostrando id – título) y 
pedirá al usuario que indique qué libro es el que quiere llevarse.

3.- Realizar devolución de libro: Pedirá al usuario que introduzca el código del libro que 
quiere devolver para registrar la devolución.

4.- Recomendador de libros
 
5.- Salir
Las operaciones indicadas anteriormente se deben realizar mediante funciones dentro 
de la clase Main. Se indican las cabeceras de las funciones a realizar:

- Public void visualizarLibros(Libro[] listadoLibros) {…}
o Mostrará el listado de libros por pantalla (puede ser conveniente mostrar 
si el libro está disponible o reservado).

- Public boolean prestamoLibro(Libro[] listadoLibros, int idLibro) { … }
o Desde este método se realizará la reserva del libro pasado por parámetro. 
Si el libro está disponible, devolverá true si se ha realizado con éxito y 
false, en caso contrario.

- Public boolean devoluciónLibro(Libro[] listadoLibros, int idLibro) { …}
o Desde este método se realizará la devolución del libro pasado por 
parámetro. Si el libro está reservado, devolverá true una vez se realice la 
devolución y false, en caso contrario.

- Public Libro recomendadorLibro(Libro[] listadoLibros) { … }
o Desde este método realizarás dos preguntas en base a la temática 
preferida del usuario y a las ganas que tenga de leer (nos fijaremos en las 
páginas de los libros). También daremos una opción de recomendación al 
azar en la que devolveremos un título al azar de nuestra biblioteca. 
Devolveremos al main el objeto Libro para que desde allí se imprima el 
detalle del libro.

*/
public class Libro {
	//Constantes
	public static final char tematica_terror='t';
	public static final char tematica_ciencia='c';
	public static final char tematica_humor='h';
	public static final char tematica_suspense='s';
	
	public static final int prestado=0;
	public static final int disponible=1;
	
	//Atributos
	private int id;
	private String iSBN;
	private String titulo;
	private String autor;
	private int nPaginas;
	private char tematica;
	private int estado;
	//Constructores
	public Libro() {
		
	}
	public Libro(int Id,String ISBN,String Titulo,String Autor,int N_Paginas,char Tematica,int Estado) {
		this.id=Id;
		this.iSBN=ISBN;
		this.titulo=Titulo;
		this.autor=Autor;
		this.nPaginas=N_Paginas;
		this.tematica=Tematica;
		this.estado=Estado;
	}
	//Metodos(Constructores)
	
		//Getters
	public int  getId() {
		return this.id;
	}
	public String getISBN() {
		return this.iSBN;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getN_paginas() {
		return this.nPaginas;
	}
	public char getTematica() {
		return this.tematica;
	}
	public int getEstado() {
		return this.estado;
	}
	
		//Setters
	public void  setId(int id) {
		this.id=id;
	}
	public void setISBN(String ISBN) {
		this.iSBN=ISBN;
	}
	public void setTitulo(String Titulo) {
		this.titulo=Titulo;
	}
	public void setAutor(String Autor) {
		this.autor=Autor;
	}
	public void setN_paginas(int N_Paginas) {
		this.nPaginas=N_Paginas;
	}
	public void setTematica(char Tematica) {
		this.tematica=Tematica;
		
	}
	public void setEstado(int Estado) {
		this.estado=Estado;
	}
	
	
	//Metodos
	
	
}

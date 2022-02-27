package ActividadesClases;

/**
 * <blockquote><pre>
 *<h1>Esta es una clase java  para poder obtener las caracteristicas de un libro</h1>. 
 *@version 1.0 
 *@author Bernat Alcudia Grimaldos 
 * @since 01/02/2022
 * </pre></blockquote><p>
 * */
/*Crea una clase llamada Libro que guarde la información de cada uno de los libros de una
biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del
libro y número de ejemplares prestados.
La clase tendrá los siguientes métodos:
.- Constructor por defecto.
.- Constructor con parámetros.
.- Métodos Setters/getters
.- Método préstamo que incremente el atributo correspondiente cada vez que se realice
un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
.- Método devolución que decremente el atributo correspondiente cuando se produzca
la devolución de un libro. No se podrán devolver libros que no se hayan prestado.
Devuelve true si se ha podido realizar la operación y false en caso contrario.
Desde la clase Main, crea libros utilizando los constructores creados y comprueba que
los métodos préstamo y devolución funcionan correctamente.*/

public class LibroOld {
	//Atributos
	 private String titulo;
	 private String autor;
	 private int numeroEjemp;
	 private int numeroEjempPrest;
	//Constructores
	public LibroOld() {
		
	}
	public LibroOld(String titulo,String autor,int numeroEjemp,int numeroEjempPrest) {
		this.titulo=titulo;
		this.autor=autor;
		this.numeroEjemp=numeroEjemp;
		this.numeroEjempPrest=numeroEjempPrest;
	}
	//Metodos(Constructores)
		//Getters
		public String getTitulo() {
			return this.titulo;
		}
		public String getAutor() {
			return this.autor;
		}
		public int getNumeroEjemp() {
			return this.numeroEjemp;
		}
		public int getNumeroEjempPrest() {
			return this.numeroEjempPrest;
		}
		
		//Setters
		public void setTitulo(String titulo) {
			this.titulo=titulo;
		}
		public void setAutor(String autor) {
			this.autor=autor;
		}
		public void setNumeroEjemp(int numeroEjemp) {
			this.numeroEjemp=numeroEjemp;
		}
		public void setNumeroEjempPrest(int numeroEjempPrest) {
			this.numeroEjempPrest=numeroEjempPrest;
		}
	//Metodos
		/**
		 *<h2>Esta funcion prestara un libro primero comprobara si se puede prestar</h2>
		 *<p>
		 *@return 
		 *Se a podido prestar |
		 *No se a podido prestar 
		 * */
		public String Prestamo() {
			boolean prestar;
			String resultado;
			if(numeroEjemp>numeroEjempPrest) {
				prestar=true;
				
				setNumeroEjempPrest( getNumeroEjempPrest()+1);
				resultado= "Si  se a podido prestar";
			}else {
				prestar=false;
				resultado= "No se a podido prestar";
			}
			return resultado;
		}
		/**
		 *<h2>Esta funcion devolvera un libro ya prestado primero comprobara si ya se presto para poder devolverlo</h2> 
		 *<p>
		 *@return 
		 *Se a podido devolver |
		 *No se a podido devolver
		 * */
		public String Devolucion() {
				String resultado;
			if(getNumeroEjempPrest()>0) {
				setNumeroEjempPrest( getNumeroEjempPrest()-1);
				resultado = "Se a podido devolver";
			}else {
				resultado = "No se a podido devolver";
			}
			return resultado;
		}
		/**
		 *<h2>Este metodo devolvera las caracteristicas del libro correspondiente</h2>
		 *<p>
		 *@return
		 *Titulo + autor +numeroEjemplares+numeroEjemplaresPrestados 
		 * */
		public String toString() {
			return "Tu titulo" + this.titulo + "y tu autor es" + this.autor + "y tu numero es:" + numeroEjemp + "tu numero de ejemplos prestados es" + numeroEjempPrest;
		}
}

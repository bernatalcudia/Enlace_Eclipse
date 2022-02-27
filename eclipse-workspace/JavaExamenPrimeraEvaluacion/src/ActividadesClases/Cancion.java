package ActividadesClases;
/*
 *Desarrolla una clase Canción con los siguientes atributos:
.- título una variable String que guarda el título de la canción
.- autor una variable String que guarda el autor de la canción
Incluye, al menos, los siguientes métodos:
.- Cancion(String, String) constructor que recibe como parámetros el título y el autor de 
la canción (por este orden)
.- Cancion constructor predeterminado que inicializa el título y el autor a cadenas vacías
.- dameTitulo devuelve el título de la canción
.- dameAutor devuelve el autor de la canción
.- Getters y Setters 
 * */
public class Cancion {
	//Atributos
	private String tituloCancion;
	private String autorCancion;
	//Cosntructores
	public Cancion(){
		this.tituloCancion="";
		this.autorCancion="";
	}
	public Cancion(String tituloCancion,String autorCancion){
		this.tituloCancion=tituloCancion;
		this.autorCancion=autorCancion;
	}
	//Metodos(Constructores)
	//Getters
	public String getTituloCancion() {
		return tituloCancion;
	}
	public String getAutorCancion() {
		return autorCancion;
	}
	//Setters
	public void setTituloCancion(String tituloCancion) {
		
		
		this.tituloCancion = tituloCancion;
	}
	public void setAutorCancion(String autorCancion) {
		this.autorCancion = autorCancion;
	}
	//Metodos
	
	
}

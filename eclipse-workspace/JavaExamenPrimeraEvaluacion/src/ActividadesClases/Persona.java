package ActividadesClases;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	//Constructores
	public Persona() {
		
	}
	public Persona(String nombre) {
		this.nombre=nombre;
		this.edad=0;
	}
	//*Metodos(Connstructores)
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	//Metodos
	
	public String toString() {
		return "Tu edad es" + this.edad + "y tu nommbre es" + this.nombre;
	}
	

}

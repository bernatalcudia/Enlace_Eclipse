package ActividadesClases;

public class Dragones {
	//Constantes
	public static final boolean muerto=false;
	public static final boolean vivo=true;
	//Atributos
	private String nombre;
	private String tipo;
	private int vida;
	private int defensa;
	private int nivel;
	private int velocidad;
	private boolean estado;
	//Constructores
	public Dragones() {
		
	}
	public Dragones(String nombre,String tipo,int vida,int defensa,int velocidad,boolean estado) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.vida=vida;
		this.defensa=defensa;
		this.velocidad=velocidad;
		this.estado=estado;
	}
	//Metodos(Constructores)
		//Getters
	public String getNombre() {
		return this.nombre;
	}
	public String getTipo() {
		return this.tipo;
	}
	public int getVida() {
		return this.vida;
	}
	public int getDefensa() {
		return this.defensa;
	}
	public int getNivel() {
		return nivel;
	}

	public int getVelocidad() {
		return this.velocidad;
	}
	public boolean getEstado() {
		return this.estado;
	}
		//Setters
	
	public void setNombre(String nombre) {
		 this.nombre=nombre;
	}
	public void setTipo(String tipo) {
		 this.tipo=tipo;
	}
	public void setVida(int vida) {
		this.vida=vida;
	}
	public void setDefensa(int defensa) {
		 this.defensa=defensa;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
		
	}
	public void setEstado(boolean estado) {
		 this.estado=estado;
	}
	//Metodos	
}

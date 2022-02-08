package ActividadesClases;
import java.util.Random;


public class Dragones {
	Random r = new Random();
	//Constantes
	public static final boolean muerto=false;
	public static final boolean vivo=true;
	
	//Atributos
	private String nombre;
	private String tipo;
	private int vida;
	private int defensa;
	private int ataque;
	private int nivel;
	private int velocidad;
	private int velocidad_base;
	private boolean estado;
	private Cazadores[] cazadores;
	//Constructores
	public Dragones() {
		
	}
	public Dragones(String nombre,String tipo,int vida,int defensa,int ataque,int velocidad,boolean estado,int numeroCazadores) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.vida=vida;
		this.defensa=defensa;
		this.ataque=ataque;
		this.velocidad=velocidad;
		this.velocidad_base = velocidad;
		this.estado=estado;
		this.setCazadores(new Cazadores [numeroCazadores]);
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
	public int getAtaque() {
		return this.ataque;
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
	public Cazadores[] getCazadores() {
		return cazadores;
	}
		//Setters
	
	
	public void setCazadores(Cazadores[] cazadores) {
		this.cazadores = cazadores;
	}
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
	public void setAtaque(int ataque) {
		 this.ataque=ataque;
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
	public void tumbar(int encontrarCazador) {
		int resultado=0;
		if (this.cazadores[encontrarCazador].getNivel() >= this.nivel) {
			resultado = r.nextInt(10-1)+1;
		}else {
			resultado = r.nextInt(5-1)+1;
		}
		
		if (resultado > 4) {
			this.vida -= 500;
			this.velocidad = 0;
		}
	}
	
	public void levantar() {
		this.velocidad=this.velocidad_base;
	}
	
	public void atacarCazador(int encontrarCazador) {
		this.cazadores[encontrarCazador].setVida( this.cazadores[encontrarCazador].getVida() - (this.ataque * this.nivel - ( this.cazadores[encontrarCazador].getDefensa() * this.cazadores[encontrarCazador].getNivel() ) ) );
	}
}

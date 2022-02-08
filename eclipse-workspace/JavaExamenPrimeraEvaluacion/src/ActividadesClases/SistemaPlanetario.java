package ActividadesClases;
/*Desarrolle una clase en Java que realice la abstracción de un sistema planetario, 
debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa, densidad, 
diámetro, distancia al sol (en Km), un número de identificador único, un nombre textual 
y un array de Lunas. Para las lunas, será necesario tener una nueva clase que indique el 
nombre de la misma.
*/
public class SistemaPlanetario {
	//Atributos
	private float masa;
	private float densidad;
	private int diametro;
	private int distanciaSol;
	private int numeroIdentificador;
	private String nombreTextual;
	private String[] lunas;
	
	//Metodos(Constructores)
	
	public SistemaPlanetario() {
		
	}
	public SistemaPlanetario(float masa,float densidad,int diametro,int distanciaSol,int numeroIdentificador,String nombreTextual ,String []lunas) {
		this.masa=masa;
		this.densidad=densidad;
		this.diametro=diametro;
		this.distanciaSol=distanciaSol;
		this.numeroIdentificador=numeroIdentificador;
		this.nombreTextual=nombreTextual;
		this.lunas=lunas;
	}
		//Getters
	public float getMasa() {
		return this.masa;
	}
	public float getDensidad() {
		return this.densidad;
	}
	public int getDiametro() {
		return this.diametro;
	}
	public int getDistanciaSol() {
		return this.distanciaSol;
	}
	public int getNumeroIdentificador() {
		return this.numeroIdentificador;
	}
	public String getNombreTextual() {
		return this.nombreTextual;
	}
	public String[] getLunas() {
		return this.lunas;
	}
		//Setters
	public void setMasa(float masa) {
		 this.masa=masa;
	}
	public void setDensidad(float densidad) {
		 this.densidad=densidad;
	}
	public void setDiametro(int diametro) {
		 this.diametro=diametro;
	}
	public void setDistanciaSol(int distanciaSol) {
		 this.distanciaSol=distanciaSol;
	}
	public void setNumeroIdentificador(int numeroIdentificador) {
		 this.numeroIdentificador=numeroIdentificador;
	}
	public void setNombreTextual(String nombreTextual) {
		 this.nombreTextual=nombreTextual;
	}
	public void setLunas(String []lunas) {
		 this.lunas=lunas;
	}
	//Metodos
}

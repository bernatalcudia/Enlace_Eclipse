package ActividadesClases;

public class Coche {
	
	
	//Atributos
	
	private int ruedas;
	private int motor;
	private String marca;
	private String modelo;
	private double revoluciones;
	private int marchas;
	private boolean encendido;
	
	
	//Constructores
	
	
	public Coche () {
		
	}
	
	public Coche (int ruedas,int motor,String marca,String modelo,double revoluciones,int marchas,boolean encendido) {
		
		this.ruedas = ruedas;
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
		this.revoluciones = revoluciones;
		this.marchas = marchas;
		this.encendido = encendido;
		
		
	}
	
	
	//Meotodos(Constructores)
	
	
	//Getters
	
	public int getRuedas () {
		
		return this.ruedas;
	}
	
	public int getMotor () {
		
		
		return this.motor;
	}
	
	
	public String getMarca () {
		
		
		return this.marca;
	}
	
	public String getModelo () {
		
		
		return this.modelo;
	}
	
	public double getRevoluciones(){
		
		return this.revoluciones;
	}
	
	public int getMarchas() {
		
		return this.marchas;
	}
	
	public boolean getEncendido() {
		
		return this.encendido;
	}
	
	public String getEncendidoBonito() {
		if(this.encendido==true)  {
			return  ("Tu motor esta encendido");
		}else {
			 return  ("Tu motor esta apagado");
		}
	}
	
	
	//Setters
	
	
	public void setRuedas (int ruedas) {
		
		
		this.ruedas = ruedas;
	}
	
	public void setMotor (int motor) {
		
		
		this.motor = motor;
	}
	
	public void setMarca (String marca) {
		
		
		this.marca = marca;
	}
	
	public void setModelo (String modelo) {
		
		
		this.modelo = modelo;
		
	}
	
	public void setRevoluciones(double revoluciones) {
		
		this.revoluciones = revoluciones;
	}
	
	public void setMarchas(int marchas) {
		
		this.marchas = marchas;
	}
	
	public void setEncendido(boolean encendido) {
		
		this.encendido = encendido;
	}
	
	
	
	//Metodos
	
	 public void encenderMotor () {
		 
		 this.encendido = true;
		 
	}
	 
	 
	 public void apagarMotor () {
		 
		 this.encendido = false;
		 
	 }
	 
	 public void comprobarRevoluciones() {
		 System.out.println("Tu numero de revoluciones es:" + this.revoluciones);
	 }
	 
	 public void comprobarMarchas() {
		 
		 System.out.println("Tu numero de marchas  es:" + this.marchas);
	 }


}
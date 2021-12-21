package dam.bernat;

public class coche {
	
	
	//Atributos
	
	private int ruedas;
	private int motor;
	private String marca;
	private String modelo;
	
	
	//Constructores
	
	
	public coche () {
		
	}
	
	public coche (int ruedas,int motor,String marca,String modelo) {
		
		this.ruedas = ruedas;
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
		
		
	}
	
	
	//Meotodos(Constructores)
	
	
	//Getters
	
	public int getRuedas () {
		
		return ruedas;
	}
	
	public int motor () {
		
		
		return motor;
	}
	
	
	public String getMarca () {
		
		
		return marca;
	}
	
	public String getModelo () {
		
		
		return modelo;
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
	
	
	
	//Metodos
	
	 public void encenderMotor () {
		
		 
		 System.out.println("El motor esta encendido");
	}
	 
	 
	 public void apagarMotor () {
		 
		 
		 System.out.println("El motor esta apagado");
		 
	 }
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

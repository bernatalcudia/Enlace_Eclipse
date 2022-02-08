package ActividadesClases;

public class Coche2 {
	//Atributos
	
	private String marca;
	private String color;
	private String modelo;
	
	//Constructores
	public Coche2() {
	}
	public Coche2(String marca,String color,String modelo) {
		this.marca=marca;
		this.color=color;
		this.modelo=modelo;
	}
	//Metodos(Constructores)
	
		//Getters
	public String setMarca() {
		return this.marca;
	}
	public String setColor() {
		return this.color;
	}
	public String setModelo() {
		return this.modelo;
	}
		//Setters
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	//Metodos
}

package ActividadesClases;

public class Cuenta {
//Atributos
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
//Metodos(Constructores)
	public Cuenta() {
		
	}
	public Cuenta(String nombreCliente,String numeroCuenta,double tipoInteres,double saldo) {
		this.nombreCliente=nombreCliente;
		this.numeroCuenta=numeroCuenta;
		this.tipoInteres=tipoInteres;
		this.saldo=saldo;
	}
	//Getters
	public String getNombreCliente() {
		return nombreCliente;
	}
	public String getNumeroCuenta() {
		return numeroCuenta; 
	}
	public double getTipoInteres() {
		return tipoInteres;
	}
	public double getSaldo() {
		return saldo;
	}
	//Setters
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente=nombreCliente;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres=tipoInteres;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
//Metodos
}

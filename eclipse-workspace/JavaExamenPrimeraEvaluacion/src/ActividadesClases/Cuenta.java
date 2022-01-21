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
		return this.nombreCliente;
	}
	public String getNumeroCuenta() {
		return this.numeroCuenta; 
	}
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	public double getSaldo() {
		return this.saldo;
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
	public boolean ingresar(double saldo){
		boolean validacion=false;
		if(saldo>=0) {
			saldo = this.saldo + saldo;
			validacion=true;
		}else {
			 validacion=false;
		}
		return validacion;
	}
	
	public boolean reintegro(double saldo){
		boolean validacion=false;
		if(this.saldo>=saldo) {
			saldo= this.saldo-saldo;
			validacion=true;
		}else {
			validacion=false;
		}
		return validacion;
	}
	public double transferencia(Cuenta destino,double saldo) {
		if(destino.getSaldo()>=this.saldo) {
			destino.setSaldo(this.saldo + saldo);
			this.saldo=this.saldo-saldo;
		}else {
			
		}
		return destino.getSaldo();
	}
}


package ActividadesArrayList;

public class Producto {
		//Constantes
		//Atributosd 
		  protected int id;
		  protected String nombre;
		  protected double precio;
		  protected Categoria categoria;
		  protected  boolean enStock;
		//Constructores
		  public Producto() {
			  
		  }
		  public Producto(int id,String nombre,double precio,Categoria categoria,boolean enStock) {
			  this.id=id;
			  this.nombre=nombre;
			  this.precio=precio;
			  this.categoria=categoria;
			  this.enStock=enStock;
		  }
		//Metodos(Constructores)
			//Getters
		  public int getId() {
				return id;
			}
			public String getNombre() {
				return nombre;
			}
			public double getPrecio() {
				return precio;
			}
			public Categoria getCategoria() {
				return categoria;
			}
			public boolean getisEnStock() {
				return enStock;
			}
			//Setters
			public void setId(int id) {
				this.id = id;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			public void setCategoria(Categoria categoria) {
				this.categoria = categoria;
			}
			public void setEnStock(boolean enStock) {
				this.enStock = enStock;
			}
		//Metodos
		
		
}

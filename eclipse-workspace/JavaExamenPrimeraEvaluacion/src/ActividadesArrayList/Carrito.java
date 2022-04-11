package ActividadesArrayList;

import java.util.ArrayList;

public class Carrito {
		//Constantes
		//Atributos
		protected ArrayList<Producto> productos;
		//Constructores
		public Carrito() {
			
		}
		
		//Metodos(Constructores)
			//Getters
		public ArrayList<Producto> getProductos() {
			return productos;
		}
			//Setters
		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}
		//Metodos
		public String añadirProductoAlCarrito(Producto producto) {
			productos.add(producto);
			String comprobacion="Tu producto se a implementado correctamente";
			return comprobacion;
		}
		public String eliminarProductoAlCarrito(Producto producto) {
			productos.remove(producto);
			String comprobacion="Tu producto se a eliminado correctamente";
			return comprobacion;
		}
		
		public double precioTotalDelCarrito() {
			double precio = 0;
			for (Producto p : productos) {
				precio += p.getPrecio();
			}
			System.out.println("El precio total de tu carrito es: " + precio);
			return precio;
		}

		public double precioConDescuento() {
			return (precioTotalDelCarrito()*0.85);
	
		}
		
		
}

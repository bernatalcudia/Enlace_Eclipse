package ActividadesArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void mostrarProductoCarrito() {
		
		Carrito carr =  new Carrito();
		
		for(Producto productos:carr.getProductos()) {
			System.out.println("Tus productos son: " + productos.getId() +  productos.getNombre() + productos.getPrecio() + productos.getCategoria() );
		}
	}
	public static void eliminarProductoCarrito() {
		Scanner kb = new Scanner(System.in);
		
		Carrito carr =  new Carrito();
		int id=0;
		String categoria="";
		 System.out.println("Cual es el id de tu producto:");
		 id = kb.nextInt();
		 System.out.println("Cual es la categoria de tu producto:");
		 categoria = kb.nextLine();
		 for(Producto productos:carr.getProductos()) {
				if(productos.getId()==id && productos.getCategoria().equals(categoria)) {
					carr.eliminarProductoAlCarrito(productos);
				}else {
					System.out.println("Producto no encontrado en la base de datos o informacion enviada no correcta intentelo de nuevo");
				}
		 }
	}
	public static void añadirProductoCarrito() {
		Scanner kb = new Scanner(System.in);
		Carrito carr = new Carrito();
		int id=0;
		String categoria="";
		 System.out.println("Cual es el id de tu producto:");
		 id = kb.nextInt();
		 System.out.println("Cual es la categoria de tu producto:");
		 categoria = kb.nextLine();
		 for(Producto productos:carr.getProductos()) {
				if(productos.getId()==id && productos.getCategoria().equals(categoria)) {
					carr.añadirProductoAlCarrito(productos);
				}else {
					System.out.println("Producto no encontrado en la base de datos o informacion enviada no correcta intentelo de nuevo");
				
				}
		 }
			 }
	
	public static Producto mostrarProductoMasBaratoTienda(ArrayList<Producto> productos) {
		
		double masBarato=0;
		Producto productoMasBarato=null;
		for(Producto producto:productos) {
			if(producto.getPrecio()<=masBarato) {
				masBarato=producto.getPrecio();
				productoMasBarato = producto;
			}
				
			
		}
		return productoMasBarato;
	}
	public static Producto mostrarProductoMasCaroTienda(ArrayList<Producto> productos) {
		
		double masCaro=0;
		Producto productoMasCaro=null;
	
		for(Producto producto:productos) {
			if(producto.getPrecio()>=masCaro) {
				masCaro=producto.getPrecio();
				productoMasCaro = producto;
			}
		}
		return productoMasCaro;
	}
	public static String modificarNombreCategorias(ArrayList<Categoria> categorias) {
		String comprobacion="Nombre modificado correctamente";
		Scanner kb = new Scanner(System.in);
		int id=0;
		String nombre="";
		String nuevonombre="";
		System.out.println("Cual es el id de tu categoria");
		 id = kb.nextInt();
		 System.out.println("Cual es el nombre de tu categoria:");
		 nombre = kb.nextLine();
		 for(Categoria categoria: categorias) {
				if(categoria.getId()==id && categoria.getNombre().equals(nombre)) {
					categoria.setNombre(nuevonombre);
				}else {
					System.out.println("Producto no encontrado en la base de datos o informacion enviada no correcta intentelo de nuevo");
				}
			 }
		 kb.close();
		return comprobacion;
	}
	public static String modificarPrecioProductos(ArrayList<Producto> productos) {
		Scanner kb = new Scanner(System.in);
		int id=0;
		String categoria="";
		int precio=0;
		 String comprobacion="Nombre modificado correctamente";
		 System.out.println("Cual es el id de tu producto:");
		 id = kb.nextInt();
		 System.out.println("Cual es la categoria de tu producto:");
		 categoria = kb.nextLine();
		 System.out.println("Cual es el precio que desea asignarle al producto:");
		 precio = kb.nextInt();
		 
		 for(Producto producto: productos) {
			if(producto.getId()==id && producto.getCategoria().equals(categoria)) {
				producto.setPrecio(precio);
			}else {
				System.out.println("Producto no encontrado en la base de datos o informacion enviada no correcta intentelo de nuevo");
			}
		 }
		 kb.close();
		 return comprobacion;
	}
	public static String modificarNombreProductos(ArrayList<Producto> productos) {
		Scanner kb = new Scanner(System.in);
		int id=0;
		String categoria="";
		String nombre="";
		 String comprobacion="Nombre modificado correctamente";
		 System.out.println("Cual es el id de tu producto:");
		 id = kb.nextInt();
		 System.out.println("Cual es la categoria de tu producto:");
		 categoria = kb.nextLine();
		 System.out.println("Cual es el nombre que desea asignarle al producto:");
		 nombre = kb.nextLine();
		 
		 for(Producto producto: productos) {
			if(producto.getId()==id && producto.getCategoria().equals(categoria)) {
				producto.setNombre(nombre);
			}else {
				System.out.println("Producto no encontrado en la base de datos o informacion enviada no correcta intentelo de nuevo");
			}
		 }
		 kb.close();
		 return comprobacion;
	}
	public static String listarCategorias(ArrayList<Categoria> categorias) {
		 String comprobacion="Categorias listadas correctamente";
		 for(Categoria categoria: categorias) {
			 System.out.println("Tu categoria  es: " + categoria.getId() + categoria.getNombre());
		 }
		 
		 return comprobacion;
	}
	public static String listarProductos(ArrayList<Producto> productos) {
		 String comprobacion="Productos listados correctamente";
		 for(Producto producto: productos) {
			 System.out.println("Tu producto es: " + producto.getId() + producto.getNombre() + producto.getPrecio() + producto.getCategoria());
		 }
		 return comprobacion;
	}
	public static String login(ArrayList<Usuario> usuarios) {
		
		 String comprobacion="Usuario logeado correctamente";
		
		
			
		Scanner kb = new Scanner(System.in);

		System.out.println("Cual es tu nif de usuario");
		 String nif = kb.nextLine();
		System.out.println("Con que usuario desea iniciar sesion");
		String nombre = kb.nextLine();
		
		for(Usuario usuario: usuarios) {
			if(usuario.getNif() == nif && usuario.getNombre() == nombre) {
				comprobacion="Usuario logeado correctamente";
				return comprobacion;
			}else {
				comprobacion="Usuario incorrecto";
				return comprobacion;
			}
		}
		kb.close();
		return comprobacion;
		
	}
	public static void menuBackOfice() {
		
		
		Datos datos = new Datos();
		ArrayList<Usuario> usuarios = datos.getUsuarios();
		ArrayList<Producto> productos = datos.getProductos();
		ArrayList<Categoria> categorias = datos.getCategorias();
		
		login(usuarios);
		
		for(Usuario usuario: usuarios)  {
			if(usuario.getTipo()==Usuario.admin) {
				Scanner kb = new Scanner(System.in);
				int funcion;
		do {
		
				System.out.println("A que funcion desea acceder:");
				System.out.println("1-Listar Productos");
				System.out.println("2-Modificar el nombre productos");
				System.out.println("3-Modificar precio de los productos");
				System.out.println("4-Listar categorias");
				System.out.println("5-Modificar el nombre categorias");
				System.out.println("99-Salir");
				
				 funcion=kb.nextInt();
				 
					 switch(funcion) {
					 case 1:
						 listarProductos(productos);
					 case 2:
						 listarProductos(productos);
						 modificarNombreProductos(productos);
					 case 3:
						 listarProductos(productos);
						 modificarPrecioProductos(productos);
					 case 4:
						 listarCategorias(categorias);
					 case 5:
						 listarCategorias(categorias);
						 modificarNombreCategorias(categorias);
					 case 99:
						 funcion=-1;
					default:
						System.out.println("Opcion incorrecta elija otra");
					 }
			kb.close();
			}while(funcion>0);
		
			}
		}
	}
	public static void menuFrontOfice() {
		Datos datos = new Datos();
		ArrayList<Usuario> usuarios = datos.getUsuarios();
		ArrayList<Producto> productos = datos.getProductos();
		ArrayList<Categoria> categorias = datos.getCategorias();
		
		login(usuarios);
		
		Scanner kb = new Scanner(System.in);
		int funcion;
		do {	
		System.out.println("A que funcion desea acceder:");
		System.out.println("1-Mostrar el producto mas caro de la tienda");
		System.out.println("2-Mostrar el producto mas barato de la tienda");
		System.out.println("3-Añadir productos al carrito");
		System.out.println("4-Eliminar productos del carrito");
		System.out.println("5-Ver productos del carrito");
		System.out.println("99-Salir");
		 funcion=kb.nextInt();
		 
		 switch(funcion) {
		 case 1:
			 mostrarProductoMasCaroTienda(productos);
		 case 2:
			 mostrarProductoMasBaratoTienda(productos);
		 case 3:
			 añadirProductoCarrito();
		 case 4:
			 eliminarProductoCarrito();
		 case 5:
			 mostrarProductoCarrito();
		 case 99:
			 funcion=-1;
		default:
			System.out.println("Opcion incorrecta elija otra");
		 }
		 
		 kb.close();
		}while(funcion>0);
	
	}
	public static void main(String[] args) {
		 menuFrontOfice();
		 menuBackOfice();
	}

}

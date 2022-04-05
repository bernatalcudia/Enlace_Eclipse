package ActividadesArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static String login(ArrayList<Usuario> usuarios) {
		 boolean encender=true;
		 String comprobacion="Usuario logeado correctamente";
		
		do {
			
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
				encender=false;
				comprobacion="Usuario incorrecto";
				return comprobacion;
			}
		}
		kb.close();
		}while(encender==true);
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
				System.out.println("A que funcion desea acceder:");
				System.out.println("1-Listar Productos");
				System.out.println("2-Modificar el nombre productos");
				System.out.println("3-Modificar precio de los productos");
				System.out.println("4-Listar categorias");
				System.out.println("5-Modificar el nombre categorias");
				
				 funcion=kb.nextInt();
					 switch(funcion) {
					 case 1:
					 case 2:
					 case 3:
					 case 4:
					 case 5:	 
					default:	 
					 }
			 kb.close();
			}
		}
		
		
		
	}
		
	public static void menuFrontOfice() {
		Datos datos = new Datos();
		ArrayList<Usuario> usuarios = datos.getUsuarios();
		ArrayList<Producto> productos = datos.getProductos();
		ArrayList<Categoria> categorias = datos.getCategorias();
		
		login(usuarios);
		for(Usuario usuario: usuarios)  {
		Scanner kb = new Scanner(System.in);
		int funcion;
		System.out.println("A que funcion desea acceder:");
		System.out.println("1-Mostrar el producto mas caro de la tienda");
		System.out.println("2-Mostrar el producto mas barato de la tienda");
		System.out.println("3-Añadir productos al carrito");
		System.out.println("4-Eliminar productos del carrito");
		System.out.println("5-Ver productos del carrito");
		 funcion=kb.nextInt();
		 
		 switch(funcion) {
		 case 1:
		 case 2:
		 case 3:
		 case 4:	 
		default:	 
		 }
		 
		 kb.close();
	}
	}
	public static void main(String[] args) {
		 menuFrontOfice();
		 menuBackOfice();
	}

}

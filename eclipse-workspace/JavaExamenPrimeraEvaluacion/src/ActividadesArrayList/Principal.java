package ActividadesArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static String login() {
		
		do {
			
		Scanner kb = new Scanner(System.in);
		Datos datos = new Datos();
		ArrayList<Usuario> usuarios = datos.getUsuarios();
		Usuario usuario = new Usuario();
		
		
		String comprobacion="Usuario logeado correctamente";
		String fallo="Usuario incorrecto sesion no iniciada";
		System.out.println("Cual es tu nif de usuario");
		 String nif = kb.nextLine();
		System.out.println("Con que usuario desea iniciar sesion");
		String nombre = kb.nextLine();
		
		if(usuarios.) {
			
		}
		
		
			
			return comprobacion;
		}while(id>0);
		
	}

	public static void main(String[] args) {

	}

}

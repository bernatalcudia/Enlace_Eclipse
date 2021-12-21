package dam.bernat;

import java.util.Scanner;

public class ClaseEscaner {
	public static int escanear(String textoAEscribir) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(textoAEscribir);
		
		boolean escaneoExitoso = false;
		int escaneado = 0;
		
		while(escaneoExitoso == false) {
			try {
				escaneado = s.nextInt();
				System.out.println("Escaneado: " + escaneado);
			} catch (Exception e) {
				System.out.println("El valor introducido no es válido");
				escanear(textoAEscribir);
				escaneoExitoso = true;
			}
		}
		
		System.out.println("Escaneado2: " + escaneado);
		s.close();
		return escaneado;
	}
}
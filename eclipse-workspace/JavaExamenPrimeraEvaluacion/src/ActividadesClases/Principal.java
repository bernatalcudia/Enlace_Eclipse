package ActividadesClases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche coche1 = new Coche(5,44,"Mercedes");
		Coche coche2 = new Coche(8,10,"Ferrari","x",100,2,true);
		Coche coche3 = new Coche();
		
		System.out.println(coche2.toString());
		System.out.println(coche1.toString());
		System.out.println(coche3.toString());*/
		
		Persona Pepe = new Persona("Pepe");
		Persona Luis = new Persona("Luis");
		Persona Maria = new Persona("Maria");
		
		Pepe.setEdad(10);
		Luis.setEdad(25);
		Maria.setEdad(18);
		
		System.out.println(Pepe.toString());
		System.out.println(Luis.toString());
		System.out.println(Maria.toString());
		
		Luis.setEdad(Maria.getEdad()-Pepe.getEdad());
		
		System.out.println(Pepe.toString());
		System.out.println(Luis.toString());
		System.out.println(Maria.toString());
		
		
	}

}




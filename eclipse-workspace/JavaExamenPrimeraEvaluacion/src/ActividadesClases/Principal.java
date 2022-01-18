package ActividadesClases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche1 = new Coche(5,44,"Mercedes");
		Coche coche2 = new Coche(8,10,"Ferrari","x",100,2,true);
		Coche coche3 = new Coche();
		
		System.out.println(coche2.toString());
		System.out.println(coche1.toString());
		System.out.println(coche3.toString());
	}

}




package ActividadesClases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		coche1.setMarca("Mercedes");
		coche1.setRuedas(4);
		coche1.setMarchas(4);
		coche1.setModelo("x");
		coche1.setMotor(10);
		coche1.setRevoluciones(8);
		coche1.encenderMotor();
		coche2.setMarca("Ferrari");
		coche2.setRuedas(6);
		coche2.setMarchas(20);
		coche2.setMotor(10);
		coche2.setModelo("xzv");
		coche2.setRevoluciones(8000);
		coche2.setMarca("Ford");
		coche3.setRuedas(6);
		coche3.setMarchas(8);
		coche3.setModelo("z");
		coche3.setRevoluciones(80);
		coche3.setMotor(15);
		System.out.println("Tus atributos de tu primer coche son " + coche1.getMarca()+ "-" + coche1.getRuedas()+ "-" + coche1.getMarchas()+  "-" + coche1.getModelo() + "-"+ coche1.getRevoluciones() + "-" + coche1.getMotor()+ "-"+ coche1.getEncendidoBonito()+ "Tus atributos de tu segundo coche son" +"-"+ "Tus atributos de tu tercer coche son");

	}

}

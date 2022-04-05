package ActividadesArrayList;
import java.util.ArrayList;

public class Datos {
	//Constantes
	//Atributos
	//Constructores
	//Metodos(Constructores)
		//Getters
		//Setters
	//Metodos
	
	public ArrayList<Usuario> getUsuarios() {
		
			Usuario pepe = new Usuario(1,"20FCW","Pepe",Usuario.user);
			Usuario antonio = new Usuario(2,"18LOM","Antonio",Usuario.socio);
			Usuario eduardo = new Usuario(3,"34MN","Eduardo",Usuario.admin);
			Usuario francisco = new Usuario(4,"18LOP","Francisco",Usuario.user);
			Usuario sonia = new Usuario(5,"56TR","Sonia",Usuario.admin);
		   ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		   usuarios.add(pepe);
		   usuarios.add(antonio);
		   usuarios.add(eduardo);
		   usuarios.add(francisco);
		   usuarios.add(sonia);
		   
		   return usuarios;
	}
	public ArrayList<Producto> getProductos() {
		
		Categoria mariscos = new Categoria(1,"Maricos");
		Categoria arroces = new Categoria(2,"Arroces");
		Categoria carne = new Categoria(3,"Carne");
		Categoria hortalizas = new Categoria(4,"Hortalizas");
		Categoria precocinada = new Categoria(5,"Precocinada");
		
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(mariscos);
		categorias.add(arroces);
		categorias.add(carne);
		categorias.add(hortalizas);
		categorias.add(precocinada);
		
		
		Producto lubina = new Producto(1,"lubina",15,mariscos,true);
		Producto rape = new Producto(2,"rape",5,mariscos,false);
		Producto langosta = new Producto(3,"langosta",10,mariscos,true);
		Producto gamba = new Producto(4,"gamba",20,mariscos,false);
		Producto cigala = new Producto(5,"cigala",30,mariscos,true);
		
		Producto arroznegro = new Producto(1,"arroz_negro",15,arroces,true);
		Producto arrozsenyoret = new Producto(2,"arroz_señoret",4,arroces,false);
		Producto paella = new Producto(3,"paella",50,arroces,true);
		Producto arrozdemarisco = new Producto(4,"arroz_marisco",14,arroces,false);
		Producto arrozcaldoso = new Producto(5,"arroz_caldoso",7,arroces,true);
		
		
		
		Producto lomo = new Producto(1,"lomo",25,carne,true);
		Producto longanizas = new Producto(2,"longanizas",17,carne,false);
		Producto costilla = new Producto(3,"costilla",60,carne,true);
		Producto chuletas = new Producto(4,"chuletas",5,carne,false);
		Producto wayu = new Producto(5,"wayu",90,carne,true);
		
		Producto manzana = new Producto(1,"manzana",2.5,hortalizas,true);
		Producto zanahoria = new Producto(2,"zanahoria",3,hortalizas,false);
		Producto pimenton = new Producto(3,"pimenton",1.5,hortalizas,true);
		Producto calabaza = new Producto(4,"calabaza",2.5,hortalizas,false);
		Producto calabacin = new Producto(5,"calabacin",0.5,hortalizas,true);
		
		
		
		Producto lasanya = new Producto(1,"lasaña",5,precocinada,true);
		Producto sandwitch = new Producto(2,"sandwitch",3,precocinada,true);
		Producto bocadilloserrano = new Producto(3,"bocadillo_serrano",5,precocinada,false);
		Producto bocadillolomo = new Producto(4,"bocadillo_lomo",11,precocinada,true);
		Producto macarrones = new Producto(5,"macarrones",15,precocinada,true);
		
		   ArrayList<Producto> productos = new ArrayList<Producto>();
		   productos.add(lubina);
		   productos.add(rape);
		   productos.add(langosta);
		   productos.add(gamba);
		   productos.add(cigala);
		   
		   productos.add(arroznegro);
		   productos.add(arrozsenyoret);
		   productos.add(paella);
		   productos.add(arrozdemarisco);
		   productos.add(arrozcaldoso);
		   
		   productos.add(lomo);
		   productos.add(longanizas);
		   productos.add(costilla);
		   productos.add(chuletas);
		   productos.add(wayu);
		   
		   productos.add(manzana);
		   productos.add(zanahoria);
		   productos.add(pimenton);
		   productos.add(calabaza);
		   productos.add(calabacin);
		   
		   productos.add(lasanya);
		   productos.add(sandwitch);
		   productos.add(bocadilloserrano);
		   productos.add(bocadillolomo);
		   productos.add(macarrones);
		   
		return productos;
		
	}
		
		public ArrayList<Categoria> getCategorias() {
			Categoria mariscos = new Categoria(1,"Maricos");
			Categoria arroces = new Categoria(2,"Arroces");
			Categoria carne = new Categoria(3,"Carne");
			Categoria hortalizas = new Categoria(4,"Hortalizas");
			Categoria precocinada = new Categoria(5,"Precocinada");
			
			ArrayList<Categoria> categorias = new ArrayList<Categoria>();
			categorias.add(mariscos);
			categorias.add(arroces);
			categorias.add(carne);
			categorias.add(hortalizas);
			categorias.add(precocinada);
			
			return categorias;
		}
		
	
}

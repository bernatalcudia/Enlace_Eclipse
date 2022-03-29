package ActividadesArrayList;

public class Categoria {
		//Constantes
		//Atributos
		 protected int id;
		protected String nombre;
		
		
		//Constructores
		public Categoria() {
			
		}
		public Categoria(int id,String nombre) {
			this.id=id;
			this.nombre=nombre;
		}
		//Metodos(Constructores)
			//Getters
		public int getId() {
			return id;
		}
		public String getNombre() {
			return nombre;
		}
			//Setters
		public void setId(int id) {
			this.id = id;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		//Metodos
}

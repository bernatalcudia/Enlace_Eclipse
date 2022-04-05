package ActividadesArrayList;


public class Usuario {
		//Constantes
	public static final int user=1;
	public static final int admin=2;
	public static final int socio=3;
		
	
		//Atributos
		protected int id;
		protected String nif;
		protected String nombre;
		protected int tipo;
		//Constructores
		public Usuario() {
			
		}
		public Usuario(int id,String nif,String nombre,int tipo ) {
			
		}
		//Metodos(Constructores)
			//Getters
		public int getId() {
			return id;
		}
		public String getNif() {
			return nif;
		}
		public String getNombre() {
			return nombre;
		}
		public int getTipo() {
			return tipo;
		}
			//Setters
		public void setId(int id) {
			this.id = id;
		}
		public void setNif(String nif) {
			this.nif = nif;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		//Metodos
}

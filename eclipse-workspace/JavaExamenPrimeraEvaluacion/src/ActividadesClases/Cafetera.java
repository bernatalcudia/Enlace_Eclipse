package ActividadesClases;
/*Desarrolla una clase Cafetera con los atributos siguientes:
.- capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
.- cantidadActual (la cantidad actual de café que hay en la cafetera).
.- Implementa, al menos, los siguientes métodos:
.- Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual
en cero (cafetera vacía).
.- Constructor con la capacidad máxima de la cafetera; inicializa la cantidad máxima de
café igual al que se le pasa.
.- Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
.- Getters y setters.
.- llenarCafetera(): Hace que la cantidad actual sea igual a la capacidad.
.- servirTaza(int): Simula la acción de servir una taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
.- vaciarCafetera(): pone la cantidad de café actual en cero.
.- agregarCafe(int): añade a la cafetera la cantidad de café indicada.
Desde la clase Main, crea objetos de tipo “Cafetera” utilizando los constructores creados
y comprueba que los métodos llenarCafetera, servirTaza, vaciarCafetera, agregarCafe
funcionan correctamente.*/
public class Cafetera {
	//Atributos
		 private int capacidadMaxima;
		 private int capacidadActual;
	//Constructores
		 public Cafetera() {
			 this.capacidadMaxima=1000;
			 this.capacidadActual=0;
		 }
		 public Cafetera(int capacidadMaxima) {
			 this.capacidadMaxima=capacidadMaxima;
		 }
		 public Cafetera(int capacidadMaxima,int capacidadActual) {
			 if(capacidadActual>capacidadMaxima) {
				 capacidadMaxima=capacidadActual;
			 }
		 }
	//Metodos(Constructores)
		//Getters
		 public int getCapacidadMaxima() {
			 return this.capacidadMaxima;
		 }
		 public int getCapacidadActual() {
			 return this.capacidadActual;
		 }
		//Setters
		 public void setCapacidadMaxima(int capacidadMaxima) {
			 this.capacidadMaxima=capacidadMaxima;
		 }
		 public void setCapacidadActual(int capacidadActual) {
			 this.capacidadActual=capacidadActual;
		 }
	//Metodos
		 public void llenarCafetera() {
			 this.capacidadActual=this.capacidadMaxima;
		 }
		public void servirTaza(int capacidadActual) {
			if(getCapacidadActual()>=capacidadActual) {
				 setCapacidadActual(this.capacidadActual-capacidadActual);
			}else {
				 setCapacidadActual(this.capacidadActual-capacidadActual);
			}
			
		}
		public void vaciarCafetera() {
			this.capacidadActual=0;
		}
		public void  agregarCafe(int capacidadActual) {
			this.capacidadActual=this.capacidadActual+capacidadActual;
		}

}

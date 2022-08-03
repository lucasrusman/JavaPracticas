
public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dias lunes 
		System.out.print(Dias.Lunes.toString());
			
		};
		public enum Dias{
			Lunes("Laboral"),
			Martes("Laboral"), 
			Miercoles("Laboral"),
			Jueves("Laboral"),
			Viernes("Laboral"),
			Sabado("No laboral"),
			Domingo("No laboral");
			
			private String estado;
			
			private Dias(String estado) {
				this.estado = estado;
			}
			
			@Override
			public String toString() {
				return this.estado;
			}
		}
}


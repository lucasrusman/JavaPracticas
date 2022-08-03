
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona lucas = new Persona("Lucas", 18, 45685943, 'h', 58.0, 180.0);
		System.out.println(lucas.calcularIMC(10000000.0, 180.0));
	}

}
class Persona{
	public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	public Persona() {}
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	private String nombre = "";
	private int edad = 0;
	private int dni = 0;
	private char sexo = 'h';
	private double peso = 0.0;
	private double altura = 0.0;
	
	public double calcularIMC(double peso, double altura) {
		double pesoIdeal = peso / (Math.pow(altura, 2));
		if(pesoIdeal < 20.0) {
			return -1;
		}
		if(pesoIdeal >=20.0 && pesoIdeal <=25.0) {
			return 0;
		}
		if(pesoIdeal >25.0) {
			return 1;
		}
		return pesoIdeal;
	}
}

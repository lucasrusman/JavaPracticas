import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el tipo de figura");
		String figura = sc.next();
		int area = 0;
		switch(figura) {
			case "Circulo":
				System.out.println("ingrese el radio del circulo");
				int radio = sc.nextInt();
				area = (int) areaCirculo(radio);
				break;
			case "Triangulo":
				System.out.println("ingrese la base del triangulo");
				int base = sc.nextInt();
				System.out.println("ingrese la altura del triangulo");
				int altura = sc.nextInt();
				area = (int) areaTriangulo(base, altura);
				break;
			case "Cuadrado":
				System.out.println("ingrese el lado del cuadrado");
				int lado = sc.nextInt();
				area = (int) areaCuadrado(lado);
				break;
		}
		System.out.println(area);
	
		
	}
	public static double areaCirculo(int radio) {
		return Math.PI * (radio * radio);
	}
	public static double areaTriangulo(int base, int altura) {
		return (base * altura) / 2;
	}
	public static double areaCuadrado(int lado) {
		return (lado * lado);
	}
	
}

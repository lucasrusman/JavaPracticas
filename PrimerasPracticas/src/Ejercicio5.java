import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el area de la circunferencia");
		double radio = sc.nextDouble();
		double area = (Math.PI * Math.pow(radio, 2));
		System.out.println(area);
	}

}

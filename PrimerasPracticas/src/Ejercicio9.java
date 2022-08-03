import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double iva = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el precio del producto");
		double precio = sc.nextDouble();
		double cuenta = precio + precio * iva;
		System.out.println("El precio con IVA es: " + cuenta);
	}

}

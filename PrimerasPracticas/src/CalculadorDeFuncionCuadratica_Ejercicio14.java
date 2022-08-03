import java.util.Scanner;

public class CalculadorDeFuncionCuadratica_Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero a");
		int a = sc.nextInt();
		System.out.println("Introduce el numero b");
		int b = sc.nextInt();
		System.out.println("Introduce el numero c");
		int c = sc.nextInt();
		double discriminante = Math.pow(b, 2) - (4*a*c);
		if(discriminante > 0) {
			double x1 = (((b * (-1)) + Math.sqrt(discriminante))/ (2*a));
			double x2 = (((b * (-1)) - Math.sqrt(discriminante))/ (2*a));
			System.out.println("El valor de x1 es: " + x1 + " y el de x2 es: "+ x2);
		}else {
			System.out.println("El discriminante es negativo");
		}
	}

}

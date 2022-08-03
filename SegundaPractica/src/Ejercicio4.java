import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		System.out.println(factorial(numero));
	
	}
	public static int factorial(int numero) {
		int factorial = 1;
		do {
			factorial *=numero;
			numero--;
		}while(numero > 1);
		return factorial;
	}

}

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero ASCII");
		int numero = sc.nextInt();
		char numeroConverito = (char) numero;
		System.out.println("El caracter es: " + numeroConverito );
	}

}

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int a = sc.nextInt();
		if(a % 2 == 0 ) {
			System.out.println("Es divisible entre dos");
		}else {
			System.out.println("No es divisible entre dos");
		}
	}

}

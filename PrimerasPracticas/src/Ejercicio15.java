import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero");
			a = sc.nextInt();
		}while(a < 0);
		System.out.println(a);
	}

}

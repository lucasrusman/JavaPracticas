import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el limite de generacion de numeros aleatorios");
		int limite = sc.nextInt();
		System.out.println("ingrese el rango A");
		int rangoA = sc.nextInt();
		System.out.println("ingrese el rango B");
		int rangoB = sc.nextInt();
		for(int i = 0; i<limite; i++) {
			System.out.println(aleatorio(rangoA, rangoB));
		}	
	}
	
	public static int aleatorio(int rangoA, int rangoB) {
		int aleatorio = ((int)Math.floor(Math.random()*(rangoB-rangoA)+rangoA));
		return aleatorio;
	}

}

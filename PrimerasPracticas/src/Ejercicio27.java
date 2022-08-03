import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta un numero entero distinto de -1");
		int acumulador = 0;
		int numero = sc.nextInt();
		while(numero != -1) {
			acumulador++;
			System.out.println("Inserta otro numero");
			numero = sc.nextInt();
		}
		System.out.println(acumulador);
		
	}

}

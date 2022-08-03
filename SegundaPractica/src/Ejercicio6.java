import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		System.out.println(longitud(numero));
	}
	public static int longitud(int numero) {
		String contador =  Integer.toString(numero);
		int count = 0;
		for(int i = 0; i < contador.length(); i++) {
			count++;
		}
		return count;
	}
}

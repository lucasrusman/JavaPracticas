import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		System.out.println(esPrimo(numero));
	}
	public static boolean esPrimo(int a) {
		if (a<=1){
	      return false;
	     }
		  
		int divisible = (int) Math.sqrt(a);
		int contador = 0;
		for(int i = divisible; i > 1; i--) {
			if(divisible % i == 0) {
				contador+=1;
			}
		}
		if(contador >=1) {
			return false;
		}else {
			return true;
		}
	}
}

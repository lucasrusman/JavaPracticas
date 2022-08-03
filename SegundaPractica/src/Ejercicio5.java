import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		System.out.println(binario(numero));
	}
	public static String binario(int numero) {
		String binario = "";
		String resultado;
		for(int i=numero; i> 0 ; i/=2) {
			if(i%2 == 1) {
				resultado = "1";
			}else {
				resultado = "0";
			}
			binario = resultado + binario;
		}
		return binario;
		//return Integer.toBinaryString(numero);
	}
}

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero:");
		int numero1 = sc.nextInt();
		System.out.println("ingrese otro numero:");
		int numero2 = sc.nextInt();
		System.out.println("ingrese un signo aritmetico:");
		String operacion = sc.next();
		switch(operacion) {
			case "+":
				int suma = numero1 + numero2;
				System.out.println(suma);
				break;
			case "-":
				int resta = numero1 - numero2;
				System.out.println(resta);
				break;
			case "*":
				int multiplicacion = numero1 * numero2;
				System.out.println(multiplicacion);
				break;
			case "/":
				double division = numero1 / numero2;
				System.out.println(division);
				break;
			case "^":
				double elevado = Math.pow(numero1, numero2);
				System.out.println(elevado);
				break;
			case "%":
				int modulo = numero1 % numero2;
				System.out.println(modulo);
				break;
		}
			
	}

}

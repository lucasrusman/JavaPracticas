import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un caracter a convertir en numero de la tabla ASCII");
		String caracter = sc.next();
		char elCaracter = (char) caracter.charAt(0);
		int codigo = (int) elCaracter;
		System.out.println("El numero de la tabla ASCCI es " + codigo );
	}

}

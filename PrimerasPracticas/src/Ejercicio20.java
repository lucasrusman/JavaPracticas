import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		boolean esPrimo = false;
		if(numero<=1) {
			esPrimo = false;
			System.out.println("Este numero no es primo");
		}
		for(int i = 2; i<=numero; i++) {
			if(numero % i ==0) {
				esPrimo = false;
				break;
			}else {
				esPrimo = true;
				break;
			}
			
		}
		if(esPrimo == false) {
			System.out.println("Este numero no es primo");
		}else {
			System.out.println("Este numero es primo");
		}
		

		
	}

}

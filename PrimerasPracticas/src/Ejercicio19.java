import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo"));
		if(numero > 0) {
			numero = String.valueOf(numero).length();
			System.out.println(numero);
		}else {
			System.out.println("El numero " + numero + " es negativo");
		}
		
		
	}

}

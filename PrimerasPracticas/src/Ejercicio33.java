import javax.swing.JOptionPane;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Ingrese la primer frase: ");
		String posicion = frase.substring(3,5);
		System.out.print(posicion);
	}

}

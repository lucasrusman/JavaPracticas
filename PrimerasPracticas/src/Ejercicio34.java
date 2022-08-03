import javax.swing.JOptionPane;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Ingrese la primer frase: ");
		String[] posicion = frase.split(" ");
		for(int i = 0; i<posicion.length; i++) {
			System.out.println(posicion[i]);
		}
	}

}

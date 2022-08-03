import javax.swing.JOptionPane;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("introduce una frase para eliminarle los espacios");
		String fraseNueva = frase.replace(" ", "");
		System.out.print(fraseNueva);
	}

}

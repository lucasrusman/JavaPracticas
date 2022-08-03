import javax.swing.JOptionPane;

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Ingrese una frase");
		do {
			String fraseNueva = JOptionPane.showInputDialog("Ingrese otra frase");
			frase+=fraseNueva;
			System.out.print(frase);
		}while( ! (frase == ""));
	}

}

import javax.swing.JOptionPane;

public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Ingrese una frase: ");
		String opcion = JOptionPane.showInputDialog("Ingrese si desea convertir a Mayusculas(M) o a Minisculas(m): ");

		switch(opcion) {
			case "m":
				frase = frase.toLowerCase();
				System.out.print(frase);
				break;
			case "M":
				frase = frase.toUpperCase();
				System.out.print(frase);
				break;
		}
		
	}

}

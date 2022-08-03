import javax.swing.JOptionPane;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1 = JOptionPane.showInputDialog("Ingrese la primer frase: ");
		String frase2 = JOptionPane.showInputDialog("Ingrese la segunda frase: ");
		if(frase1.equals(frase2)) {
			System.out.print("Son iguales");
		}else {
			System.out.print("No son iguales");
		}
	}

}

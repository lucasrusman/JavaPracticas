
import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Lucas";
		int intentos = 3;
		boolean acierto = false;
		for(int i = 0; (i< intentos && !acierto); i++) {
			String intentoPass = JOptionPane.showInputDialog("Introduce tu password");
			if(intentoPass.equals(password)) {
				acierto = true;
				System.out.println("En Hora buena");
			}
		}
	}

}

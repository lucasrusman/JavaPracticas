import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana");
		switch(dia) {
			case "Lunes": 
				System.out.println("Es dia laboral");
				break;
			case "Martes": 
				System.out.println("Es dia laboral");
				break;
			case "Miercoles": 
				System.out.println("Es dia laboral");
				break;
			case "Jueves": 
				System.out.println("Es dia laboral");
				break;
			case "Viernes": 
				System.out.println("Es dia laboral");
				break;
			case "Sabado": 
				System.out.println("No es dia laboral");
				break;
			case "Domingo": 
				System.out.println("No es dia laboral");
				break;
			default:
				System.out.println("No introduciste un dia");
				break;
		}
	}

}

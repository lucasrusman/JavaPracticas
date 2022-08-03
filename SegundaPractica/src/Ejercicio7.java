import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de euros que desea cambiar: "));
		String moneda = JOptionPane.showInputDialog("Ingrese la moneda a la que desea cambiar");
		moneda = moneda.toLowerCase();
		cambio(cantidad, moneda);
	}
	public static void cambio(int cantidad, String moneda) {
		double cambio = 0;
		switch(moneda) {
		case "libras":
			cambio = cantidad * 0.84;
			System.out.println(cambio);
			break;
		case "dolares":
			cambio = cantidad * 1.02;
			System.out.println(cambio);
			break;
		case "yenes":
			cambio = cantidad * 135.36;
			System.out.println(cambio);
			break;
		default:
			System.out.println("no intodujiste una moneda correcta");
		}
		
	}

}

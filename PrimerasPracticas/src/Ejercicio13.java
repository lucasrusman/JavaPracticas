import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroVentas = Integer.parseInt( JOptionPane.showInputDialog("Introduce el numero de ventas"));
		int sumaVentas = 0;
		for(int i = 0; i<numeroVentas; i++) {
			int numero = Integer.parseInt( JOptionPane.showInputDialog("Introduce el numero de la venta: " + (i+1)));
			sumaVentas += numero;
		}
		System.out.println(sumaVentas);
	}

}

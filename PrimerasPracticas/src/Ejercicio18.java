import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
		int contador = 0;
		for(int i=0; numero1>numero2 && contador<10; i++ ) {
			int numero = (int)(Math.random() * (numero1 - numero2))+ numero2;
			contador++;
			System.out.println(numero);
		}
		for(int i=0; numero2>numero1 && contador<10; i++ ) {
			int numero = (int)(Math.random() * (numero2 - numero1))+ numero1;
			contador++;
			System.out.println(numero);
		}
	}

}
 
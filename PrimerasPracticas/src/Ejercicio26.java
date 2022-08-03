import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta un numero entero mayor que 1");
		int numero;
		do{
			  numero = sc.nextInt();
	          if(numero<=1){
	               System.out.println("Vuelve a intentarlo");
	           }
	     }while(!(numero>=1));
		int acumulador = 0;
		for(int i = 1; i<=numero; i++) {
			acumulador+= i;
		}
		System.out.println(acumulador);
		
	}

}

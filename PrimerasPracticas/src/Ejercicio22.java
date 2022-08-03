
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		
		String frase = "La lluvia en Sevilla es una maravilla";
		for(int i =0; i<frase.length(); i++) {
			char caracter = frase.charAt(i);
			if(caracter == 'a' ||
			   caracter == 'e' ||
			   caracter == 'i' ||
			   caracter == 'o' ||
			   caracter == 'u') {
				contador++;
			}
		}
		System.out.println(contador);
	}

}

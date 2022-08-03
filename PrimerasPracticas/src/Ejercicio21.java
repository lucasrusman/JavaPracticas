public class Ejercicio21 {

	public static void main(String[] args) {
			for(int i=1;i<=100;i++){
				int raiz = (int) Math.sqrt(i);
				int contador=0;
				if(i == 1) {
					i++;
				}
				for(int n=raiz; n>1;n--) {
				   if(i%n==0){
				        contador++;
					   }
				}
				if(contador < 1) {
					System.out.println(i);
				}
			}
	}

		
	
}


public class Ejercicio39 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		int hora = 0, minutos = 0, segundos = 0;
		while(true) {
			if(hora < 10) {
				System.out.print("0");
			}
			System.out.print(hora + ":");
			if(minutos < 10) {
				System.out.print("0");
			}
			System.out.print(minutos + ":");
			if(segundos < 10) {
				System.out.print("0");
			}
			System.out.println(segundos);
			
			segundos++;
			if(segundos == 60) {
				segundos = 0;
				minutos++;
				if(minutos == 60) {
					minutos = 0;
					hora++;
					if(hora == 24) {
						hora = 0;
						//segundos++;
					}
				}
				
			}
			Thread.sleep(1000);
		}
		 
}
	
	

}


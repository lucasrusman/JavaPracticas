
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta miCuenta = new Cuenta("Lucas", 30000);
		System.out.println(miCuenta.getTitular());
		System.out.println(miCuenta.getCantidad());
		System.out.println(miCuenta.toString());
		miCuenta.setTitular("Facundo");
		miCuenta.setCantidad(50000);
		System.out.println(miCuenta.toString());
		System.out.println();
		miCuenta.ingresar(20000);
		System.out.println(miCuenta.toString());
		miCuenta.retirar(10000);
		System.out.println(miCuenta.toString());
		miCuenta.retirar(70000);
		System.out.println(miCuenta.toString());
	}

}
class Cuenta{
	public Cuenta(String titular) {
		this.titular = titular;
	}
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return this.titular;
	}
	public double getCantidad() {
		return this.cantidad;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
    public String toString() {
        return "Titular:" + this.titular + "- Cantidad:" + this.cantidad;
    }
    public double ingresar(double cantidad) {
    	if(cantidad >=0) {
    		return this.cantidad += cantidad;
    	}else {
    		return 0;
    	}
    }
    public double retirar(double cantidad) {
    	if(cantidad > this.cantidad) {
    		return this.cantidad = 0;
    	}else {
    		this.cantidad = this.cantidad - cantidad;
    		return this.cantidad;
    	}
    }
	private String titular;
	private double cantidad;
}
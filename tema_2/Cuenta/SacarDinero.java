
public class SacarDinero extends Thread{
	private Cuenta cuenta;
	String nombre;
	public SacarDinero(String n, Cuenta c) {
		super(n);
		cuenta = c;
	}
	
	public void run() {
		for (int i = 0; i <= 4; i++) {
			cuenta.RetirarDinero(10, getName());
		}
	}
}

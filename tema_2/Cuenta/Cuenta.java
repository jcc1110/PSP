public class Cuenta {
	
	private int saldo;
	
	Cuenta (int s){
		saldo = s;
	}
	
	int getSaldo() {
		return saldo;
	}
	
	void resta(int cantidad) {
		saldo -= cantidad;
	}
	
	synchronized void RetirarDinero(int cant, String nom){
		if(getSaldo() >= cant) {
			System.out.println("Se va a retirar saldo. El actual es " + getSaldo());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			resta(cant);
			System.out.println(nom + " retira " + cant + ". Saldo actual " + getSaldo() );
		}else {
			System.out.println("No se puede retirar dinero, saldo actual " + getSaldo());
		}
	}
}

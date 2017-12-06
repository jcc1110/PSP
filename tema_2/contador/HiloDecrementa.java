
public class HiloDecrementa extends Thread {

	private Contador contador;

	public HiloDecrementa(String n, Contador c) {
		setName(n);
		contador = c;
	}

	public void run() {
		synchronized (contador) {
			for (int i = 0; i < 300; i++) {
				contador.decrementa();
				try {
					sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(getName() + " contador vale " + contador.getValor());
			}
		}
	}

}

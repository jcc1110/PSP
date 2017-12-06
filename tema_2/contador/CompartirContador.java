
public class CompartirContador {

	public static void main(String[] args) {
		Contador contador = new Contador(100);
		HiloIncrementa hiloI = new HiloIncrementa("Hilo incrementa", contador);
		HiloDecrementa hiloD = new HiloDecrementa("Hilo decrementa", contador);
		hiloI.start();
		hiloD.start();
		try {
			hiloD.join();
			hiloI.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Valor final del contador " + contador.getValor());
		
	}

}

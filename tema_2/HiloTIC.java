
public class HiloTIC extends Thread {

	public HiloTIC() {

	}

	public void run() {
		while (true) {
			System.out.println("TIC");
			try {
				HiloTIC.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

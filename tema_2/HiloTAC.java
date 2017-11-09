
public class HiloTAC extends Thread {

	public HiloTAC() {
		
	}
	
	public void run() {
		try {
			HiloTIC.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			System.out.println("TAC");
			try {
				HiloTAC.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

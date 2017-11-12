
public class Actividad_2_1 {

	public static void main(String[] args) throws InterruptedException {
		HiloTIC tic = new HiloTIC();
		HiloTAC tac = new HiloTAC();
		tic.start();
		tac.start();
	}
}

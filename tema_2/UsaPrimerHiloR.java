
public class UsaPrimerHiloR {

	public static void main(String[] args) {
		PrimerHiloR p = new PrimerHiloR(10);
		new Thread(p).start();

	}

}

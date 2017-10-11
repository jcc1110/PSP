package tema_1;

public class Ejemplo1 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "NOTEPAD";
		@SuppressWarnings("unused")
		Process p = null;
		try {
			p = r.exec(comando);
		} catch (Exception e) {
			System.out.println("Error en " + comando);
			e.printStackTrace();
		}
	}
}

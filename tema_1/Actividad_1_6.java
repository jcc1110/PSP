import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad_1_6 {

	public static void main(String[] args) {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String texto;
		int num1, num2;
		try {
			do {
				System.out.print("Introduce primer número: ");
				texto = br.readLine();
			} while (!esEntero(texto));
			num1 = Integer.parseInt(texto);
			do {
				System.out.print("Introduce segundo número: ");
				texto = br.readLine();
			} while (!esEntero(texto));
			num2 = Integer.parseInt(texto);	

			System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
			in.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static boolean esEntero(String texto) {
		try {
			Integer.parseInt(texto);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

}

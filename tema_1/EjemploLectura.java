package tema_1;

import java.io.*;

public class EjemploLectura {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String texto;
		try {
			System.out.print("Introduce cadena: ");
			texto = br.readLine();
			System.out.println("Cadena escrita: " + texto);
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

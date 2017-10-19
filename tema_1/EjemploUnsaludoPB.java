import java.io.*;

public class EjemploUnsaludoPB {

	public static void main(String[] args) {
		ProcessBuilder test = new ProcessBuilder("java", "Unsaludo", "\"Hola Mundo\"");
		try {
			Process p = test.start();
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

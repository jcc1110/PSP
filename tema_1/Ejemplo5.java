package tema_1;

import java.io.*;

public class Ejemplo5 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "CMD /C DATE";
		Process p = null;
		int exitVal;
		try {
			p = r.exec(comando);
			
			// Escritura -- envia entrada a DATE
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			bw.write("25-12-2017");
			bw.flush();
			
			// Lectura -- leemos la salida de DATE
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
			// Error -- leemos el flujo de error
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while ((liner = brer.readLine()) != null) {
				System.err.println(liner);
			}
						
			br.close();
			bw.close();
			brer.close();
			
			exitVal = p.waitFor();
			System.out.println("Valor de salida: " + exitVal);
		
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}

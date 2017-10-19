import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Actividad_1_6b {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String comando = "java Actividad_1_6";
		
		Process p = null;
		try {
			p = r.exec(comando);
			
			OutputStream os = p.getOutputStream();
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("5");
			bw.newLine();
			bw.write("3");
			bw.newLine();
			bw.flush();
			InputStream is = p.getInputStream();			
			BufferedReader br = new BufferedReader (new InputStreamReader(is));
			String linea;
			while((linea = br.readLine()) != null) 
				System.out.println(linea);
			br.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//COMPROBACIÓN DE ERROR : 0 bien, 1 mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while((liner = brer.readLine()) != null)
				System.out.println("ERROR >" + liner);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}

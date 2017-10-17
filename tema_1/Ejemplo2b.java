

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;;

public class Ejemplo2b {
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String comando = "CMD /C DIRR";
		Process p = null;
		int exitVal;
		try {
//			Ejecutamos el comando
			p = r.exec(comando);
//			Recuperamos el flujo de salida del proceso
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
//			REcuperamos el flujo de error del proceso
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while ((liner = brer.readLine()) != null) {
				System.out.println("ERROR > " + liner);
			}
			brer.close();
//			Esperamos a que termine el proceso y comprobamos si finaliza
//			Correctamente
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
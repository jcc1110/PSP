import java.io.*;

public class Ejemplo3 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "java Unsaludo \"Hola Mundo!!\"";
		Process p = null;
		int exitVal;
		if(args.length < 1) {
			System.out.println("SE NECESITA UN NOMBRE DE FICHERO");
			System.exit(1);
		}
		try {
			FileOutputStream fos = new FileOutputStream(args[0]);
			PrintWriter pw = new PrintWriter(fos);
			p = r.exec(comando);

			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println("INSERTO EN " + args[0] + " > " + linea);
				pw.println(linea);
			}
			br.close();
			pw.close();
			exitVal = p.waitFor();
			System.out.println("Valor de salida: " + exitVal);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

import java.io.*;

public class Ejemplo5 {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    String comando = "CMD /c DATE ";
    Process p = null;
    try {
      p = r.exec(comando);

      // Flujo de escritura hacia el proceso hijo
      OutputStream os = p.getOutputStream();
      OutputStreamWriter osw = new OutputStreamWriter(os);
      BufferedWriter bw = new BufferedReader(osw);

      // Flujo de lectura desde el proceso hijo
      InputStream is = p.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);

    }catch (Exception e) {
      e.printStackTrace();
    }
}

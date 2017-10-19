import java.lang.ProcessBuilder.Redirect;

public class Actividad_1_6b_PB {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("java", "Actividad_1_6");
		pb.redirectInput(Redirect.INHERIT);
		pb.redirectOutput(Redirect.INHERIT);
		pb.redirectError(Redirect.INHERIT);
		
		Process p = null;
		try {
			p = pb.start();
			
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
	}

}

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EjemploPB1 {

	public static void main(String[] args) {
		ProcessBuilder test = new ProcessBuilder();
		Map entorno = test.environment();
		System.out.println("Variables de entorno: ");
		Set claves = entorno.keySet();
		Iterator iterador = claves.iterator();
		String clave = "";
		while(iterador.hasNext()) {
			clave = (String)iterador.next();
			System.out.println(clave + ": " + entorno.get(clave));
		}
	}
}

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class EjemploPB2 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		pb.redirectOutput(Redirect.INHERIT);
		pb.redirectError(new File("error.txt"));
		pb.start();
	}

}


public class PrincipalCuenta {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(40);
		SacarDinero ana = new SacarDinero("Ana", cuenta);
		SacarDinero juan = new SacarDinero("Juan", cuenta);
		
		ana.start();
		juan.start();
	}

}

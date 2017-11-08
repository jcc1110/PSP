
public class HiloEjemplo2 extends Thread{

	public static void main(String[] args){
		HiloEjemplo2 h = null;
		for(int i=0; i<3; i++) {
			h = new HiloEjemplo2();
			h.setName("HILO " + i);
			h.setPriority(i+1);
			h.start();
			System.out.println("Información del " + h.getName() +
					": " + h.toString());
		}
		System.out.println("3 hilos creados");
	}

	@Override
	public void run() {
		System.out.println("Dentro del Hilo: " + this.getName() + 
				", Prioridad: " + this.getPriority() + 
				", ID: " + this.getId());
	}

}

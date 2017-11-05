public class HiloEjemplo1_V2 extends Thread {
  private int hilo;

  public HiloEjemplo1_V2(int hilo) {
    this.hilo = hilo;
    System.out.println("CREANDO HILO: " + hilo);
  }

  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("Hilo: " + hilo + ", iteración: " + i);
    }
  }
}

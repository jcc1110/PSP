public class HiloEjemploInterrup extends Thread {

  public void run() {
    try {
      while (!isInterrupted()) {
        System.out.println("En el hilo");
        Thread.sleep(10);
      }
    } catch (InterruptedException e) {
      System.out.println("Ha ocurrido una excepción");
    }
    System.out.println("Fin de hilo");
  }

  public void interrumpir() {
    interrupt();
  }

  public static void main(String[] args) {
    HiloEjemploInterrupt h = new HiloEjemploInterrupt();
    h.start();
    try {
      sleep(20);
    } catch (InterruptedException e) {
      h.interrumpir();
    }
  }
}

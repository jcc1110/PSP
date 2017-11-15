public class HiloEjemploDead extends Thread {
  private boolean stopHilo = false;

  public void pararHilo() {
    stopHilo = true;
  }

  public void run() {
    while (!stopHilo) {
      System.out.println("¡¡Estoy vivo!!");
    }
  }

  public static void main(String[] args) {
    HiloEjemploDead h = new HiloEjemploDead();
    h.start();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    h.pararHilo();
  }
}

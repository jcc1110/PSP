class MyThread extends Thread {

  // Propiedades
  private SuspendRequestor suspender = new SuspendRequestor();

  // Métodos
  public void requestSuspend() {
    suspender.set(true);
  }

  public void requestResume() {
    suspender.set(false);
  }

  public void run() {
    try {
      while (/* haya trabajo por hacer */ true) {
        suspender.waitForResume(); // Realizar el trabajo
      }
    } catch (InterruptedException exception) {
      e.printStackTrace();
    }
  }
}

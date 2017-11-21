class SuspendRequestor {

  // Propiedades
  private boolean suspendRequested;

  // Métodos
  public synchronized void set(boolean b) {
    suspendRequested = b;
    notifyAll();
  }

  public synchronized void waitForResume() throws InterruptedException {
    while (suspendRequested)
      wait();
  }
}

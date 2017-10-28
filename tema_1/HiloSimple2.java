public class HiloSimple2 implements Runnable {
  public void run(){
    for(int i=0; i<5; i++){
      System.out.println("En el hilo...");
    }
  }
}

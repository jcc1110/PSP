public class HiloEjemplo1 extends Thread {
  private int hilo;

  //constructor
  public HiloEjemplo1(int hilo){
    this.hilo = hilo;
    System.out.println("CREANDO HILO: " + hilo);
  }

  // metodo run
  public void run(){
    for(int c = 0; c <= 5; c++){
      System.out.println("Hilo: " + hilo + " C = " + c);
    }
  }

  public static void main(String[] args){
    HiloEjemplo1 h = null;
    for(int i=0; i<3; i++){
      h = new HiloEjemplo1(i);
      h.start();
    }
    System.out.println("HILOS CREADOS");
  }
}

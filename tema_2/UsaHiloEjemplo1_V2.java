public class UsaHiloEjemplo1_V2 {
  public static void main(String[] args) {
    HiloEjemplo1_V2 h = null;
    for (int i = 0; i < 3; i++) {
      h = new HiloEjemplo1_V2(i);
      h.start();
    }
    System.out.println("CREADOS LOS 3 HILOS");
  }
}

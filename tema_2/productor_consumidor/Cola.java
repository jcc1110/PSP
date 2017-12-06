public class Cola {
  private int numero;
  private boolean disponible = false;

  public int get() {
    int res = -1;
    if (disponible) {
      disponible = false;
      res = numero;
    }

    return res;
  }

  public void put(int valor) {
    numero = valor;
    disponible = true;
  }

}

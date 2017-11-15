import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ContadorApplet extends Applet implements Runnable, ActionListener {
  private Thread h;
  long contador = 0;
  private boolean parar;
  private Font fuente;
  private Button b1, b2;

  public void start() {
  }

  public void init() {
    setBackground(Color.yellow);
    add(b1 = new Button("Iniciar contador"));
    b1.addActionListener(this);
    add(b2 = new Button("Para contador"));
    b2.addActionListener(this);
    fuente = new Font("Verdana", Font.BOLD, 26);
  }

  public void run() {
    parar = false;
    Thread hiloActual = Thread.currentThread();
    while (h == hiloActual && !parar) {
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      repaint();
      contador++;
    }
  }

  public void paint(Graphics g) {
    g.clearRect(0, 0, 400, 400);
    g.setFont(fuente);
    g.drawString(Long.toString((long) contador), 80, 100);
  }

  public void actionPerformed(ActionEvent e) {
    b1.setLabel("Continuar");
    if (e.getSource() == b1) {
      if (h != null && h.isAlive()) {
      } else {
        h = new Thread(this);
        h.start();
      }
    } else {
      parar = true;
    }
  }

  public void stop() {
    h = null;
  }
}

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad2_2 extends Applet implements ActionListener {

	class HiloContador extends Thread {
		// Propiedades
		long CONTADOR = 0;
		boolean parada = false;

		// Constructor
		public HiloContador(int hilo) {
			CONTADOR = hilo;
		}

		// Métodos
		public void pararHilo() {
			parada = true;
		}

		public void activarHilo() {
			parada = false;
		}

		public void run() {
			while (!parada) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				CONTADOR++;
				repaint();
			}
		}
	} // fin de clase HiloContador
		// Propiedades

	private Font fuente;
	private Button btn1, btn2;
	HiloContador t1, t2;
	int a, b;

	// Métodos
	public void init() {
		// Los genero con inicio aleatorio
		t1 = new HiloContador((int) (Math.random() * 100 + 1));
		t2 = new HiloContador((int) (Math.random() * 100 + 1));
		setBackground(Color.orange);
		fuente = new Font("Verdana", Font.BOLD, 26);
		add(btn1 = new Button("Parar contador 1"));
		btn1.addActionListener(this);
		add(btn2 = new Button("Parar contador 2"));
		btn2.addActionListener(this);
		t1.start();
		t2.start();
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente); // fuente
		g.drawString("Hilo 1: " + Long.toString((long) t1.CONTADOR), 40, 100);
		g.drawString("Hilo 2: " + Long.toString((long) t2.CONTADOR), 40, 150);
		// repaint();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn1) {
			if (t1.isAlive()) {
				t1.pararHilo();
				a = (int) t1.CONTADOR;
				btn1.setLabel("Activar contador 1");
			} else {
				t1.activarHilo();
				t1 = new HiloContador(a + 1);
				t1.start();
				btn1.setLabel("Parar contador 1");
			}
		} else if (e.getSource() == btn2) {
			if (t2.isAlive()) {
				t2.pararHilo();
				b = (int) t2.CONTADOR;
				btn2.setLabel("Activar contador 2");
			} else {
				t2.activarHilo();
				t2 = new HiloContador(b + 1);
				t2.start();
				btn2.setLabel("Parar contador 2");
			}
		}
	} // Fin actionPerformed
}
package proj1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	Image i = Toolkit.getDefaultToolkit().getImage("skull.jpg");

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (i != null)
			g.drawImage(i, 0, 0, this);
	}

}

package proj1;

import java.awt.Graphics;

public class Enemy extends Player {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.fillRect(0, 0, hp * 2, 20);
	}
}

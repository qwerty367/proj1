package proj1;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Player {
	Enemy() {
		this.setBounds(280, 0, 200, 330);
		try {
			this.setImage(ImageIO.read(new File("3.png")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void takeDamage(Player attacker) {
		super.takeDamage(attacker);
		attacker.takeDamage(this);

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.fillRect(0, 0, hp * 2, 20);
	}
}

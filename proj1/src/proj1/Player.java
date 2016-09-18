package proj1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Player extends JPanel {
	private int hp = 100;
	private Image image;
	private Rectangle hpBar;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Rectangle getHpBar() {
		return hpBar;
	}

	public void Rectangle(Rectangle hpBar) {
		this.hpBar = hpBar;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, 0, 50, getWidth(), getHeight(), null);
		g.fillRect(20, 20, hp * 2, 20);
	}

}

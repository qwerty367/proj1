package proj1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Player extends JPanel {
	protected int hp = 100;
	protected Image image;
	private Rectangle hpBar;

	Player() {
		this.setBounds(0, 0, 200, 330);
		this.setLayout(null);

		try {
			this.setImage(ImageIO.read(new File("2.jpg")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

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

	public void takeDamage(Player attacker) {
		hp = (int) (hp - Math.random() * 10);
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.fillRect(0, 0, hp * 2, 20);
	}

}

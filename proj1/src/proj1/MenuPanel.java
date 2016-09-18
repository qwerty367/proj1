package proj1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	private Image image;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public void paintComponent(Graphics g) {
		// ii = new ImageIcon(this.getClass().getResource("skull.jpg"));
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

}

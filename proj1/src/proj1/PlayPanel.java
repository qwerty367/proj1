package proj1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PlayPanel extends JPanel {
	JButton backButton = new JButton();
	private MainWindow mainWindow;

	PlayPanel(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		BackButtonListener backButtonListener = new BackButtonListener(mainWindow);
		backButton.setText("Back");
		backButton.setBounds(215, 205, 70, 30);
		backButton.addActionListener(backButtonListener);
		this.add(backButton);
		this.setBounds(0, 0, 500, 500);
		this.setLayout(null);

		try {
			this.setImage(ImageIO.read(new File("0.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Player player = new Player();
		this.add(player);
		Enemy enemy = new Enemy();
		this.add(enemy);

	}

	private Image image;

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
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

}

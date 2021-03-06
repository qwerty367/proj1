package proj1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	JButton playButton = new JButton();
	private MainWindow mainWindow;

	MenuPanel(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		PlayButtonListener playButtonListener = new PlayButtonListener(mainWindow);
		playButton.setText("Play");
		playButton.setBounds(215, 205, 70, 30);
		playButton.addActionListener(playButtonListener);
		this.add(playButton);

		this.setBounds(0, 0, 500, 500);
		this.setLayout(null);

		try {
			this.setImage(ImageIO.read(new File("skull.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}

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

package proj1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlayButtonListener implements ActionListener {
	private MainWindow mainWindow;

	PlayButtonListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainWindow.getContentPane().removeAll();

		Player player = new Player();
		player.setBounds(0, 0, 200, 330);
		player.setLayout(null);

		try {
			player.setImage(ImageIO.read(new File("2.jpg")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		mainWindow.add(player);
		mainWindow.repaint();
	}

}

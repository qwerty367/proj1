package proj1;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	JButton jButton1 = new JButton();
	PlayButtonListener playButtonListener = new PlayButtonListener(this);

	MainWindow() {
		jButton1.setText("Play");
		jButton1.setBounds(215, 205, 70, 30);
		jButton1.addActionListener(playButtonListener);

		MenuPanel menuPanel = new MenuPanel();
		menuPanel.setBounds(0, 0, 500, 500);
		menuPanel.setLayout(null);
		menuPanel.add(jButton1);

		try {
			menuPanel.setImage(ImageIO.read(new File("skull.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.add(menuPanel);
		this.setVisible(true);

	}
}

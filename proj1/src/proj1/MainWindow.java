package proj1;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	MainWindow() {
		MenuPanel menuPanel = new MenuPanel(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.add(menuPanel);
		this.setVisible(true);

	}
}

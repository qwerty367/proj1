package proj1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	JButton jButton1 = new JButton();
	PlayButtonListener playButtonListener = new PlayButtonListener(this);

	MainWindow() {
		jButton1.setText("Play");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLayout(null);
		MenuPanel menuPanel = new MenuPanel();
		menuPanel.setBounds(0, 0, 500, 500);
		menuPanel.setLayout(null);
		jButton1.setBounds(215, 205, 70, 30);
		menuPanel.add(jButton1);
		jButton1.addActionListener(playButtonListener);
		this.add(menuPanel);

	}
}

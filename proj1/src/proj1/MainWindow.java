package proj1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	JButton jButton1 = new JButton();
	JPanel jPanel = new JPanel();

	MainWindow() {
		jButton1.setText("Play");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLayout(null);
		jPanel.setLayout(null);
		jPanel.setBounds(0, 0, 500, 500);
		jButton1.setBounds(215, 205, 70, 30);
		this.add(jPanel);
		jPanel.add(jButton1);

	}
}

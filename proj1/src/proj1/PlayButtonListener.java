package proj1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener implements ActionListener {
	private MainWindow mainWindow;

	PlayButtonListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlayPanel playPanel = new PlayPanel(mainWindow);
		mainWindow.getContentPane().removeAll();
		mainWindow.add(playPanel);
		mainWindow.repaint();
	}

}

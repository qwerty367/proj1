package proj1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonListener implements ActionListener {
	private MainWindow mainWindow;

	BackButtonListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuPanel menuPanel = new MenuPanel(mainWindow);
		mainWindow.getContentPane().removeAll();
		mainWindow.add(menuPanel);
		mainWindow.repaint();
	}

}

package proj1;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import org.junit.Test;

public class MainWindowTest {

	@Test
	public void jButton1DimensionTest() {
		// arrange
		MainWindow mainwindow = new MainWindow();
		// act
		Dimension dimension = mainwindow.jButton1.getSize();
		// assert
		assertEquals(70, dimension.width);
		assertEquals(30, dimension.height);
	}

	@Test
	public void jButton1IsClickedTest() {
		// arrange
		MainWindow mainwindow = new MainWindow();
		ActionListener playButtonListener = new PlayButtonListener(mainwindow);
		// act
		mainwindow.jButton1.addActionListener(playButtonListener);

	}

}

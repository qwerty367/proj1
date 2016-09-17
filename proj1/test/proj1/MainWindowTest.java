package proj1;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;

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

}

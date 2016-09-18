package proj1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StrikeButtonListener implements ActionListener {
	private Enemy enemy;

	StrikeButtonListener(Enemy enemy) {
		this.enemy = enemy;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		enemy.hp = enemy.hp - 10;
		System.out.println(enemy.hp);
		enemy.repaint();
	}

}

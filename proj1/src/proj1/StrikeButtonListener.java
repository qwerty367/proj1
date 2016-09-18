package proj1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StrikeButtonListener implements ActionListener {
	private Enemy enemy;
	private Player player;

	StrikeButtonListener(Enemy enemy, Player player) {
		this.enemy = enemy;
		this.player = player;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		enemy.takeDamage(player);
	}

}

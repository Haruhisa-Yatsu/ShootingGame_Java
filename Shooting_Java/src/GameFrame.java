import java.util.Vector;

public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player = new Player(100, 300, 0, 0);
		GameWorld.playerBullets = new Vector<PlayerBullet>();

		addKeyListener(GameWorld.player);

		while (true) {
			clear();
			GameWorld.player.draw(this);
			GameWorld.player.move();

			int i = 0;

			while (i < GameWorld.playerBullets.size()) {
				PlayerBullet b = GameWorld.playerBullets.get(i);
				b.draw(this);
				b.move();
				i++;
			}
			sleep(0.030);
		}
	}
}

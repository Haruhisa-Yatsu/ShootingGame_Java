
public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player = new Player(100, 300, 0, 0);

		addKeyListener(GameWorld.player);

		while (true) {
			clear();
			GameWorld.player.draw(this);
			GameWorld.player.move();
			sleep(0.03);
		}
	}
}


public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player = new Player(100, 300, 0, 0);

		GameWorld.player.draw(this);
	}
}

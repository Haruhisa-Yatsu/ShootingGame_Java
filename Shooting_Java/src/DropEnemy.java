
public class DropEnemy extends Enemy {
	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		vy = vy + 0.1;
	}
}

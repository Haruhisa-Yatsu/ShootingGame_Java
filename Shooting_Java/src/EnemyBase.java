
public class EnemyBase extends Enemy {

	public EnemyBase(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		if (x > 300)
			vx = -1;
		if (x < 100)
			vx = 1;
	}
}

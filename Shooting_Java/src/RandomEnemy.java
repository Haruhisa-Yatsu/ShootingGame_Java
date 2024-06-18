
public class RandomEnemy extends Enemy {
	public RandomEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		vx = Math.random() * 4 - 2;
	}
}

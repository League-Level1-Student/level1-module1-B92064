package extra;

public class Jaguar {
	int speed = 0;
	String favoriteFood;

	Jaguar(String favoriteFood, int speed) {
		this.favoriteFood = favoriteFood;
		this.speed = speed;
	}

	public void sprint() {
		System.out.println("Sprinting");
	}

	public void eat() {
		System.out.println("Eat the deer or ostrich or bird or other stuff");
	}
}

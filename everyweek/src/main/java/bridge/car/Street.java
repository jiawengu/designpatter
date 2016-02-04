package bridge.car;

public class Street extends Road {
	
	public Street(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		super.run();
		car.run();
		System.out.println("在市区街道行驶");
	}
}

package bridge.car;

public class Speedway extends Road {
	
	public Speedway(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		car.run();
		System.out.println("在高速公路上行驶");
	}
}

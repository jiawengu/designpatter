package bridge.car;

public class Client {
	
	public static void main(String[] args) {
		Road road = new Street(new Bus());
		road.run();
		
		Road road2 = new Speedway(new SmallCar());
		road2.run();
	}
}

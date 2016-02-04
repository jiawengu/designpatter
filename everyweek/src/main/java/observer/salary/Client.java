package observer.salary;

import java.util.Observer;

public class Client {
	public static void main(String[] args) {
		Observer observer = new Allen();
		Chris chris = new Chris(observer);
		chris.setChange();
		chris.notifyObservers();
	}
}

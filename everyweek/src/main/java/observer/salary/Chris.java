package observer.salary;

import java.util.Observable;
import java.util.Observer;

public class Chris extends Observable {
	
	public Chris(Observer observer){
		addObserver(observer);
	}
	public void setChange(){
		setChanged();
	}
}

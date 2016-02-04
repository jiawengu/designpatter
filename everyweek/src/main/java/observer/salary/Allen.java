package observer.salary;

import java.util.Observable;
import java.util.Observer;

public class Allen implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("12月份工资已到账，请查收，如有疑问及时联系我。");
	}

}

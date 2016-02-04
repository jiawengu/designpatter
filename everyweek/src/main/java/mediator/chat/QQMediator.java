package mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class QQMediator implements ChatMediator {
	
	private List<Classmate> list;
	public QQMediator(){
		list = new ArrayList<Classmate>();
	}
	
	public void send(String msg, Classmate mate){
		System.out.println(mate.name + " : " + msg);
		for (Classmate classmate : list) {
			if(classmate == mate){
				continue;
			}
			classmate.setMsg(msg);
			classmate.receive();
		}
	}

	public void add(Classmate classmate) {
		list.add(classmate);
	}

}

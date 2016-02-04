package observer.cmcc;

import java.util.ArrayList;
import java.util.List;

public class Chris implements ObserverCustomer, SubjectCustomer {
	
	private int balance;
	@SuppressWarnings("unused")
	private SubjectCorporation subject;
	private List<ObserverCorporation> list;
	public Chris(SubjectCorporation subject, int balance){
		this.subject= subject;
		subject.registerObserver(this);
		this.balance = balance;
		list = new ArrayList<ObserverCorporation>();
	}
	public void update(String msg) {
		System.out.println(msg);
	}
	public void registerObserver(ObserverCorporation observer) {
		list.add(observer);
	}
	public void removeObserver(ObserverCorporation observer) {
		list.remove(observer);
	}
	public void notifyObserver() {
		for (ObserverCorporation observer : list) {
			consume();
			observer.update(balance);
		}
	}
	private void consume(){
		while(balance > 0){
			try {
				Thread.sleep(1000);
				balance --;
				System.out.println("我的话费：" + balance);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

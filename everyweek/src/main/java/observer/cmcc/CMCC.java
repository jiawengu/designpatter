package observer.cmcc;

import java.util.ArrayList;
import java.util.List;

public class CMCC implements SubjectCorporation, ObserverCorporation {
	private final String msg = "你的号码已欠费，请续交话费";
	private List<ObserverCustomer> list;
	boolean isNotify;
	public CMCC(){
		list = new ArrayList<ObserverCustomer>();
	}
	
	public void registerObserver(ObserverCustomer observer) {
		if(observer != null){
			
			list.add(observer);
		}
	}

	public void removeObserver(ObserverCustomer observer) {
		boolean isExist = list.remove(observer);
		if(isExist){
			System.out.println("已删除");
		}else{
			System.out.println("不存在");
		}
		
	}

	public void notifyObserver() {
		for (ObserverCustomer observer : list) {
			if(isNotify){
				observer.update(msg);
			}else{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void update(int balance) {
		if(balance <= 0){
			isNotify = true;
		}
	}

}

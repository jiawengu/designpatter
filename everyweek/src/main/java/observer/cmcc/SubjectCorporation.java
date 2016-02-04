package observer.cmcc;

public interface SubjectCorporation {
	
	public void registerObserver(ObserverCustomer observer);
	public void removeObserver(ObserverCustomer observer);
	public void notifyObserver();
	
}

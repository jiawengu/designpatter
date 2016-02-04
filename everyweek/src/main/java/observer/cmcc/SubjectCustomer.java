package observer.cmcc;

public interface SubjectCustomer {
	
	public void registerObserver(ObserverCorporation observer);
	public void removeObserver(ObserverCorporation observer);
	public void notifyObserver();
	
}

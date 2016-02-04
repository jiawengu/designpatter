package observer.cmcc;

public class Client {
	public static void main(String[] args) {
		
		SubjectCorporation subjectCorporation = new CMCC();
		Chris chris = new Chris(subjectCorporation, 10);
		ObserverCorporation oc = (ObserverCorporation) subjectCorporation;
		chris.registerObserver(oc);
		chris.notifyObserver();
		subjectCorporation.notifyObserver();
	}
}

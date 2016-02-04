package proxy.staticproxy;

public class Yaodi implements Person {
	Person person;
	
	public Yaodi(Person person){
		this.person = person;
	}
	
	public void love() {
		person.love();
	}

}

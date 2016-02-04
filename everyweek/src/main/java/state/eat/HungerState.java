package state.eat;

public class HungerState implements State {
	
	private Person person;
	
	public HungerState(Person person){
		this.person = person;
	}
	public void eat() {
		System.out.println("已经饥渴难耐了,开吃了...");
		person.setState(new FullState(person));
		
	}

	public void rest() {
		System.out.println("饿的两眼发慌，你让我休息？");
	}

}

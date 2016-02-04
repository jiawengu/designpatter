package state.eat;

public class FullState implements State {

	private Person person;
	
	public FullState(Person person){
		this.person = person;
	}
	public void eat() {
		System.out.println("吃饱了，不能在吃了");
	}

	public void rest() {
		System.out.println("吃饱喝足，就可以高枕无忧,HU...HU...");
		person.setState(new HungerState(person));
	}

}

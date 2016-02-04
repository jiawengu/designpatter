package state.eat;

public class Person {
	
	private State state;
	public Person(){
		state = new HungerState(this);
	}
	public void eat(){
		state.eat();
	}
	
	public void rest(){
		state.rest();
	}
	
	public void setState(State state){
		this.state = state;
	}
}

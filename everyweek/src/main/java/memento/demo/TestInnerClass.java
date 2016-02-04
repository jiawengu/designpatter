package memento.demo;


public class TestInnerClass {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.createMemento();
		o.modifyState4Test(100);
		o.setMemento();
		new Caretaker();
		
		
	}
}

class Originator {
	private int state = 90;
	private Caretaker c = new Caretaker();

	public void setMemento() {

		Memento memento = (Memento) c.getMemento();
		state = memento.getState();
	}
	

	public void createMemento() {
		c.saveMemento(new Memento(state));
	}

	public void modifyState4Test(int m) {
		state = m;
		System.out.println("the state is " + state + " now");
	}

	private class Memento implements MementoIF {
		private int state;

		private Memento(int state) {
			this.state = state;
		}

		private int getState() {
			return state;
		}
	}
}

interface MementoIF {

}

class Caretaker {
	private MementoIF m;

	public void saveMemento(MementoIF m) {
		this.m = m;
	}

	public MementoIF getMemento() {
		return m;
	}
}

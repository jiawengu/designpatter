package command.control;

public class Client {
	public static void main(String[] args) {
		
		Control cont = new Control();
		cont.setCommand(new LightOnCommand(new BedroomLight()), new LightOffCommand(new BedroomLight()));
		cont.onButtonWasPressed();
		cont.undoButtonWasPressed();
	}
}

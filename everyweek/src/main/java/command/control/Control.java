package command.control;

public class Control {
	
	private Command onCommand;
	private Command offCommand;
	private Command undoCommond;
	public void setCommand(Command onCommand, Command offCommand){
		this.onCommand = onCommand;
		this.offCommand = offCommand;
		undoCommond = new NoComand();
	}
	
	public void onButtonWasPressed(){
		onCommand.execute();
		undoCommond = onCommand;
	}
	
	public void offButtonWasPressed(){
		offCommand.execute();
		undoCommond = offCommand;
	}
	
	public void undoButtonWasPressed(){
		undoCommond.undo();
	}
}

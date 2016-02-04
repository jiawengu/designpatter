package mediator.chat;

public abstract class Classmate {
	
	public String msg;
	public void setMsg(String msg){
		this.msg = msg;
	}
	public ChatMediator chatMediator;
	public String name;
	public abstract void receive();
	public abstract void sent(String msg);
	public void add(){
		chatMediator.add(this);
	}
}

package mediator.chat;

public interface ChatMediator {
	public void send(String msg, Classmate mate);
	public void add(Classmate classmate);
}

package mediator.chat;

public class Zhaojianhui extends Classmate {
	
	
	public Zhaojianhui(ChatMediator chat) {
		name = "zhao";
		chatMediator = chat;
		add();
	}
	@Override
	public void receive() {
		System.out.println(name + ": 已收到信息，" + msg);
	}

	@Override
	public void sent(String msg) {
		chatMediator.send(msg, this);
	}

}

package mediator.chat;

public class Tianhuazheng extends Classmate {

	public Tianhuazheng(ChatMediator chat) {
		name = "tian";
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

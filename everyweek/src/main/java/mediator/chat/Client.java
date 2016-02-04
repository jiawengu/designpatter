package mediator.chat;

public class Client {
	public static void main(String[] args) {
		
		ChatMediator chatMediator = new QQMediator();
		Zhaojianhui zhao = new Zhaojianhui(chatMediator);
		new Tianhuazheng(chatMediator);
		zhao.sent("你好");
	}
	
}

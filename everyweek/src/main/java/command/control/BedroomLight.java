package command.control;

public class BedroomLight implements Light{
	
	public void on(){
		System.out.println("卧室灯已亮");
	}
	
	public void off(){
		System.out.println("卧室灯已灭");
	}
}

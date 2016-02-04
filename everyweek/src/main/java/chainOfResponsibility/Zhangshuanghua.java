package chainOfResponsibility;

public class Zhangshuanghua implements KissHandler {

	private KissHandler wang;
	
	public Zhangshuanghua(){
		wang = new Wangkunpeng();
	}
	public void accept(int money, String name) {
		if(money > 100000){
			System.out.println("张双华同意Kiss");
		}else{
			
			wang.accept(money, name);
		}
	}

}

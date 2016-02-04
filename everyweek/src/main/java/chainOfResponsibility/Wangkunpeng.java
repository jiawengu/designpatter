package chainOfResponsibility;

public class Wangkunpeng implements KissHandler {

	public void accept(int money, String name) {
		if(name.equals("Sunpeng")){
			System.out.println("王坤鹏同意Kiss");
		}else{
			System.out.println("滚");
		}
	}

}

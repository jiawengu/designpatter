package chainOfResponsibility;

public class Limei implements KissHandler {

	private KissHandler hua;
	
	public Limei(){
		hua = new Zhangshuanghua();
	}
	public void accept(int money, String name) {
		if(money > 10000){
			System.out.println("李美同意Kiss");
		}else{
			hua.accept(money, name);
		}
	}

}

package factory.weixin;

public abstract class Girl {
	
	String description;
	
	public abstract void shake();
	
	public void add(){
		System.out.println("添加好友" );
	}
	
	public void yue(){
		System.out.println("约出来");
	}
	
	public String getName(){
		return description;
	}
}

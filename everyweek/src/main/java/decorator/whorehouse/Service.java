package decorator.whorehouse;

public abstract class Service {
	
	protected String name;
	protected int price;
	
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
}

package decorator.meal;

public class BreadMeal implements Meal {

	private int kinds;
	private int cost;
	
	
	public BreadMeal(int kinds, int cost) {
		super();
		this.kinds = kinds;
		this.cost = cost;
	}

	public int getKinds() {
		
		return kinds;
	}

	public int cost() {
		
		return cost;
	}

}

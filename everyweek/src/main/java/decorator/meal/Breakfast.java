package decorator.meal;

public class Breakfast implements Meal {
	
	private int kinds;
	private int cost;
	private Meal meal;
	
	public Breakfast(int kinds, int cost, Meal meal) {
		super();
		this.kinds = kinds;
		this.cost = cost;
		this.meal= meal;
	}

	public int getKinds() {
		return kinds + meal.getKinds();
	}

	public int cost() {
		return cost + meal.cost();
	}

}

package decorator.meal;

public class Client {
	public static void main(String[] args) {
		
		Meal meal = new BreadMeal(1, 10);
		Breakfast b = new Breakfast(1, 15, meal);
		System.out.println(b.cost());
	}
	
}

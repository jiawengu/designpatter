package strategy.kongzicollege;

public class College {
	public static void main(String[] args) {
		Student s = new Mayun(new LoveMoney());
		System.out.println(s.askPolitics());
	}
}	

package strategy.kongzicollege;

public class Mayun implements Student {
	private String name;
	private AskPolitics askPolitics;
	
	
	public Mayun(AskPolitics askPolitics) {
		super();
		setName("mayun");
		this.askPolitics = askPolitics;
	}


	public String askPolitics() {
		
		return askPolitics.askPolitics();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}

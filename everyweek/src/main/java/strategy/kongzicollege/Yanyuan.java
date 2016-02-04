package strategy.kongzicollege;

public class Yanyuan implements Student {

	private String name;
	private AskPolitics askPolitics;
	
	
	public Yanyuan(AskPolitics askPolitics) {
		super();
		name = "Yanyuan";
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


	public AskPolitics getAskPolitics() {
		return askPolitics;
	}


	public void setAskPolitics(AskPolitics askPolitics) {
		this.askPolitics = askPolitics;
	}
	
	

}

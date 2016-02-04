package flyweight.simple.tree;

public class LiuTree extends Tree {
	private String special;
	
	public LiuTree(String special){
		this.special = special;
	}
	
	public String getSpecial(){
		return special;
	}
}

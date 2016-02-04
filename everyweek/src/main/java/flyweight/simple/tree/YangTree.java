package flyweight.simple.tree;

public class YangTree extends Tree {
	
	private String special;
	private int counter = 0;
	public YangTree(){
		special = "yang";
		System.out.println(counter ++);
		
	}
	
	public String getSpecial(){
		return special;
	}
}

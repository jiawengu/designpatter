package flyweight.simple.tree;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.genInstance();
		factory.creatTree(100);
		factory.creatTree(100);
		factory.creatTree(100);
		
		factory.creatTree(50);
		factory.creatTree(50);
		factory.creatTree(50);
		factory.creatTree(50);
	}
}

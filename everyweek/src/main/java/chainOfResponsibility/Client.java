package chainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		KissHandler kissHandler = new Limei();
		kissHandler.accept(10000, "Sunpeng");
	}
}

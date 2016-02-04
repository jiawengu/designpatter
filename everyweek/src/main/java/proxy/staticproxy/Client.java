package proxy.staticproxy;

public class Client {
	public static void main(String[] args) {
		Yaodi yaodi = new Yaodi(new Wenzhang());
		yaodi.love();
	}
}

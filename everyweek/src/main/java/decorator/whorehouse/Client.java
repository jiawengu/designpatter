package decorator.whorehouse;

public class Client {
	public static void main(String[] args) {
		Liurushi liurushi = new Liurushi(new Yimapingchuan());
		System.out.println(liurushi.getPrice() + "-----" + liurushi.getName());
	}
}

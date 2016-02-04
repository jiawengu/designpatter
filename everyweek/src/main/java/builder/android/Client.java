package builder.android;

public class Client {
	public static void main(String[] args) {
		Leijun leijun = new Leijun(new XiaomiBuilder());
		AndroidMobile mobile = leijun.construct();
		System.out.println(mobile.getCpu());
	}
}

package adapter.earphone;

public class Client {
	public static void main(String[] args) {
		
//		AndroidEarPhone android = new XiaomiEarPhone();
//		AppleEarPhone apple = new AdapterEarPhone(android);
//		apple.insertApple();
		
		AppleEarPhone apple = new Iphone100EarPhone();
		AndroidEarPhone android = new AdapterEarPhone(apple);
		android.insertAndroid();
	}
}

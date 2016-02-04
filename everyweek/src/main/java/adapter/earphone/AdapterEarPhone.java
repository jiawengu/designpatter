package adapter.earphone;

public class AdapterEarPhone implements AppleEarPhone, AndroidEarPhone {
	
	private AndroidEarPhone android;
	private AppleEarPhone apple;
	public AdapterEarPhone(AndroidEarPhone android){
		this.android = android;
	}
	public AdapterEarPhone(AppleEarPhone apple){
		this.apple = apple;
	}
	public void insertApple() {
		android.insertAndroid();
	}
	public void insertAndroid() {
		apple.insertApple();
	}

}

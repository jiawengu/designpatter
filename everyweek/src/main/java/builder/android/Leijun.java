package builder.android;

public class Leijun {
	private AndroidMobileBuilder androidMobileBuilder;
	
	public Leijun(AndroidMobileBuilder androidMobileBuilder) {
		this.androidMobileBuilder = androidMobileBuilder;
	}
	
	public AndroidMobile construct(){
		androidMobileBuilder.addCpu();
		androidMobileBuilder.addCamera();
		androidMobileBuilder.addScreen();
		return androidMobileBuilder.getAndroidMobile();
	}
}

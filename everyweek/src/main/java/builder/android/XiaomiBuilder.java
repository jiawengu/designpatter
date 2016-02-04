package builder.android;

public class XiaomiBuilder implements AndroidMobileBuilder{
	
	private AndroidMobile mobile;
	
	public XiaomiBuilder(){
		mobile = new AndroidMobile();
	}
	public void addCpu() {
		mobile.setCpu("高通");
	}

	public void addCamera() {
		mobile.setCamera("三星");
	}

	public void addScreen() {
		mobile.setScreen("天马");
	}

	public AndroidMobile getAndroidMobile() {
		return mobile;
	}
	
}

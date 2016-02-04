package factory.weixin;

public class Client {
	public static void main(String[] args) {
		SocialApp sa = new WeixinApp();
		sa.getGirl(GirlType.PLUMP);
	}
}

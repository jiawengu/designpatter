package factory.weixin;

public class WeinxinBeautifulGirl extends Girl{
	public WeinxinBeautifulGirl() {
		description = "微信上漂亮的女孩";
	}
	
	@Override
	public void shake() {
		System.out.println("打开微信摇一摇");
	}
}

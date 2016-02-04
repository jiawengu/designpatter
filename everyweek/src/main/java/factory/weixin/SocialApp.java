package factory.weixin;

public abstract class SocialApp {
	public Girl getGirl(GirlType type){
		Girl girl = createGirl(type);
		girl.shake();
		girl.add();
		girl.yue();
		return girl;
	}

	protected abstract Girl createGirl(GirlType type);
}

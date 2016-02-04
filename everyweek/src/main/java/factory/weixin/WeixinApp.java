package factory.weixin;

public class WeixinApp extends SocialApp {

	@Override
	protected Girl createGirl(GirlType type) {
		if(type == GirlType.BEAUTIFUL){
			return new WeinxinBeautifulGirl();
		}else if(type == GirlType.SEX){
			return new WeinxinSexGirl();
		}else if(type == GirlType.PLUMP){
			return new WeinxinPlumpGirl();
		}else{
			return null;
		}
	}

}

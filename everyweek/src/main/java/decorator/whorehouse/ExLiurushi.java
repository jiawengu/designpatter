package decorator.whorehouse;

public class ExLiurushi extends Service {
	
	private Liurushi liurushi;
	private Service service;
	
	public ExLiurushi(Liurushi liurushi, Service service) {
		this.liurushi = liurushi;
		this.service = service;
		name = "超级柳如是,状态好的时候";
		price = 1000;
	}
	
	@Override
	public String getName() {
		return name + liurushi.getService().getName() + service.getName();
	}
	
	@Override
	public int getPrice() {
		return price + liurushi.getPrice() + service.getPrice();
	}
}

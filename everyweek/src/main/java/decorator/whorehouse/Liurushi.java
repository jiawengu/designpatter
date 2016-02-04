package decorator.whorehouse;

public class Liurushi extends Service {
	private Service service;
	
	public Liurushi(Service service){
		this.service = service;
		name = "柳如是";
		price = 500;
	}
	
	@Override
	public String getName() {
		return name + service.getName();
	}
	
	@Override
	public int getPrice() {
		return price + service.getPrice();
	}
	
	public Service getService(){
		return service;
	}
}

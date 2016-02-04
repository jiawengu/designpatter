package proxy.dynamicproxy;

public class LimenClient {
	public static void main(String[] args) {
		
		BrokerInvocationHandler handler = new BrokerInvocationHandler();
		BuyTrainTicket buyTrainTicket = (BuyTrainTicket) handler.bind(new LimeiBuyTrainTicket());
		buyTrainTicket.buy();
		
//		BrokerMethodInterceptor interceptor = new BrokerMethodInterceptor();
//		LimeiBuyTrainTicket limei= (LimeiBuyTrainTicket) interceptor.getInstance(new LimeiBuyTrainTicket());
//		limei.buy();
		
	}
}

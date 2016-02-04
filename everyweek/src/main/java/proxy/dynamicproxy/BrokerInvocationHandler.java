package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BrokerInvocationHandler implements InvocationHandler {

	//	private BuyTrainTicket buyTrainTicket;
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("start");
		Object object = method.invoke(target);
		System.out.println("end");
		return object;
	}

}

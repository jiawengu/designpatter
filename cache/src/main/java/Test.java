import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mycache.MyCache;
import mycache.Student;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-cache.xml");
		MyCache cache = (MyCache) context.getBean("myCache");
		Student s = cache.findByName("50");
		System.out.println(s);
	}
}

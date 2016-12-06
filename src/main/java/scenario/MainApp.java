package scenario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		Reference reference = (Reference)applicationContext.getBean("reference");
		System.out.println(reference);
	}

}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CustomerService;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImplementation();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}

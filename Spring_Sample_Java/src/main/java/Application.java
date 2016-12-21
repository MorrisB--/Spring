import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.morrisballenger.service.CustomerService;
import com.morrisballenger.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// CustomerService service = new CustomerServiceImpl();
		CustomerService service = appContext.getBean("customerSerivce", CustomerService.class);
		System.out.println(service);
		CustomerService service2 = appContext.getBean("customerSerivce", CustomerService.class);
		System.out.println(service2); // service and service 2 are the same objects

		System.out.println(service.findAll().get(0).getFirstName());

	}

}

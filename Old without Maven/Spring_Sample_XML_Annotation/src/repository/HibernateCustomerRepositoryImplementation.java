package repository;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class HibernateCustomerRepositoryImplementation implements CustomerRepository {

	/* (non-Javadoc)
	 * @see repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("FirstName0");
		customer.setLastName("LastName0");

		customers.add(customer);
		
		return customers;
	}

}

package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImplementation;

public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImplementation();

	/* (non-Javadoc)
	 * @see service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}

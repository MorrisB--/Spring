package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;

public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository;
	
	// Spring needs to be able to see the default constructor
	public CustomerServiceImplementation(){
		
	}
	
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}

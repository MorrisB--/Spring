package com.morrisballenger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.morrisballenger.model.Customer;
import com.morrisballenger.repository.CustomerRepository;

@Service("customerService")
// "singleton" in parenthesis will also work, final string below is better.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // will default to singleton if not specified
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.morrisballenger.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

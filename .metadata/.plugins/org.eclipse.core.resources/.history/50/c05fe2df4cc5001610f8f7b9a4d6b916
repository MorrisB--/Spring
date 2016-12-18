package com.morrisballenger.service;

import java.util.List;

import com.morrisballenger.model.Customer;
import com.morrisballenger.repository.CustomerRepository;
import com.morrisballenger.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.morrisballenger.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

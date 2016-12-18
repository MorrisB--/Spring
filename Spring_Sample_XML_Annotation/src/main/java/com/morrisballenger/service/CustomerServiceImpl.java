package com.morrisballenger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.morrisballenger.model.Customer;
import com.morrisballenger.repository.CustomerRepository;
import com.morrisballenger.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
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

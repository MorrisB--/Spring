package com.morrisballenger.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.morrisballenger.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.morrisballenger.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("FirstName0");
		customer.setLastName("LastName0");

		customers.add(customer);

		return customers;
	}

}

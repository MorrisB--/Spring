package com.morrisballenger.repository;

import java.util.List;

import com.morrisballenger.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
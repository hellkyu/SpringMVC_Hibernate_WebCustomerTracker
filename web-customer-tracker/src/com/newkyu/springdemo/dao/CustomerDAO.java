package com.newkyu.springdemo.dao;

import java.util.List;

import com.newkyu.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId); 
}

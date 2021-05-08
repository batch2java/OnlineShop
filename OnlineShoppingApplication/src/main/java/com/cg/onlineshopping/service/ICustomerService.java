package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Customer;

public interface ICustomerService {
	public Customer addCustomer(Customer cust);
	public Customer updateCustomer(Customer cust);
	public Customer removeCustomer(Customer cust);
	public Customer viewCustomer(Customer cust);
	public List<Customer> ViewAllCustomers(String location);

}

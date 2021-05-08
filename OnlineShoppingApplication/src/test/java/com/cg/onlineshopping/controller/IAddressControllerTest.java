package com.cg.onlineshopping.controller;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cg.onlineshopping.entities.Address;
import com.cg.onlineshopping.entities.Customer;
import com.cg.onlineshopping.service.IAddressService;

public class IAddressControllerTest {
	@InjectMocks
	private IAddressController iAddressController;//class for test//controller object
	@Mock
	private IAddressService addressService;//iadressservice is depent on iadreesscontroller
	@Test
	public void viewAllAddress()
	{
		Address add1 = new Address();
		add1.setStreetNo("131D");
		add1.setBuildingName("KrupaComplex");
		add1.setCity("Hyderabad");
		add1.setState("Telangana");
		add1.setCountry("INDIA");
		add1.setPincode("500042");
//		Customer cust1 = new Customer();
//		cust1.setCustomerId(1002);
//		add1.setCustomerAdd(cust1);
		
		Address add2 = new Address();
		add2.setStreetNo("131D");
		add2.setBuildingName("KrupaComplex");
		add2.setCity("Hyderabad");
		add2.setState("Telangana");
		add2.setCountry("INDIA");
		add2.setPincode("500042");
		Customer cust2 = new Customer();
//		cust2.setCustomerId(1002);
//		add2.setCustomerAdd(cust2);
		
		List<Address> addList = new ArrayList<>();
		addList.add(add1); addList.add(add2);
		ResponseEntity<Address> add3 = new ResponseEntity<>(HttpStatus.OK);//
		Mockito.when(iAddressController.addAddress(add2)).thenReturn(add3);//addadress returns of type responseentity
		
		//assertThat(iAddressController.addAddress(add1)).isEqualTo(add3);
	}
}


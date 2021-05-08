package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.entities.Address;
import com.cg.onlineshopping.error.AddressNotFoundException;
import com.cg.onlineshopping.repository.IAddressRepository;
import com.cg.onlineshopping.service.IAddressService;
@Service
public class IAdressServiceimpl implements IAddressService {
@Autowired
IAddressRepository addressRepo;
	@Override
	public Address AddAddress(Address add) {
		// TODO Auto-generated method stub
		if(add == null)
			throw new AddressNotFoundException();

		else{
			addressRepo.save(add);

			return add;
		}
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		if(add == null)
			throw new AddressNotFoundException();
		else {
			addressRepo.save(add);
			return add;
		}
	
	}

	@Override
	public Address removeAddress(int addressId) {
		// TODO Auto-generated method stub
		Optional<Address> add = addressRepo.findById(addressId);
		if(!add.isPresent())
			throw new AddressNotFoundException();
		else {
			addressRepo.deleteById(addressId);
			return add.get();
		}
		
	}

	@Override
	public List<Address> viewAllAddress() {
		// TODO Auto-generated method stub
		List<Address> list = addressRepo.findAll();
		if(list.isEmpty())
			throw new AddressNotFoundException();
		else
			return list;
	}

	@Override
	public Address viewAddress(int addressId) {
		// TODO Auto-generated method stub
		Optional<Address> viewAdd = addressRepo.findById(addressId);
		if(!viewAdd.isPresent())
			throw new AddressNotFoundException();
		else {
			return viewAdd.get();
		}
	}
	
	/*@Override
	public Address viewAddressByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		Address add = addRepo.viewAddressByCustomerId(customerId);
		return add ;
	}*/
}



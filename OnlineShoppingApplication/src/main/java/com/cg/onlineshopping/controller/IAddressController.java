package com.cg.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.onlineshopping.entities.Address;
import com.cg.onlineshopping.service.IAddressService;


@RestController
@RequestMapping("/api/v1")
public class IAddressController {
	@Autowired(required=true)
	IAddressService addressService;
	@PostMapping(path="/create")
    public ResponseEntity<Address> addAddress( @RequestBody Address add) {
        Address address = addressService.AddAddress(add);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
	@PutMapping(path="/update")
    public ResponseEntity<Address> updateAddress( @RequestBody Address add) {
        Address address = addressService.updateAddress(add);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
	@DeleteMapping(path="/deleteById/{addressId}")
	public ResponseEntity<Address> removeAddress( @PathVariable int addressId) {
        Address address = addressService.removeAddress(addressId);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
@GetMapping(path = "/getall")
	
    public ResponseEntity<List<Address>> viewAllAddress(){
        List<Address> list =  addressService.viewAllAddress();
        System.out.println(list);
        //list.removeAll(list);
                return new ResponseEntity<List<Address>>(list, HttpStatus.OK);
    }
@GetMapping(path = "/getall/{addressId}")

public ResponseEntity<Address> viewAddress(@PathVariable int addressId){
    Address add =  addressService.viewAddress(addressId);
    
    
            return new ResponseEntity<Address>(add, HttpStatus.OK);
}
	

}

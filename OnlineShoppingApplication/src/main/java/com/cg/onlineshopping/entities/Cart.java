package com.cg.onlineshopping.entities;


import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart {
@Id 
	private String cartId;
	//private String userId;
	@OneToMany
	private List<Product>products; // product and quantity 
	@OneToOne
	private Customer customer;
	
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
		public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public Customer getCustomer() {
		return customer;
	}
		@Override
	public String toString() {
		return "Cart [cartId=" + cartId + " products=" + products + ", customer=" + customer
				+ "]";
	}
		public String getCartId() {
		return cartId;
	}
		public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}

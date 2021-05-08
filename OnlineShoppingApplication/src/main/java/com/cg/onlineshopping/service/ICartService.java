package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Cart;
import com.cg.onlineshopping.entities.Product;

public interface ICartService {

	public Cart addProductToCart(Cart cart, Product p,int quantity);
	public Cart removeProductFromCart(Cart cart,Product p);
	public Cart updateProductQuantity(Cart cart, Product p,int quantity);
	public Cart removeAllProducts(Cart cart);
	public List<Product> viewAllProducts(Cart cart);
}

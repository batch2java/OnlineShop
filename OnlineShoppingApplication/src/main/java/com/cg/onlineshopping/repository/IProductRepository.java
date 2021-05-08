package com.cg.onlineshopping.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineshopping.entities.Product;

public interface IProductRepository extends JpaRepository<Product, String> {
	/*public List<Product> viewAllProducts();
	 public Product addProduct(Product product);
	 public Product updateProduct(Product product);
	 public Product viewProduct(int id);
	 public List<Product> viewProductsByCategory(String cat); 
	 public Product removeProduct(String prodid);*/
}

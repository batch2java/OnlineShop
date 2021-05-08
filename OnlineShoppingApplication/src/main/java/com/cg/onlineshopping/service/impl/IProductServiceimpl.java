package com.cg.onlineshopping.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cg.onlineshopping.entities.Product;
import com.cg.onlineshopping.repository.IProductRepository;
import com.cg.onlineshopping.service.IProductService;
@Service
public class IProductServiceimpl implements IProductService {
	@Autowired
	IProductRepository productRepo;

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		//logger.info("Entered viewAllProducts()");
		/*List<Product> allProducts = productRepo.findAll();
		if(allProducts.isEmpty()) {
			throw new ProductNotFoundException("No Products Found");
		}

		return allProducts;*/
		return null;
	}
	

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		
			//logger.info("Entered addProduct()");
			/*if(product == null)
				throw new ProductNotFoundException("No Products Found");
			else {
				productRepo.save(product);*/

				return  null;
			}
		
	

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product viewProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewProductsByCategory(String cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removeProduct(String prodid) {
		// TODO Auto-generated method stub
		return null;
	}

}

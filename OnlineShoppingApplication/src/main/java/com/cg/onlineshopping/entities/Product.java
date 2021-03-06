package com.cg.onlineshopping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Product {
@Id	
private String productId;
private String productName;

private double price;
private String color;
private String dimension;
private String specification;
private String manufacturer;
private int quantity;
@ManyToOne
private Category category;


public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getDimension() {
	return dimension;
}
public void setDimension(String dimension) {
	this.dimension = dimension;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", color=" + color
			+ ", dimension=" + dimension + ", specification=" + specification + ", manufacturer=" + manufacturer
			+ ", quantity=" + quantity + ", category=" + category + "]";
}

}

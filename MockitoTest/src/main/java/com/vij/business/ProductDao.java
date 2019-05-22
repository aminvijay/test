package com.vij.business;

public interface ProductDao {	
	int getAvailableProducts(Product product);
	int orderProduct(Product product, int orderQuantity);
}

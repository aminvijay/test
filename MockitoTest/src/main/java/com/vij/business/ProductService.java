package com.vij.business;

public class ProductService {
	
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		 this.productDao = productDao;
	}
	
	public boolean buy(Product product, int orderQuantity) throws InsufficientProductsException {
		boolean transactionStatus = false;
		int availableQuantity = productDao.getAvailableProducts(product);
		if(orderQuantity > availableQuantity ) {
			throw new InsufficientProductsException();
		}
		
		productDao.orderProduct(product, orderQuantity);
		transactionStatus=true;
		return transactionStatus;
				
	}

}

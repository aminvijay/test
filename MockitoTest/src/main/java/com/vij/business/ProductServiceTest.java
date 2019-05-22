package com.vij.business;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

import static org.mockito.Mockito.*;


public class ProductServiceTest {
	
	private ProductService productService;
	private ProductDao productDao;
	private Product product;
	private int purchaseQuantity = 15;
	
	@Before
	public void setupMock() {
		productService = new ProductService();
		product = mock(Product.class);
		productDao = mock(ProductDao.class);
		productService.setProductDao(productDao);
	}
	
	@Test
	public void testBuy() throws InsufficientProductsException {
		int availableQuanitity = 30;
		System.out.println("Stubbing getAvailableProducts(prodct to return " + availableQuanitity);
		
		when(productDao.getAvailableProducts(product)).thenReturn(availableQuanitity);
		System.out.println("Calling productServce.buy(product, " + purchaseQuantity);
		productService.buy(product, purchaseQuantity);
		System.out.println(" verifyying productDao after buy " + purchaseQuantity + "  ttt " + productDao.getAvailableProducts(product));
		verify(productDao).orderProduct(product, purchaseQuantity);
		System.out.println(" verifying getAvailableproducst calls ayleast once");
		verify(productDao, atLeastOnce()).getAvailableProducts(product);
		
		InOrder order = inOrder(productDao);
		order.verify(productDao).getAvailableProducts(product);
		order.verify(productDao).orderProduct(product, purchaseQuantity);
	}
	
	
	@Test(expected = InsufficientProductsException.class)
	public void purchaseWithInsufficientQuantity() throws InsufficientProductsException {
		int availableQuantity = 3;
		System.out.println("\\n\\n\\Stubbing getAvailableProducts(product) to return " + availableQuantity);
		when(productDao.getAvailableProducts(product)).thenReturn(availableQuantity);
		
		try {
			System.out.println("productService.buy(product" + purchaseQuantity + ") should throw InsufficientProductsException");
            productService.buy(product, purchaseQuantity);
		} catch (InsufficientProductsException e) {
			System.out.println("InsufficientProductsException has been thrown");
            verify(productDao, times(0)).orderProduct(product, purchaseQuantity);
            System.out.println("Verified orderProduct(product, " + purchaseQuantity + ") is not called");
            throw e;
		}
	}

}

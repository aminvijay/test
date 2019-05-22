package com.vij.business;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockCreationAnnotationTest {
	
	@Mock
	private ProductDao productDao;
	
	@Mock
	private Product product;
	
	@Before
	public void setupMock(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMockCreation() {
		//assertNotNull(product);
		//assertNotNull(productDao);
	}
	
	@Test
	public void testBuy() throws InsufficientProductsException {
		/*
	    
	    
	    when(productDao.getAvailableProducts(product)).thenReturn(30);
	    assertEquals(30,productDao.getAvailableProducts(product));
	    productService.buy(product, 5);
	    verify(productDao).orderProduct(product, 5);*/
	}

}

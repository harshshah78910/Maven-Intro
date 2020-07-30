package com.harsh.maven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.harsh.maven.dao.ProductDao;
import com.harsh.maven.dao.ProductDaoImpl;
import com.harsh.maven.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void testCreate() {
		
		ProductDao product = new ProductDaoImpl();
		Product p = new Product();
		p.setId(1);
		p.setName("Demo Product");
		
		product.create(p);
		
		assertNotNull(product.read(1));
		
	}

}

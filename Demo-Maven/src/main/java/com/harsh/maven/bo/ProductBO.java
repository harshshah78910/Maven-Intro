package com.harsh.maven.bo;

import com.harsh.maven.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product find(int id);
}

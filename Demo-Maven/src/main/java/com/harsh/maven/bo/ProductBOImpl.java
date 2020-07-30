package com.harsh.maven.bo;

import com.harsh.maven.dao.ProductDao;
import com.harsh.maven.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDao dao;

	@Override
	public void create(Product product) {

		dao.create(product);
	}

	@Override
	public Product find(int id) {
		return dao.read(id);
	}

}

package com.harsh.maven.dao;

import java.util.HashMap;
import java.util.Map;

import com.harsh.maven.dto.Product;

public class ProductDaoImpl implements ProductDao {

	Map<Integer, Product> map = new HashMap<Integer, Product>();

	@Override
	public void create(Product product) {

		map.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {

		return map.get(id);
	}

	@Override
	public void update(Product product) {

		map.put(product.getId(), product);
	}

	@Override
	public void delete(int id) {
		map.remove(id);
	}

}

package com.search.api.service;

import java.util.List;

import com.search.api.entity.Product;

public interface ProductService {
	
	List<Product> searchProduct(String query);

	
	

}

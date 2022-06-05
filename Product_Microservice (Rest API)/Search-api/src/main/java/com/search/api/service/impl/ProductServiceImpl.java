package com.search.api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.search.api.entity.Product;
import com.search.api.repository.ProductRepository;
import com.search.api.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> searchProduct(String query) {
		List<Product> products= productRepository.searchProduct(query);
		return products;
	}

		
}

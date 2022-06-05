package com.sellermicroservice.api.service;

import java.util.List;


import com.sellermicroservice.api.dto.productDto;


public interface productService {

	productDto addProduct(productDto Product);

	productDto updateProduct(productDto Product, Integer prodID);

	productDto getProductById(Integer prodID);

	List<productDto> getAllProduct();

	void deleteProduct(Integer prodID);
}

package com.sellermicroservice.api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sellermicroservice.api.Exception.ResourceNotFoundException;
import com.sellermicroservice.api.Reposetory.ProductRepo;
import com.sellermicroservice.api.dto.productDto;
import com.sellermicroservice.api.entity.product;
import com.sellermicroservice.api.service.productService;

@Service
public class productServiceImpl implements productService {
	
	@Autowired
	private ProductRepo ProductRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public productDto addProduct(productDto Productdto) {
		product Product=this.dtoToProduct(Productdto);
		product saveProduct =this.ProductRepo.save(Product);
		return this.ProductToDto(saveProduct);
	}

	@Override
	public productDto updateProduct(productDto ProductDto, Integer prodID) {
		product Product=this.ProductRepo.findById(prodID).orElseThrow(()-> new ResourceNotFoundException ("product","id",prodID));
		
		Product.setName(ProductDto.getName());
		Product.setType(ProductDto.getType());
		Product.setCategory(ProductDto.getCategory());
		Product.setPricemin(ProductDto.getPricemin());
		Product.setPricemax(ProductDto.getPricemax());
		
		product updatedProduct=this.ProductRepo.save(Product);
		productDto ProductDto1=this.ProductToDto(updatedProduct);
		return ProductDto1;
	}

	@Override
	public productDto getProductById(Integer prodID) {
		product Product=this.ProductRepo.findById(prodID).orElseThrow(()-> new ResourceNotFoundException ("product","id",prodID));
		return this.ProductToDto(Product);
	}

	@Override
	public List<productDto> getAllProduct() {
		List<product> Product=this.ProductRepo.findAll();
		List<productDto> productDtos= Product.stream().map(Products ->this.ProductToDto(Products)).collect(Collectors.toList());
		return productDtos;
	}

	@Override
	public void deleteProduct(Integer prodID) {
		product Product=this.ProductRepo.findById(prodID).orElseThrow(()-> new ResourceNotFoundException("product", "Id", prodID));
        this.ProductRepo.delete(Product);
	}
	
	public product dtoToProduct(productDto productDto) {
		product Product=this.modelMapper.map(productDto, product.class);
		return Product;
	}
	public productDto ProductToDto(product Product) {
		productDto ProductDto=this.modelMapper.map(Product,productDto.class);
		return ProductDto;
	}
	

}

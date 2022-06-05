package com.sellermicroservice.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellermicroservice.api.dto.ApiResponce;
import com.sellermicroservice.api.dto.productDto;
import com.sellermicroservice.api.service.productService;

@RestController
@RequestMapping ("/seller")
public class productController {

	@Autowired
	private productService ProductService;

	// Add Product
	@PostMapping("/")
	public ResponseEntity<productDto> addProduct(@RequestBody productDto ProductDto){
		productDto addProductDto=this.ProductService.addProduct(ProductDto);
		return new ResponseEntity<> (addProductDto,HttpStatus.CREATED);
		}
	
	//PUT- update user
	@PutMapping("/{prodID}")
	public ResponseEntity<productDto> updateProduct(@RequestBody productDto ProductDto,@PathVariable Integer prodID){
		productDto updatecProduct=this.ProductService.updateProduct(ProductDto,prodID);
		return ResponseEntity.ok(updatecProduct);
	}
	// Delet Product
	@DeleteMapping("/{prodID}")
	public ResponseEntity<?> deletProduct(@PathVariable("prodID") Integer prodID){
		this.deletProduct(prodID);
		return new ResponseEntity(new ApiResponce("product deleted successfully", true),HttpStatus.OK);
	}
	//Get ALLProduct
	@GetMapping("/")
	public ResponseEntity<List<productDto>> getAllProduct(){
		return ResponseEntity.ok(this.ProductService.getAllProduct());
	}
	
	@GetMapping("/{prodID}")
	public ResponseEntity<productDto> getProduct(@PathVariable Integer prodID){
		return ResponseEntity.ok(this.ProductService.getProductById(prodID));
	}
}

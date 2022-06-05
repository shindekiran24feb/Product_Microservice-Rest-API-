package com.search.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.search.api.entity.Product;
import com.search.api.service.ProductService;

@Controller
@RequestMapping("/customer")
public class ProductController {

	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {

		this.productService = productService;
	}

	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProduct(String query) {
		System.out.println(query);
		return ResponseEntity.ok(productService.searchProduct(query));

	}

}

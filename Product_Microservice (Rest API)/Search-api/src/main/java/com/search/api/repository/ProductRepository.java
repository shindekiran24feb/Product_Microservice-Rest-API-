package com.search.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value= "SELECT * FROM Product p WHERE "+"p.name LIKE CONCAT('%',:keyword,'%')"+
	         "OR p.type LIKE CONCAT('%',:keyword,'%')"+
	         "OR p.category LIKE CONCAT('%',:keyword,'%')", nativeQuery = true)
	List<Product> searchProduct(String keyword);

}
//'%query%'    CONCAT('%',:keyword,'%')
//value=  , nativeQuery = true
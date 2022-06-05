package com.sellermicroservice.api.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sellermicroservice.api.entity.product;

public interface ProductRepo extends JpaRepository<product, Integer> {

     
}

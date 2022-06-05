package com.sellermicroservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table (name="product")
@Getter
@Setter
public class product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ProdID;
	
	private String name;
	private String type;
	private String category;
	private String description;
	private String pricemin;
	private String pricemax;
	
	
	
	
	
	
	
}

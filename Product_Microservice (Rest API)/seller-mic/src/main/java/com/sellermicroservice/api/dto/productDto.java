package com.sellermicroservice.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class productDto {

	private int prodID;
	private String name;
	private String type;
	private String category;
	private String description;
	private String pricemin;
	private String pricemax;
}

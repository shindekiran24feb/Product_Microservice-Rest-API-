package com.sellermicroservice.api.Exception;


public class ResourceNotFoundException extends RuntimeException {

	String resourceName;
	String FieldName;
	long fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %l",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		FieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}

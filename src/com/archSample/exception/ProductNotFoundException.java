package com.archSample.exception;

public class ProductNotFoundException extends Exception{

	private static final long serialVersionUID = -43429653756534083L;

	public ProductNotFoundException(String message) {
        super(message);
    }
}

package com.archSample.service;

import java.util.Set;

import com.archSample.domain.Product;
import com.archSample.exception.ProductNotFoundException;

/**
 * 
 * Service responsible for initializing our product list and any other business logic we might need.
 * 
 * @author Adam
 *
 */
public interface ProductService {

	public String getImageForBarcode(String barcode) throws ProductNotFoundException;

}

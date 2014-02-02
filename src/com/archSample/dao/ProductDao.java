package com.archSample.dao;

import com.archSample.domain.Product;
import com.archSample.exception.ProductNotFoundException;

public interface ProductDao {

	public Product getProductByBarCode(String barcode) throws ProductNotFoundException;
}

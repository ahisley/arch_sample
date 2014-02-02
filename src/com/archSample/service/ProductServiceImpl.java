package com.archSample.service;

import com.archSample.dao.ProductDao;
import com.archSample.dao.ProductDaoImpl;
import com.archSample.domain.Product;
import com.archSample.exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{

	
	private ProductDao productDao;


	public ProductServiceImpl()
	{
		//Init our dao inside the constructor.  Most java frameworks will give you tools to do this wiring automatically.
		productDao = new ProductDaoImpl();
	}
	
	@Override
	public String getImageForBarcode(String barcode) throws ProductNotFoundException{
		
		Product p = productDao.getProductByBarCode(barcode);
		return p.getImageLocation();
	}

}

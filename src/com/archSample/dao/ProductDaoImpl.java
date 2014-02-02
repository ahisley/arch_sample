package com.archSample.dao;

import java.util.HashSet;
import java.util.Set;

import com.archSample.domain.Product;
import com.archSample.exception.ProductNotFoundException;


public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getProductByBarCode(String barcode)
			throws ProductNotFoundException {
		
		
		//Normally this is where we would do a database lookup using the barcode value. 
		//For this limited implementation, just fake the data:
		
		Set<Product> products = new HashSet();
		
		//Add some fake data....
		products.add(new Product("Logitech HD PRO WEBCAM C920", "17229129368L", "991017", "logitech.jpg"));
		products.add(new Product("Plantronics 648 stereo neck headset", "646422102351L", "991018", "plantronics.jpg"));
		products.add(new Product("Cyber Acoustics Ac-204 Headset", "17229129351L", "991019", "cyberacs.jpg"));
		
		//Fake the product "search"
		for(Product p: products)
		{
			if(p.getBarCode().equals(barcode) || p.getAltBarCode().equals(barcode))
			{
				return p;
			}
		}
		
		throw new ProductNotFoundException("No product found matching barCode " + barcode);
	}

}

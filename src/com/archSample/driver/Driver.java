package com.archSample.driver;

import com.archSample.exception.ProductNotFoundException;
import com.archSample.service.ProductService;
import com.archSample.service.ProductServiceImpl;

public class Driver {

	//Run me to do a sample load of our products
	public static void main(String[] args)
	{
		//Instantiate our service implementation.  This would normally be done for us by a dependency injection
		//java framework like Spring
		ProductService productService = new ProductServiceImpl();
		
		//Pretend we got a barcode to search on and do the search
		
		String barcode = "17229129368L";
		
		try {
			System.out.println("Your image is: " + productService.getImageForBarcode(barcode));
		} catch (ProductNotFoundException e) {

			System.out.println("The barcode " + barcode + " was not found in our system database.");
		}

		
	}
}

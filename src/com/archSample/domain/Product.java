package com.archSample.domain;

public class Product {

	//Unique ID if we want to store our product list in a database somewhere
	private Long id;
	private String productName;
	
	//I noticed most products have two accepted bar codes.  I don't know if that's a hard requirement or not,
	//but I set it up this way on the object model.
	private String barCode;
	
	private String altBarCode;
	
	//Just saving as a string for now, this could actually contain the image data or a real File object instead
	private String imageLocation;
	
	//Convenience constructor
	public Product(String productName, String barCode, String altBarCode, String imageLocation)
	{
		this.productName = productName;
		this.barCode = barCode;
		this.altBarCode = altBarCode;
		this.imageLocation = imageLocation;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getImageLocation() {
		return imageLocation;
	}
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getAltBarCode() {
		return altBarCode;
	}

	public void setAltBarCode(String altBarCode) {
		this.altBarCode = altBarCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}

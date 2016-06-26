package com.rohit.venturesity;

public class ProductDetails {
	
	private String catagoryId;
	private String productTitle;
	private String brandId;
	
	public ProductDetails(String catagoryId, String productTitle, String brandId) {
		super();
		this.catagoryId = catagoryId;
		this.productTitle = productTitle;
		this.brandId = brandId;
	}
	public String getCatagoryId() {
		return catagoryId;
	}
	public void setCatagoryId(String catagoryId) {
		this.catagoryId = catagoryId;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	
}

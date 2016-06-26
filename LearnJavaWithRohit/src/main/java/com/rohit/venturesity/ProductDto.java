package com.rohit.venturesity;

public class ProductDto {

	private final String productDisc;
	private final String catagory;
	
	public ProductDto(String catagory,String productDisc) {
		this.productDisc = productDisc;
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "ProductDto [productDisc=" + productDisc + ", catagory="
				+ catagory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((catagory == null) ? 0 : catagory.hashCode());
		result = prime * result
				+ ((productDisc == null) ? 0 : productDisc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDto other = (ProductDto) obj;
		if (catagory == null) {
			if (other.catagory != null)
				return false;
		} else if (!catagory.equals(other.catagory))
			return false;
		if (productDisc == null) {
			if (other.productDisc != null)
				return false;
		} else if (!productDisc.equals(other.productDisc))
			return false;
		return true;
	}
	
	
	
	
	
}

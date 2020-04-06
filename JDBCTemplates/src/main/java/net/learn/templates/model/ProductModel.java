package net.learn.templates.model;

import java.math.BigDecimal;

public class ProductModel {

	private long productId;
	
	private String productName;
	
	private String productOwner;
	
	private int productQuantity;
	
	private BigDecimal productPrice;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", productOwner="
				+ productOwner + ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}
	
	
	

}

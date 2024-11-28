package learn.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Column (name = "product_id") // Defining a custom attribute for column
	@Id // Defining a field as Primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY) // Automatically creating an Id
	private int productID;
	
	@Column (name = "product_name", nullable = false, length = 50) // Defining custom attributes for column
	private String productName;
	
	@Column (name = "product_price") // Defining a custom attribute for column
	private float productPrice;
	
	public Product() {
		super();
	}

//	public Product(int productID, String productName, float productPrice) {
//		super();
//		this.productID = productID;
//		this.productName = productName;
//		this.productPrice = productPrice;
//	}
	
	public Product(String productName, float productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
}

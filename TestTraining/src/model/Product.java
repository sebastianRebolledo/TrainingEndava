package model;

public class Product {
	
	private String nameProduct;
	private String price;
	
	public Product (String nameProduct, String price) {
		this.nameProduct=nameProduct;
		this.price=price;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}

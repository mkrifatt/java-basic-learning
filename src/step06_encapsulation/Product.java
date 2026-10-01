package step06_encapsulation;

public class Product {
	//FIELDS
	private String name;
	private int price;
	private int quantity;
	private String category;
	
	//CONSTRUCTOR
	public Product(String name, int price, int quantity, String category) {
		//below are the fields of the product class or u can say the attributes of the product class
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		
	}
	
	//METHOD TO DISPLAY PRODUCT DETAILS
	void displayProduct() {
		System.out.println("Product:" + name);
		System.out.println("Price:" + price);
		System.out.println("Quantity:" + quantity);
		System.out.println("Category:" + category);
	}
	
	//METHOd TO CALCULATE TOTAL VALUE OF PRODUCT
	int calculateTotalValue() {
		return price * quantity;
	}
}

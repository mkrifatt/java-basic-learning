package step07_getters_and_setters;

public class Product {

	// ENCAPSULATED (PRIVATE) FIELDS
	private String name;
	private double price;
	private int quantity;
	private String category;
	
	// CONSTRUCTOR 
	public Product(String name, double price, int quantity, String category) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		
	}
	// GATTERS
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getCategory() {
		return category;
	}
	
	// SETTERS
	public void setPrice(int price) {
		if(price >= 0) {	// Protection logic using encapsulation
			this.price = price;
			} else {
				System.out.println("Price cannot be negative.");
			}
		}
	
	// Internal class methods (can still access private fields directly)
	void displayProduct() {
		System.out.println("Product Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Category: " + category);
	}
	double calculateTotalValue() {
		return price * quantity;
	}
	
	
	
	
	
	
	
	
	
	
	
}

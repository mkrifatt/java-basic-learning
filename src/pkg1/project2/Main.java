package pkg1.project2;

public class Main {

	public static void main(String[] args) {
		// creating product objects using the constructor
		Product product1 = new Product("Laptop", 1000, 5, "Electronics");
		Product product2 = new Product("Shirt", 50, 10, "Clothing");
		
		// printing product1 details
		System.out.println("product 1: " + product1.name);
		System.out.println("price: " + product2.price);
		System.out.println("quantity: " + product1.quantity);
		System.out.println("category: " + product2.category);
		
		System.out.println();
		
		// printing product2 details
		System.out.println("product 2: " + product2.name);
		System.out.println("price: " + product2.price);
		System.out.println("quantity: " + product2.quantity);
		System.out.println("category: " + product2.category);
		

	}

}

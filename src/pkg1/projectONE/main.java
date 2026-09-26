package pkg1.projectONE;

public class main {

	public static void main(String[] args) {
		
		product product1 = new product();
		product1.name = "Laptop";
		product1.price = 1000;
		product1.quantity = 5;
		product1.category = "Electronics";
		
		product product2 = new product();
		product2.name = "Phone";
		product2.price = 500;
		product2.quantity = 10;
		product2.category = "Electronics";
		
		System.out.println("Product 1: " + product1.name);
		System.out.println("Price: " + product1.price);
		System.out.println("Quantity: " + product1.quantity);
		System.out.println("Category: " + product1.category);
		
		System.out.println();
		
		System.out.println("Product 2: " + product2.name);
		System.out.println("Price: " + product2.price);
		System.out.println("Quantity: " + product2.quantity);
		System.out.println("Category: " + product2.category);
		
		
	}

}

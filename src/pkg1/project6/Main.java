package pkg1.project6;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("Laptop", 999.99, 2, "Electronics");
		Product product2 = new Product("Smartphone", 599.99, 20, "Electronics");
		
		product1.setPrice(500);
		//accessing values securely through getters
		System.out.println(product1.getName() + " Total value : " + product1.calculateTotalValue());
		System.out.println(product2.getName() + " Total value : " + product2.calculateTotalValue());

	}

}

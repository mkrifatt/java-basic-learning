package step05_methods_calculations;

public class Main {

	public static void main(String[] args) {
		
		//CREATING OBJECT OF PRODUCT CLASS
		Product product1 = new Product ("Laptop", 1000, 5, "Electronics");
		Product product2 = new Product ("Shirt", 50, 10, "clothing");
		
		//DISPLAYING PRODUCT DETAILS
		product1.displayProduct();
		System.out.println();
		product2.displayProduct();
		
		//CALCULATING TOTAL VALUE OF PRODUCTS
		int laptopTotal = product1.calculateTotalValue();
		int shirtTotal = product2.calculateTotalValue();
		
		int totalValue = laptopTotal + shirtTotal;
		System.out.println("\nTotal Value of Laptop: " + laptopTotal);
		System.out.println("Total Value of Shirt: " + shirtTotal);

	}

}

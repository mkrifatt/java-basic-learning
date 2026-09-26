package pkg1.Project3;


public class main {
    // Fields
    String name;
    int price;
    int quantity;
    String category;

    // Constructor
    public main(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Method to display product details
    void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }
}
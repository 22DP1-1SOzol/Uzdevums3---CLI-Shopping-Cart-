// CommandLineApp.java

import java.util.Scanner;

public class CommandLineApp {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add product to cart");
            System.out.println("2. Remove product from cart");
            System.out.println("3. List products in cart");
            System.out.println("4. Show cart total");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    Product product = new Product(1, productName, 10.0, "General");
                    shoppingCart.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = scanner.nextLine();
                    shoppingCart.removeProduct(productToRemove);
                    break;
                case 3:
                    shoppingCart.displayProducts();
                    break;
                case 4:
                    System.out.println("Cart total: $" + shoppingCart.calculateTotal());
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

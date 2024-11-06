import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store!");

        Product phone = ProductFactory.createProduct("electronics", 1, "Smartphone", 299.99);
        Product laptop = ProductFactory.createProduct("electronics", 2, "Laptop", 499.99);
        Product jacket = ProductFactory.createProduct("electronics", 3, "PC", 699.99);
        Product shirt = ProductFactory.createProduct("electronics", 4, "PS4", 199.99);

        Cart cart = new Cart();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a product to cart");
            System.out.println("2. Show cart items");
            System.out.println("3. Create order");
            System.out.println("4. Cancel order");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nSelect a product to add to the cart:");
                    System.out.println("1. Smartphone - $299.99");
                    System.out.println("2. Laptop - $499.99");
                    System.out.println("3. PC - $699.99");
                    System.out.println("4. PS4 - $199.99");
                    System.out.print("Choose a product (1-4): ");
                    int productChoice = scanner.nextInt();

                    switch (productChoice) {
                        case 1:
                            cart.addProduct(phone);
                            System.out.println("Smartphone added to the cart.");
                            break;
                        case 2:
                            cart.addProduct(laptop);
                            System.out.println("Laptop added to the cart.");
                            break;
                        case 3:
                            cart.addProduct(jacket);
                            System.out.println("PC added to the cart.");
                            break;
                        case 4:
                            cart.addProduct(shirt);
                            System.out.println("PS4 added to the cart.");
                            break;
                        default:
                            System.out.println("Invalid product selection.");
                            break;
                    }
                    break;
                case 2:
                    cart.displayCartItems();
                    break;
                case 3:
                    ObservableOrder order = new ObservableOrder(cart);
                    CustomerNotification customerNotification = new CustomerNotification("Abzal");
                    order.addObserver(customerNotification);

                    OrderController orderController = new OrderController();
                    Command createOrderCommand = new CreateOrderCommand(order);

                    orderController.executeCommand(createOrderCommand);
                    break;
                case 4:
                    System.out.println("Order canceled.");
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        }
    }
}

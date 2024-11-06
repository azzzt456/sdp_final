public class Order {
    private Cart cart;
    private boolean isPlaced;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public void placeOrder() {
        isPlaced = true;
        System.out.println("Order placed with total: $" + cart.calculateTotal());
    }

    public void cancelOrder() {
        if (isPlaced) {
            isPlaced = false;
            System.out.println("Order canceled.");
        } else {
            System.out.println("No order to cancel.");
        }
    }
}
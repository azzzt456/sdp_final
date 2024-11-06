public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product phone = ProductFactory.createProduct("electronics", 1, "Smartphone", 299.99);
        Product shirt = ProductFactory.createProduct("clothing", 2, "T-Shirt", 19.99);

        // Работа с корзиной
        Cart cart = new Cart();
        cart.addProduct(phone);
        cart.addProduct(shirt);
        cart.displayCartItems();
        System.out.println("Total: $" + cart.calculateTotal());

        // Оплата через PayPal
        PaymentAdapter payment = new PayPalAdapter();
        payment.processPayment(cart.calculateTotal());
    }
}
public class PayPalAdapter implements PaymentAdapter {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Интеграция с системой PayPal
    }
}
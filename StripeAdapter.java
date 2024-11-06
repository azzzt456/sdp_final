public class StripeAdapter implements PaymentAdapter {
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
        // Интеграция с системой Stripe
    }
}
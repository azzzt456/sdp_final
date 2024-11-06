public class CustomerNotification implements Observer {
    private String customerName;

    public CustomerNotification(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + customerName + ": " + message);
    }
}

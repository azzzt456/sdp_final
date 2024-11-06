import java.util.ArrayList;
import java.util.List;

public class ObservableOrder extends Order {
    private List<Observer> observers = new ArrayList<>();

    public ObservableOrder(Cart cart) {
        super(cart);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void placeOrder() {
        super.placeOrder();
        notifyObservers("Order placed successfully.");
    }

    @Override
    public void cancelOrder() {
        super.cancelOrder();
        notifyObservers("Order canceled.");
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

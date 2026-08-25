interface Observer {
    void update(String status);
}interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}import java.util.ArrayList;
import java.util.List;

class Order implements Subject {

    private String status;
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer customer : customers) {
            customer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("Order Status: " + status);
        notifyObservers();
    }
}class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " received notification: Order is " + status);
    }
}public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        Customer customer1 = new Customer("Thippu");
        Customer customer2 = new Customer("Rahul");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Shipped");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");
    }
}
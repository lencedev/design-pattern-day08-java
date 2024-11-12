package Observer;

public class TestObserver {
    public static void main ( String [] args ) {
        Order order = new Order();
        Customer customer = new Customer();
        order.addObserver(customer);
        order.setData("123.5326, 237.9277","6 W 40 th Street, New York", 10);
        order.notifyObservers();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    void takeOrder(Order order) {
        orders.add(order);
    }

    void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}

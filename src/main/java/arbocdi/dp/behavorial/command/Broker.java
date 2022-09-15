package arbocdi.dp.behavorial.command;

import java.util.LinkedList;
import java.util.List;

public class Broker {
    private List<Order> orders = new LinkedList<>();

    public Broker enqueueOrder(Order order) {
        orders.add(order);
        return this;
    }

    public void placeOrders() {
        orders.forEach(Order::execute);
    }
}

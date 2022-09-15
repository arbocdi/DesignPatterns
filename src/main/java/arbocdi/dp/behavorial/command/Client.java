package arbocdi.dp.behavorial.command;

public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Broker broker = new Broker()
                .enqueueOrder(new Order.BuyOrder(stock,1,"golem"))
                .enqueueOrder(new Order.SellOrder(stock,5,"legion"));
        broker.placeOrders();
    }
}

package arbocdi.dp.structural.facade;

public class Client {
    public static void main(String[] args) {
        new OrderFacade().makeOrder(new Order());
    }
}

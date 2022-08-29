package arbocdi.dp.structural.facade;

public class OrderFacade {

    private PaymentService paymentService = new PaymentService();
    private KitchenService kitchenService = new KitchenService();
    private DeliveryService deliveryService = new DeliveryService();

    public void makeOrder(Order order){
        System.out.println("===making the order===");
        paymentService.payForOrder(order);
        kitchenService.cookOrder(order);
        deliveryService.delivryOrder(order);
    }
}

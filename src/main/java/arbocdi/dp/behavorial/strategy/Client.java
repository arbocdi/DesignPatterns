package arbocdi.dp.behavorial.strategy;

public class Client {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.setStrategy(new AdditionStrategy());
        System.out.println(operation.execute(10,20));
        operation.setStrategy(new MultiplicationStrategy());
        System.out.println(operation.execute(10,20));
    }
}

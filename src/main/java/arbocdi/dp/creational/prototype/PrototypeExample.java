package arbocdi.dp.creational.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Car ford = new Car.Ford();
        ford.setPrice(90);

        Car fordClone = ford.clone();
        fordClone.setPrice(60);

        System.out.println(ford);
        System.out.println(fordClone);
    }
}

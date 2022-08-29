package arbocdi.dp.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Shape.Triangle(new Color.Green());
        shape.draw();
        shape = new Shape.Rectangle(new Color.Red());
        shape.draw();
    }
}

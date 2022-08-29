package arbocdi.dp.structural.decorator;

public class Client {
    public static void main(String[] args) {
        new ShapeDecorator.BorderShapeDecorator(
                new ShapeDecorator.ScrollShapeDecorator(
                        new Shape.Circle()
                )
        ).draw();
    }
}

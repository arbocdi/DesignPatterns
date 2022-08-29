package arbocdi.dp.creational.factoryMethod;

public class ConcreteCreator {
    public static class ShapeFactory {
        public Shape getShape(String type) {
            if (type.equals("RECTANGLE")) {
                return new Shape.Rectangle();
            } else if (type.equals("SQUARE")) {
                return new Shape.Square();
            } else {
                throw new RuntimeException("Cant create shape.");
            }
        }
    }
}

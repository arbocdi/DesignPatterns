package arbocdi.dp.creational.factoryMethod;

public class AbstractCreator {
    public static abstract class ShapeFactory {
        protected abstract Shape factoryMethod();
        public Shape getShape(){
            return factoryMethod();
        }
    }

    public static class RectangleFactory extends ShapeFactory {
        @Override
        protected Shape factoryMethod() {
            return new Shape.Rectangle();
        }
    }
    public static class SquareFactory extends ShapeFactory {
        @Override
        protected Shape factoryMethod() {
            return new Shape.Square();
        }
    }

    public static void main(String[] args) {
        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
    }

}

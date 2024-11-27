package arbocdi.dp.creational.factoryMethod;

public class AbstractCreator {
    public static abstract class ShapeDrawer {
        protected abstract Shape factoryMethod();
        public void drawShape(){
            factoryMethod().draw();
        }
    }

    public static class RectangleDrawer extends ShapeDrawer {
        @Override
        protected Shape factoryMethod() {
            return new Shape.Rectangle();
        }
    }
    public static class SquareDrawer extends ShapeDrawer {
        @Override
        protected Shape factoryMethod() {
            return new Shape.Square();
        }
    }

    public static void main(String[] args) {
       new RectangleDrawer().drawShape();
    }

}

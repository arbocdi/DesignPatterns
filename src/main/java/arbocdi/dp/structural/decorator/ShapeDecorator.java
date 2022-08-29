package arbocdi.dp.structural.decorator;

import lombok.Getter;

public abstract class ShapeDecorator implements Shape {
    @Getter
    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public static class BorderShapeDecorator extends ShapeDecorator{

        public BorderShapeDecorator(Shape shape) {
            super(shape);
        }

        @Override
        public void draw() {
            System.out.println(" Drawing border");
            getShape().draw();
        }
    }
    public static class ScrollShapeDecorator extends ShapeDecorator{
        public ScrollShapeDecorator(Shape shape) {
            super(shape);
        }

        @Override
        public void draw() {
            System.out.println("Drawing scroll");
            getShape().draw();
        }
    }
}

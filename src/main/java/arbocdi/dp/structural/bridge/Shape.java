package arbocdi.dp.structural.bridge;

public abstract class Shape {

    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public static class Triangle extends Shape {
        public Triangle(Color color) {
            super(color);
        }

        @Override
        public void draw() {
            System.out.println("Drawing triangle");
            color.fill();
        }
    }

    public static class Rectangle extends Shape {
        public Rectangle(Color color) {
            super(color);
        }

        @Override
        public void draw() {
            System.out.println("Drawing rectangle");
            color.fill();
        }
    }
}

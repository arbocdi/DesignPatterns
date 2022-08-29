package arbocdi.dp.structural.decorator;

public interface Shape {
    void draw();

    class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing circle");
        }
    }
    class Triangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing triangle");
        }
    }
}

package arbocdi.dp.creational.factoryMethod;

public interface Shape {
    void draw();

    class Rectangle implements Shape{

        @Override
        public void draw() {
            System.out.println("Drawing rectangle");
        }
    }

    class Square implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing square");
        }
    }
}

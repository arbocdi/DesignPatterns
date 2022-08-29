package arbocdi.dp.structural.composite;

import java.util.LinkedList;
import java.util.List;

public interface Shape {
    void draw();

    class Rectangle implements Shape{

        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    class Circle implements Shape{

        @Override
        public void draw() {
            System.out.println("Drawing circle");
        }
    }

    /**
     * composite Shape не имеет методов добавления листьев -
     * модификация шаблона дабы избежать нарушения Interface Segregation
     */
    class Picture implements Shape{

        private List<Shape> shapes = new LinkedList<>();

        @Override
        public void draw() {
            System.out.println("===Drawing a picture===");
            shapes.forEach(Shape::draw);
        }

        public Picture addShape(Shape shape){
            shapes.add(shape);
            return this;
        }
    }
}


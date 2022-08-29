package arbocdi.dp.creational.prototype;

import lombok.Data;

@Data
public abstract class Car {
    private final String model;
    private int price;
    private Engine engine;

    public Car(String model) {
        this.model = model;
    }

    public abstract Car clone();

    public static class Ford extends Car {

        public Ford() {
            super("Ford");
            setEngine(new Engine.FordEngine());
        }

        @Override
        public Car clone() {
            Ford clone = new Ford();
            clone.setPrice(getPrice());
            clone.setEngine(getEngine().clone());
            return clone;
        }
    }

    public static class Nano extends Car {

        public Nano() {
            super("Nano");
            setEngine(new Engine.NanoEngine());
        }

        @Override
        public Car clone() {
            Ford clone = new Ford();
            clone.setPrice(getPrice());
            clone.setEngine(getEngine().clone());
            return clone;
        }
    }

}

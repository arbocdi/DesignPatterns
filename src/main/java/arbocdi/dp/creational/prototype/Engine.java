package arbocdi.dp.creational.prototype;

public abstract class Engine {
    public abstract Engine clone();
    public static class FordEngine extends Engine{

        @Override
        public Engine clone() {
            return new FordEngine();
        }
    }
    public static class NanoEngine extends Engine{

        @Override
        public Engine clone() {
            return new NanoEngine();
        }
    }
}

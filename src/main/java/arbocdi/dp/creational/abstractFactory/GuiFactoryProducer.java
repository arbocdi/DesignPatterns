package arbocdi.dp.creational.abstractFactory;

public class GuiFactoryProducer {

    public static enum Type {
        WIN, LIN;
    }

    GuiFactory create(Type type) {
        switch (type) {
            case WIN:
                return new WindowsGuiFactory();
            case LIN:
                return new LinuxGuiFactory();
            default:
                throw new RuntimeException(String.format("Type %s not supported", type));
        }
    }
}

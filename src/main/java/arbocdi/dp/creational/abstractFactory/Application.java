package arbocdi.dp.creational.abstractFactory;

public class Application {
    public static void main(String[] args) {
        GuiFactory guiFactory = new GuiFactoryProducer().create(GuiFactoryProducer.Type.LIN);
        Button button = guiFactory.createButton();
        Checkbox checkbox =guiFactory.createCheckbox();
        button.press();;
        checkbox.switchBox();
    }
}

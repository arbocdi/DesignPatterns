package arbocdi.dp.creational.abstractFactory;

public class LinuxGuiFactory implements GuiFactory{
    @Override
    public Checkbox createCheckbox() {
        return new Checkbox.LinuxCheckbox();
    }

    @Override
    public Button createButton() {
        return new Button.LinuxButton();
    }
}

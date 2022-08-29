package arbocdi.dp.creational.abstractFactory;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Checkbox createCheckbox() {
        return new Checkbox.WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new Button.WindowsButton();
    }
}

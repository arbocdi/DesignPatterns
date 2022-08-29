package arbocdi.dp.creational.abstractFactory;

public interface Checkbox {

    void switchBox();

    class WindowsCheckbox implements Checkbox{

        @Override
        public void switchBox() {
            System.out.println("Win checkbox switched");
        }
    }
    class LinuxCheckbox implements Checkbox{

        @Override
        public void switchBox() {
            System.out.println("Lin checkbox switched");
        }
    }
}

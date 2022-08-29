package arbocdi.dp.creational.abstractFactory;

public interface Button {
    void press();
    class WindowsButton implements Button{
        @Override
        public void press() {
            System.out.println("Win button pressed");
        }
    }
    class LinuxButton implements Button{
        @Override
        public void press() {
            System.out.println("Lin button pressed");
        }
    }
}

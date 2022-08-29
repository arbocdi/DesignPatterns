package arbocdi.dp.structural.adapter;

public interface Duck {
    void quark();

    class MyDuck implements Duck{
        @Override
        public void quark() {
            System.out.println("quark");
        }
    }
}

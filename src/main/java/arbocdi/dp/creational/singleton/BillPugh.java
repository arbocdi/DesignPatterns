package arbocdi.dp.creational.singleton;

public class BillPugh {
    private BillPugh() {
    }

    private static class Holder {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        System.out.println("Instance created");
        return Holder.instance;
    }

    public static void main(String[] args) {
        System.out.println("BillPugh");
        System.out.println(BillPugh.getInstance() == BillPugh.getInstance());
    }
}

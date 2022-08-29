package arbocdi.dp.structural.adapter;

public interface Turkey {
    void gubble();

    class MyTurkey implements Turkey {
        @Override
        public void gubble() {
            System.out.println("gubble");
        }
    }
}

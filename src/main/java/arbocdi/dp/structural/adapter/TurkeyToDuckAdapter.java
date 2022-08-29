package arbocdi.dp.structural.adapter;

public class TurkeyToDuckAdapter implements Duck{

    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quark() {
        turkey.gubble();
    }
}

package arbocdi.dp.behavorial.strategy;

public interface OperationStrategy {
    int perform(int i1,int i2);
}
class AdditionStrategy implements OperationStrategy{
    @Override
    public int perform(int i1, int i2) {
        return i1+i2;
    }
}
class SubstractionStrategy implements OperationStrategy{
    @Override
    public int perform(int i1, int i2) {
        return i1-i2;
    }
}
class MultiplicationStrategy implements OperationStrategy{
    @Override
    public int perform(int i1, int i2) {
        return i1*i2;
    }
}

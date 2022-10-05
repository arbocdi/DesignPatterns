package arbocdi.dp.behavorial.strategy;

import lombok.Setter;

public class Operation {
    @Setter
    private OperationStrategy strategy;

    public int execute(int i1, int i2) {
        System.out.println("Using strategy: "+strategy.getClass().getSimpleName()+", params: "+i1+" "+i2);
        return strategy.perform(i1, i2);
    }
}

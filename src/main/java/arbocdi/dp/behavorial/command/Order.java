package arbocdi.dp.behavorial.command;

import lombok.AllArgsConstructor;

public interface Order {

    void execute();

    @AllArgsConstructor
    class SellOrder implements Order {
        private Stock stock;
        private int qty;
        private String name;

        @Override
        public void execute() {
            stock.sell(qty, name);
        }
    }
    @AllArgsConstructor
    class BuyOrder implements Order {

        private final Stock stock;
        private int qty;
        private String name;

        @Override
        public void execute() {
            stock.buy(qty, name);
        }
    }
}

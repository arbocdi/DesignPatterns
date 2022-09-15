package arbocdi.dp.behavorial.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Stock {
    public void buy(int qty, String name) {
        System.out.println("Buying from stock: " + qty + " " + name);
    }

    public void sell(int qty, String name) {
        System.out.println("Selling to stock: " + qty + " " + name);
    }
}

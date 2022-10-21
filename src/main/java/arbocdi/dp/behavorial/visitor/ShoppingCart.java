package arbocdi.dp.behavorial.visitor;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new LinkedList<>();

    public ShoppingCart addItem(Item item) {
        items.add(item);
        return this;
    }

    public void accept(Visitor v) {
        items.forEach(item -> item.accept(v));
    }
}

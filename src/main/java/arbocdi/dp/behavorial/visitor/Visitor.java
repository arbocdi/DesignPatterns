package arbocdi.dp.behavorial.visitor;

import lombok.Getter;

public interface Visitor {
    void visitBook(Item.BookItem item);

    void visitFruit(Item.FruitItem item);

    class PriceCalc implements Visitor {
        @Getter
        private int totalPrice;

        @Override
        public void visitBook(Item.BookItem item) {
            System.out.println(" Calculating book " + item.getBookName() + " by " + item.getAuthor());
            totalPrice += item.getBookPrice();
        }

        @Override
        public void visitFruit(Item.FruitItem item) {
            System.out.println(" Calculating fruit " + item.getFruitName());
            totalPrice += item.getPriceForKg();
        }
    }
}

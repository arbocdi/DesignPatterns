package arbocdi.dp.behavorial.visitor;

import lombok.Getter;

public interface Item {
    void accept(Visitor v);

   class BookItem implements Item {
        @Getter
        private final String bookName;
        @Getter
        private final String author;
        @Getter
        private final int bookPrice;

        public BookItem(String bookName,String author, int bookPrice) {
            this.bookName = bookName;
            this.author=author;
            this.bookPrice = bookPrice;

        }

        @Override
        public void accept(Visitor v) {
            v.visitBook(this);
        }
    }

    class FruitItem implements Item {
        @Getter
        private final String fruitName;
        @Getter
        private final int priceForKg;

        public FruitItem(String fruitName, int priceForKg) {
            this.fruitName = fruitName;
            this.priceForKg = priceForKg;
        }

        @Override
        public void accept(Visitor v) {
            v.visitFruit(this);
        }
    }

}

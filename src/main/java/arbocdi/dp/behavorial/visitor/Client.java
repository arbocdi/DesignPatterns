package arbocdi.dp.behavorial.visitor;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart()
                .addItem(new Item.BookItem("Armageddon", "S.King", 50))
                .addItem(new Item.FruitItem("apple", 10))
                .addItem(new Item.BookItem("The Dark Tower", "S.King", 100));
        Visitor.PriceCalc priceCalc = new Visitor.PriceCalc();
        shoppingCart.accept(priceCalc);
        System.out.println("Total price is " + priceCalc.getTotalPrice());
    }
}

package arbocdi.dp.behavorial.chain;

public class Client {
    public static void main(String[] args) {
        int amt = 123;

        MoneyDispenser moneyDispenser = new MoneyDispenser.Dollar50Dispenser()
                .setNext(
                        new MoneyDispenser.Dollar20Dispenser().setNext(
                                new MoneyDispenser.Dollar1Dispenser()
                        )
                );
        moneyDispenser.dispense(amt);
    }
}

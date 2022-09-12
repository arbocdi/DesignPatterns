package arbocdi.dp.behavorial.chain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public abstract class MoneyDispenser {
    @Getter
    @Setter
    private MoneyDispenser next;

    public abstract void dispense(int amt);

    public static class Dollar50Dispenser extends MoneyDispenser {

        @Override
        public void dispense(int amt) {
            int dispenseAmt = amt / 50;
            System.out.println("50 dollars count " + dispenseAmt);
            getNext().dispense(amt % 50);
        }
    }

    public static class Dollar20Dispenser extends MoneyDispenser {

        @Override
        public void dispense(int amt) {
            int dispenseAmt = amt / 20;
            System.out.println("20 dollars count " + dispenseAmt);
            getNext().dispense(amt % 20);
        }
    }

    public static class Dollar1Dispenser extends MoneyDispenser {

        @Override
        public void dispense(int amt) {
            int dispenseAmt = amt;
            System.out.println("1 dollars count " + dispenseAmt);
        }
    }

}

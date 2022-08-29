package arbocdi.dp.structural.adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Client {
    public static void main(String[] args) {
        Duck duck = new TurkeyToDuckAdapter(new Turkey.MyTurkey());
        duck.quark();
    }
}


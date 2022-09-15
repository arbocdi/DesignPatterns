package arbocdi.dp.behavorial.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ArrayAggregate(10)
                .add("Hello")
                .add("aggregate")
                .add("pattern");
        Iterator iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

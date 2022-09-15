package arbocdi.dp.behavorial.iterator;

import java.util.Arrays;

public class ArrayAggregate implements Aggregate {

    private Object[] store;
    private int currentPosition=0;

    public ArrayAggregate(int size) {
        store = new Object[size];
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator();
    }

    @Override
    public Aggregate add(Object o) {
        store[currentPosition] = o;
        currentPosition++;
        return this;
    }

    class ArrayIterator implements Iterator {

        private int currentPosition = -1;

        @Override
        public Object next() {
            currentPosition++;
            return ArrayAggregate.this.store[currentPosition];
        }

        @Override
        public boolean hasNext() {
            int maxElementPosition = ArrayAggregate.this.store.length - 1;
            return currentPosition < maxElementPosition && ArrayAggregate.this.store[currentPosition + 1] != null;
        }
    }
}

package arbocdi.dp.behavorial.iterator;

import java.lang.reflect.Array;

public interface Aggregate {

    Iterator createIterator();

    Aggregate add(Object o);

}

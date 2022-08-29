package arbocdi.dp.creational.singleton;

public class EagerSingleton {
    //jvm гарантирует выполнение статических блоков инициализации
    //на момент загрузки класса и до его использования каким-либо потоком
    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}

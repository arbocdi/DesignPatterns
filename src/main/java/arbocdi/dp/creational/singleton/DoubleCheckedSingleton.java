package arbocdi.dp.creational.singleton;

import lombok.Getter;

public class DoubleCheckedSingleton {
    @Getter
    private String data;

    private static volatile DoubleCheckedSingleton instance = null;
    private DoubleCheckedSingleton(){

    }
    public static DoubleCheckedSingleton getInstance(){
        if(instance==null){
            //если поле instance имеет модификатор volatile, то
            //все операции чтения образуют happens-before с единственной операцией записи
            //вход в synchronized блок будет выполнен только один раз
            //volatile так же предотвращает доступ к частично-инициализированным объектам
            synchronized (DoubleCheckedSingleton.class){
                if(instance==null){
                    DoubleCheckedSingleton doubleCheckedSingleton = new DoubleCheckedSingleton();
                    //do some init stuff
                    doubleCheckedSingleton.data = "Some data...";
                    //after init complete set instance reference
                    instance = doubleCheckedSingleton;
                }
            }
        }
        return instance;
    }
}

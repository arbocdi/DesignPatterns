# Singleton
* Использовать когда:
  + Нужен только один экземпляр класса и нужно предоставить глобальную точку доступа к нему.
* Trade-offs:
  + <span style = "color:blue">Можно жестко контролировать доступ к инстансу со стороны клиентов</span>
  + <span style = "color:blue">Легко можно перейти от одного инстанса к контроллируему набору инстансов</span>
  + <span style = "color:red">Код, использующий синглтоны, трудно тестировать</span>
  + <span style = "color:red">Если использовать синглтон слишком активно, то это ведет к появлению срытых зависимостей</span>  
* Dependency Injection позволяет реализовать singleton и я вляется
более гибким шаблоном, лишенным его недостатков.
* DI заставляет либо тащить singleton class как явную зависимость, что не всегда удобно - П: логгирование   
![singleton](singleton.png)
### Варианты реализации
* Double Checked Locking (DCL)- экономит ресурсы, т.к. при получении инстанса не нужно кадый раз входить в синхронизированный блок.
  + <span style = "color:red">Нужно четко понимать значения synchronized и volatile</span>
  + <span style = "color:red">Присваивать ссылку на инстанс следует только после выполннения всех действий по инициализации</span>  
```java
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

```  
* Eager Initialization - используется, если инициализация не затрачивает ресурсов
  + <span style = "color:red">Экземпляр создается не на момент вызова getInstance(), а на момент загрузки класса</span>
```java
public class EagerSingleton {
    //jvm гарантирует выполнение статических блоков инициализации
    //на момент загрузки класса и до его использования каким-либо потоком
    //и только один раз на один classloader
    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
```
* Bill Pugh - основан на том, что внутренний класс не загружается
пока к нему нет явного обращения. 
  + <span style = "color:green">Сочетает в себе простоту EagerSingleton и экономичность DCL</span>
  + <span style = "color:red">Если при инициализации синглтона возникнет ошибка, то будет выброшено исключение - NoClassDefFoundError</span>  
```java
public class BillPugh {
    private BillPugh(){}
    private static class Holder{
        private static final BillPugh instance = new BillPugh();
    }
    public static BillPugh getInstance(){
        return Holder.instance;
    }
}
```    
# Software Design Principles (PCD)
* Самое затратное в разработке ПО его последующая модификация,
   принципы проектирования (Design Principles) в том числе призваны сократить расходны на последующую модификацию кода.
* Шаблоны проектирования базируются на принципах проектирования.  
### Design Smells
  1. <span style="color:blue">Rigidity (ригидность)</span> - ПО тяжело поддается изменениям. Изменения в одном модуле влекут изменения в других модулях (изменения ожидаемы).
  2. <span style="color:blue">Fragility (хрупкость)</span> - изменения в одном месте влекут поломки в других местах (поломки - нежданчик).
  3. <span style="color:blue">Immobility</span> - часть системы можно вынести в отдельный модуль и переиспользовать его в других системах, но требуется много усилий и рисков для собственно выделения этой части системы.
  4. <span style="color:blue">Viscosity (вязкость)</span> - вносить изменения правильным путем трудно, проще использовать какие-то хаки.
  5. <span style="color:blue">Needless Repetition</span> - в системе часто используется копи-паст кусков кода.
  6. <span style="color:blue">Opacity (непрозрачность)</span> - не понятно, что делает тот или иной блок кода.
  7. <span style="color:blue">Needless Complexion </span> - в коде слишком много абстракций и шаблонов, ПО готово к изменениям, которые не произойдут.
### Programming to an Interface
* <span style="color:blue">Interface</span> - это то, как клиент взаимодействует с компонентом.
* <span style="color:blue">Programming to interface</span> означает, что клиент использует supertype (абстрактный класс или интерфейс). Задача - использовать полиморфизм и прятать детали реализации.
```java
//programming to implementation
Dog dog=new Dog();
dog.bark();
//programming to interface
Animal animal=new Dog();//or Cat
animal.makeSound();
```
### Composition Over Inheritance
* Наследование нужно использовать, когда возникает зависимость IS-A (П: Dog is an Animal).
* Композицию нужно использовать, когда возникает зависимость HAS-A (П: Dog has Legs). 
* П: java.util.Properties - наследует Hashtable, в то время как правильнее было бы включить Hashtable как поле Properties.
* П: OrderDish наследует Dish, хотя должна содержать Dish.
```java
//inheritance
class HashMap<T> {
   put();
   get();
}

class OrderStorage extends HashMap<Order> {
   Collection<Order> getByEmployee();
}
//composition
class OrderStorage {
   private HashMap<MyObject> store = new HasMap();
   Collection<Order> getByEmployee();
}
```
### Delegation Principle
* <span style="color:blue">Delegation Principle</span> - don't do all stuff by yourself, delegate it to respective class.
* П: Pattern State - Context делегирует обработку запроса конкретному состоянию.
# SOLID principles
* <span style="color:blue">Single Responsibility Principle</span> - класс должен выполнять хорошо что-то одно.
```java
//Класс Order описывает заказ.
class Order {
    long id;
    List<Dish> dishes;
    //А вот этот метод лишний, форматированием должны заниматься другие классы,
    //при изменении форматированием придется править сам заказ, который вообще только описательный
    String formatOrder();
}
```
* <span style="color:blue">Open Closed Principle</span> - программные сущности (классы, модули, функции) должны быть открыты для расширения, но не для модификации.
  + <span style="color:blue">Модуль Открыт</span> если его можно изменять.
  + <span style="color:blue">Модуль Закрыт</span> если его уже используют другие модули (с определенным контрактом).
```java
//при добавлении животного interact нужно будет дописывать
class Animal{
    String name;
}

public void interact(Animal animal){
    ...
    if(animal.name=="Dog"){
        sout("Bark");
    }
    ...
}
//при использовании принципа открытости-закрытости функция animalSound остается расширяемой, 
//но не требует изменений ее кода при добавлении нового животного
abstract class Animal{
    makeSound();
}
class Dog extends Animal{
    makeSound(){
        sout("Bark");
    }
}
class Cat extends Animal{
    makeSound(){...}
}
public void interact(Animal animal){
    ...
  animal.makeSound();
    ...
}
```   
* <span style="color:blue">Liskov Substitution (замена) Principle</span> - объекты суперкласса можно заменить
объектами подклассов не ломая ПО.
```java
//java при наследовании заставляет следовать принципу LSP (определение метода сохраняется)
//однако можно все равно нарушить контракт и выбросить исключение, вместо возвращения true/false
//чего клиенты не ожидают
class YandexOrderVerifier{
    boolean verify(Order order){
        return ...?true:false;
    }
}
class DeliveryClubOrderVerifier{
    boolean verify(Order order){
        if(...)return true;
        else throw...;
    }
}
```  

```java
class Rectangle {
    setX();
    setY();
    int area();
}

class Square extends Rectangle {
    setY(int y) {
        super.setY(y);
        setX(y);
    }
    setX(int x){
        super.setX(x);
        setY(x);
    }
}
//Но даже так - если есть тесты для площади прямоугольника, они не сработают при таком наследовании
//и LSP будет нарушен => нельзя наследовать квадрат от прямоугольника! 
```
* <span style="color:blue">Interface Segregation (разделение) Principle</span> - клиент (подкласс в данном случае) не должен
реализовывать методы, которые ему не нужны.
```java
interface Shape{
    area();
    volume();
}
//но 2д объекты не имеют объема и лучше бы так
interface Shape{
    area();
}
//solid - твердое тело, сплошной, 3д-форма
interface SolidShape extends Shape {
    volume();
}
```
* <span style="color:blue">Dependency Inversion Principle</span> - программные сущности должны зависеть
от абстракций, а не конкретных имплементаций.
  + При построении иерархии мы мыслим top-to-bottom (от абстракции к реализации),
    при использовании dependency inversion мышление bottom-to-top - имплементации
    должны все равно в зависимостях иметь абстракции, а не конкретные имплементации (повторяет programming to an interface).
```java
class MySqlConnection{
}
class Store{
    MySqlConnection conn;
}
//но что делать, при появлении postgres-соединения?
//нужно следовать принципу dependency inversion
interface Connection{}
class MySqlConnection implements Connection{}
class PostgreSqlConnection implements Connection{}

class Store{
    Connection conn;
}
```    
* <span style="color:blue">Dependency Injection Principle</span> - класс не должен сам создавать объекты
классов, от которых он зависит (через оператор new()), иначе его будет сложно тестировать и сложно подменять реализации
зависимостей (т.н. <span style="color:blue">Hard Dependencies</span>).
```java
interface Service
class MyService

class Client{
    Service service;
    Client(Service service){
        this.service = service;
    }
}
Service service = new MyService();
//DI
Client client = new Client(service);
```  

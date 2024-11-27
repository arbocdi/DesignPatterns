# Factory Method
* Отличия от Abstract Factory:
  + Factory Method возвращает продукт одного супертипа, Abstract Factory возвращает family связанных продуктов.
  + Factory Method это только один из методов класса, класс, содержащий Factory Method может использоваться для чего-то другого, а не просто для создания объектов.
  + Из предыдущего пункта: Factory Method основан на наследовании (классы-наследники определяют логику FM), но сам класс Producer используется не только для получения объектов,
  Abstract Factory же только производит семейство продуктов, между клиентами и AF возникает связь в виде композиции.
  + FM это только один метод, а AF это целый класс.
* Отличия от Template Method:
  + FM ориентирован именно на создание продукта, а TM выносит любую логику в подклассы.
* Компоненты:
  + <span style="color:blue">Creator</span> - супертип, создает объекты Product
  + <span style="color:blue">Product</span> - супертип создаваемых объектов
* Когда использовать:
  - хотим спрятать логику создания объекта от клиента (например она сложная)
  - хотим заставить клиента работать с абстракцией 
  - хотим отделить логику создания Product от него самого
* Solution:
  + Define an interface for creating an object, but let subclasses of that interface decide which class to instantiate.
  
* <span style="color:blue">Factory Method</span> - наиболее строгая реализация
  + <span style="color:red">Для каждого типа Product создается свой Creator</span>
  
  ![FactoryMethod](abstractCreator.png)

  [FactoryMethod example](../../../src/main/java/arbocdi/dp/creational/factoryMethod/AbstractCreator.java)

* Simple Factory - класс-фабрика создает вариации Product одного супертипа, выбор конкретного типа определяется передаваемыми параметрами.
  + <span style="color:red">Метод создания надо дорабатывать для новых подклассов Product</span>
  + <span style="color:green">Клиент может создавать объекты не зная конкретный тип Product</span>
  
  ![ConcreteCreator.png](concreteCreator.png)
  
  [SimpleFactory example](../../../src/main/java/arbocdi/dp/creational/factoryMethod/ConcreteCreator.java)

* Factory - это общее понятие, это программная конструкция (метод или класс), создающая экземпляры.

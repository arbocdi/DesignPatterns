# Factory Method
* Отличия от Abstract Factory:
  + Factory Method возвращает продукт одного супертипа, Abstract Factory возвращает family связанных продуктов.
* Компоненты:
  + <span style="color:blue">Creator</span> - супертип, создает объекты Product
  + <span style="color:blue">Product</span> - супертип создаваемых объектов
* Когда использовать:
  - хотим спрятать логику создания объекта от клиента (например она сложная)
  - хотим заставить клиента работать с абстракцией 
  - хотим отделить логику создания Product от него самого
* Solution:
  + Define an interface for creating an object, but let subclasses of that interface decide which class to instantiate.
  
* <span style="color:blue">Abstract Creator</span> - наиболее строгая реализация
  + <span style="color:red">Для каждого типа Product создается свой Creator</span>
  
  ![abstractCreator.png](abstractCreator.png)

  [AbstractCreator example](../../../src/main/java/arbocdi/dp/creational/factoryMethod/AbstractCreator.java)


* <span style="color:blue">Concrete Creator</span> - одна фабрика создает всю иерархию Product.
  + <span style="color:red">Метод создания надо дорабатывать для новых подклассов Product</span>
  + <span style="color:green">Клиент может создавать объекты не зная конкретный тип Product</span>
  
  ![ConcreteCreator.png](concreteCreator.png)
  
  [ConcreteCreator example](../../../src/main/java/arbocdi/dp/creational/factoryMethod/ConcreteCreator.java)


* <span style="color:blue">Static Creator</span> - аналог предыдущего, только метод создания статический.

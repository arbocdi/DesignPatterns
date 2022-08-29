# Abstract Factory
* Создает семейство Product разных типов (общего супертипа нет)
* Когда использовать:
  + Требуется создавать набор связанных (сгруппированных) продуктов
  + Требуется спрятать логику их создания от клиента
  + Хотим заставить клиента использовать абстракции, вместо конкретных продуктов
  + Требуется отделить логику создания Product от них самих  
* Consequences
  + <span style="color:blue">Достигаем поставленных задач</span>
  + <span style="color:red">Поддержка нового типа product требует доработки интерфейса и реализаций</span>
  
  ![abstractFactory.png](abstractFactory.png)
  
* Пример реализации
  ![abstractFactoryExample.png](abstractFactoryExample.png)
  [AbstractFactory example](../../../src/main/java/arbocdi/dp/creational/abstractFactory/Application.java)

  
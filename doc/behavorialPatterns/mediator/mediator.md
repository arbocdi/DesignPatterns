# Mediator
* Intent: Предоставить объект (mediator), посредством которого будут взаимодействовать другие объекты системы (colleague).
* When to use:
  + Использовать если нужна централизация взаимодействия и само взаимодействие сложное.
* Плюсы:
  + Коллеги упрощаются.
  + Добавление новых коллег простое.
  + Абстрагирует взаимодействие коллег - медиатор хранит в себе логику взаимодействия.
  + Позволяет заменить связь между объектами (Colleague) многие ко многим через один ко многим (через mediator).

* Минусы:
  + Логика медиатора может стать довольно сложной.
* П: чат
+ Vs Facade:
    - Facade aggregates the functionality of separate classes (entire subsystems sometimes) and provides that functionality in a single interface.
    - Mediator: Same as Facade, except that it combines the functionality of all of the aggregate classes to produce new functionality.


![uml](mediatorUml.png)
![typicalStructure](typicalStructure.png)
[Chat Example](../../../src/main/java/arbocdi/dp/behavorial/mediator/Chat.java)

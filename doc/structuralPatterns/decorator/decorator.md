### Decorator (Wrapper)
+ Intent: добавить функционал в класс не используя наследование 
  (можно добавлять методы, выполнять операции до и после выполнения методы компонента).
+ Плюсы:
  + Строго соответствует принципу open-closed т.к. код ConcreteComponent 
    не изменяется.
  + Можно в рантайме добавить функционал к конкретному объекту, а не всему
    классу.
  + Можно создавать цепочки декораторов, добавляя и добавляя функционал.
+ Минусы:
  + Декораторов и их цепочек может быть множество, в них
    может быть сложно разобраться и правильно использовать.
![windows](windows.png)
![decoratorUml](decoratorUml.png)
+ П: InputStreams: InputStream, BufferedInputStream, ObjectInputStream.

[decoratorExample](../../../src/main/java/arbocdi/dp/structural/decorator/Shape.java)
  
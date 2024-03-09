## Java Basics


## Object Oriented Programming in Java


### Class && Object

### Constructor


### Final Keyword

<!-- ### Method Overloading

### Method Overriding -->







### Inheritance



### Java Abstraction: javaTpoing/[John](https://youtu.be/HvPlEJ3LHgE?si=CdM3J1G-NAY9x29W)
There are two ways to achieve abstraction in java
    1. Abstract class (0 to 100%)
    1. Interface (100%)
#### Abstract class in Java
- Code: [Traner_notes\src\com\training\learn\abstractclass\\*.java]
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `extends` Parent{}/public class Daughter `extends` Parent{}
  ```java
  Abstract class:
    0. Constructor / abstract constructor not allowed(abstract classes cannot be instantiated directly)
    1. abstract and non-abstract methods
    2. static/final variables/methods
    3. Not instantiated: can\'t create an object of an abstract class.
    4. Class can't be private or final
    5. abstract static/final methods not allowed(Final/static methods can't override them. so, can't use in child class)
  ```
- class Types:
	1. Concreate class: class with implementation(POJO, JavaBean) | public class ClassName{}
	2. Abstract class: class without implementation | public abstract class ClassName{}
- Abstraction is a process of hiding the implementation details and showing only functionality to the user. || Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery. || Abstraction lets you focus on what the object does instead of how it does it.

- If a class has one abstract method then the class must be abstract.
- Parent will give just the definition not the implementation(body)
- All the abstract methods must be implemented in the child class or must override the methods.
- A class can extend only one abstract class
- extends parent1, parent2 is not allowed. (Multiple inheritance is not supported in Java through class) parent1, parent2 can have the same method name. so no multiple inheritance.



#### Interface in Java
- Code: [Traner_notes\src\com\training\learn\interface\\*.java]
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `extends` Parent{}/public class Daughter `extends` Parent{}






- Can't instantiate(abstract class can't be instantiated directly)
- all are public abstract methods
- variables: static and final by default. final cause if you can't create constructor then how you will initialize the variable. static cause, if no static then parent1(value1) and parent2(value1) so child.value will be ambiguous don't know which one to access so all variables are static.


#### Difference between Abstract class and Interface










### Polymorphism
#### Dynamic Polymorphism(Overriding)



### Encapsulation
#### Data Hiding






### super and this keyword


### Interface
- every method in interface is public and abstract
- Interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
- can't create an object of an interface


### Abstraction:



#### Difference between Abstract class and Interface
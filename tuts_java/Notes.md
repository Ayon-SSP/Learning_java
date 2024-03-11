# ☕ Java

> Learning Source:
> 	ref:
>   	- Oracle Docs: https://docs.oracle.com/javase/tutorial
>   	- Kunal OOPs: https://youtube.com/playlist?list=PL9gnSGHSqcno1G3XjUbwzXHL8_EttOuKk&si=wdLQQfKG84VjKypD
>   	- javatpoint: https://www.javatpoint.com/java-oops-concepts

============================================================================
1. Architecture
2. Java guide:
   1. Java Package
   2. javadoc tags
   3. Java Naming Convention
3. 🐳 Baby Runn 
4. Collections in Java
5. 
6. 
7. Java Abstraction
   1. Abstract class
   3. Interface
   4. Abstract vs Interface
8. 
9.  
10. 
11. 
============================================================================
## Architecture: 
- ![JDK(JRE(JVM, setofLibaries, other files, classLoder) dev tools [javac, java])](https://static.javatpoint.com/images/jdk2.png)
  - Java: Development Environment
  As a development environment, Java technology provides you 
  with a large suite of tools:
  – A compiler (javac): takes the text file work of a developer and compiles it into a platform-independent Java file
  – An interpreter (java): used to run the compiled Java bytecode program
  – A documentation generator (javadoc)
  – A class file packaging tool and so on.
  - (JDK)(software development environment which is used to develop Java applications) -> (JRE)(provide the runtime environment) -> (JVM)(environment in which Java bytecode can be executed)
        - -> javadoc, RMI compiler, debuggers, applet viewer.
  - Java Development Kit (JDK) is the core component of the Java environment. It includes an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development.
  - Java Runtime Environment (JRE) is the runtime environment for Java applications. It is physically existent. It contains the Java Virtual Machine (JVM), the core libraries and other additional components to run applications and applets written in Java.
  - Java Virtual Machine (JVM)(OS Specific) is the `heart` of the Java environment. It is an abstract computing machine that enables a computer to run a Java program. It exists physically. It is a software process that `converts the compiled Java byte code to machine language`.
  - Garbage collection thread: JVM has a garbage collection thread that `automatically` removes the unused memory from the heap memory.
- jvm(platform dependent): .class is a compiled file and can directly run any where.
```bash
path: C:\Program Files\Java\jdk-16.0.1\bin
classpath: C:\Program Files\Java\jdk-16.0.1\lib
JAVA_HOME: C:\Program Files\Java\jdk-16.0.1
```
```css
Architecture 
	a. JDK -> Java Development Kit     ->will have files/exe which will support building of java app
	b. JRE -> Java Runtime Environment ->supports execution application build on java
	C. jvm -> java virtual machine (OS specific)
				.java ->compile->.class
				.class-> executed ->.class which is platform independant
```
############################################################################################
Why?
	*SEcure : Two way checking of the .class 
		
	1. Platform independant 
	JVM ->OS dependant 
		->.class which is platform independant 
	2. Scalable 
		OOP 
			Abstraction
			Encapsulation
			Inheritance
			Polymorphism 
	3. Threading
	4. Collection
	5. JDBC
	6. Servelt & JSP 
	7. Packaging	
	....
What?
How ?


## 🐳 Baby Runn

############################################################################################
- Run the Java program:
```bash
  javac -d . Main.java
  java com.trainer.Main
```
- More than one class in a Folder with package:
```bash
javac -d . *.java
java com.training.learn.basics.Main AYON 'SSP - software specialist programmer' 1 23 0.4
```
  Step1 -> a. Syntax -> Main.class
  Step2 -> java Main-> loading the class-> checking is it valid file-> if valid -> output
                                    else     -> error	
############################################################################################
**CODE Explanation:**
- Main Method: https://youtu.be/P-_Nzi_mCRo?si=e5UsnjQGmrB6R4Sb
- JRE calls main method
- *Code:* [src.com.training.learn.basics.\*.java]
- .java file must have one public class and it should be saved with the name of public class
- understood what is package?
- ```
  compile the code which has first line as package -> javac -d . *.java 
  execute -> java com.training.Main3 (using the classified name of the class)
  import classes from the other package? -> import -> public 
  ```


```java
// public: outside of application, so that JVM can access it. allways starts with Main class name.
// (String[] args): additional parameter are passed during execution of program. 
//                    => run time arguments are passed as string array. && it's a dinamic array.
//                    => String[] class in java which handels alphanumeric values.
// className => pascal case|| methodName && variable => camelCase
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- Java is a platform independent language. *.class can be shared and runed on any OS.
- one .java file can have `multiple classes` but only `one public class`.

Main main=new Main();

Main main => variable in your function pointing to the real object 
new Main() => actual object which has a memory
new	=> keyword used to allocate a memory to object
Main() => default constructor/non parameterised constructor 
	=> used in allocation of memory along with new keyword and always returns object
	=> Its a special method which don't have a return type


## 👷‍♂️ Java style guide
### Java Package

Project must have one public class with public void static main(String [] args){}:- Main.java/App.java
Project all classes should be kept inside relevant packages 
package for Main.java => com.training.demo.Main.java
for classes which represents data => com.training.demo.model 
for classes which represents controllers => com.training.demo.controller
for classes which represents data access logic => com.training.demo.dao
for classes which represents services => com.training.demo.services

Creating project certain -> business need
```css
package-> com.zomato
			controller
			view
			model 
```

package example:
<!-- use real world example which contains model, view, controle.. and all other utils and all types -->
```java
package com.example.model;
package com.example.view;
package com.example.controller;
package com.example.utils;
package com.example.services;
package com.example.dao;
package com.example.dto;
package com.example.exception;
package com.example.config;
package com.example.security;
package com.example.repository;
package com.example.entity;
package com.example.dto;
package com.example.beans;
package com.example.constants;
package com.example.enums;
// example -> zomato, swiggy, foodpanda, ubereats
package com.zomato.model;
package com.obms.model;
package com.obms.view;
```


### javadoc tags
Some of the commonly used tags in documentation comments:

| Tag        | Syntax                  | Description                                                                                       |
|------------|-------------------------|---------------------------------------------------------------------------------------------------|
| {@docRoot} | {@docRoot}              | To depict relative path to root directory of generated document from any page.                    |
| @author    | @author name - text     | To add the author of the class.                                                                   |
| @code      | {@code text}            | To show the text in code font without interpreting it as html markup or nested javadoc tag.       |
| @version   | @version version-text   | To specify "Version" subheading and version-text when -version option is used.                    |
| @since     | @since release          | To add "Since" heading with since text to generated documentation.                                |
| @param     | @param parameter-name description | To add a parameter with given name and description to 'Parameters' section.             |
| @return    | @return description     | Required for every method that returns something (except void)                                    |


### Java Naming Convention
 - package -> smallCase -> com.trainer.java
    - com.training.zomato
    - com.training.swiggy
 - class -> PascalCase -> Circle, Rectangle
 - interface -> PascalCase -> Shape, Drawable
 - method -> camelCase -> calculateArea(), getArea()
 - variable -> cameCase -> number1, totalAmount(alphanumeric, numbers start with 2nd charater)
 - constant -> UPPER_CASE -> PI, MAX_VALUE
 - enum -> PascalCase -> WeekDays, Months
 - annotation -> PascalCase -> Override, Deprecated
 - exception -> PascalCase -> IOException, SQLException
 - thread -> camelCase -> mainThread, childThread



### Primitive Types
Primitive Types(simple types):
  – byte, short, int, and long for integer values
  – float and double for real/fractional values
  – char for letters, digits, symbols, punctuation
  – boolean for true and false
Literals(constants values):
  - values of one of these types
  – 'A', -7, 3.5, true
  eg. int x = 10; [variable var_name = value;] where 10(value) is literal.


8 Data types
Primitive: byte,short,int,long,float,double,char,boolean
Wrapper Class:Byte,Short,Integer,Long,Float,Double,Char,Boolean

-- variable 
	1. declare
	2. initialize
	3. use
C/c++ forgot initialize add junk variable 
Java if you do not provide values/initialize in case of Field variable
byte	0
short	0
int		0
long	0L
float	0.0f
double	0.0
char	null \000  -> '' and strings are ""
boolean	false

Programming 
Networking   Source <====> Destination => Object
1. wrapping		int->Integer
2. unwrapping  Integer=>int


Java Numeric Default :  check(package com.training.demo;)
Number without decimal : int			123,12345
Number with decimal    : double 		12.12
Float : 12.12F
Long  : 123L


-  Incase of local variables we must follow 
	1. declare
	2. initialize
	3. use

1. Local variable -> function paratmeters {} variable 
2. Field/Instance -> class , private, the get initialised when constructor => multiple copies
3. statick variable-> single copy   ***

String concatenation : we used + 
System.out.println(""+greeting1.getGreetingNo());
greeting1.getGreetingNo()=> calling a method on greeting1 object

- `Premitive data` types are stored in `stack` and can't access if not initialized(a = 5) | Objects are stored in Heap if not initialized then it will be `null` (like array contains 0, string contains null object contains null...).
- `Heap memory` is not contiguous.
  - static block: loaded even before object creation.
  - object block: only if we create obj.

- in `java premitive datatypes` are not created as objects(they are stored in stack it self) but String is created as object. (objects are stored in stack memory) but 10, 2.95, 'a', 9_452_123 are `stored directly in the compiled code` cause they are objects.
  - `String str = new String("Hello");` // str is stored on the stack, but the String object "Hello" is stored on the heap
- what ever things are stored in the stack it give a unique id to it. that unique id -> contains the address of the object in the heap/stored directly in the compiled code.
- when a non-premitive is `final` we cannot reassign it.



## Strings
String(string buffer, string pul, string object)
- *Code:* [src.com.training.learn.stringObj.\*.java]
- Javatpoint: https://www.javatpoint.com/java-string & YT(https://youtu.be/Bj9Mx_Lx3q4?si=7elMjycmJjImFxu8)
- String is immutable
- toString() Method



## Collections in Java
- *Code:* [src.com.training.learn.collections.\*.java]
1. Array
2. ArrayList
3. Set
4. Map




## Object Oriented Programming in Java

#### POJO vs JavaBean
> [pojo-in-java](https://www.javatpoint.com/pojo-in-java)
POJO : Plain old Java Object 
What is POJO?
Every class in Java is POJO 
when it is not extending any classes except the serialziation package 

Properties of POJO class
Below are some properties of the POJO class:
  The POJO class must be public.
  It must have a public default constructor.
  It may have the arguments constructor.
  All objects must have some public Getters and Setters to access the object values by other Java Programs.
  The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for improved security of the project.
  A POJO class should not extend predefined classes.
  It should not implement prespecified interfaces.
  It should not have any prespecified annotation.


For example:
{ "name" : "ABC",
  "gender : "Female",
  "phone : 1234567890 }

What is JavaBean?
If any class full fils below its a Java Bean
0. Class is Pojo where it is exteding till Serializable
1. Class has default constructor
2. class has private data members 
3. class has public getter and setter for private datamembers 

Every JavaBean is a Pojo, but not every pojo is java bean


### Class && Object
ref:
	- Kunal OOPs: https://youtube.com/playlist?list=PL9gnSGHSqcno1G3XjUbwzXHL8_EttOuKk&si=wdLQQfKG84VjKypD
	- javatpoint: https://www.javatpoint.com/java-oops-concepts

```java
public class className extends ParentClass implements Interface1, Interface2{
	// Fields(class members, Instance variables) [A variable which is created inside the class but outside the method is known as an instance variable. 
    // Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.]

	// Constructors

	// Methods (class members, Instance methods, getter and setter methods)
		// local variables, parameters

	// Blocks(first static block, then instance block)
		// static block
		// instance block
		static {

		}
		{

		}

	
	// Nested class

	// Nested interface
}
```

- ClassName objectName=new ClassName(); ClassName is the reference type BUT int val = 10; val is not reference type. its premite type.
## `Student Student1 = new Student();`  (constructor is called)
- Student Student1 => reference to the object(compile time) (by default in gives a unique id)
- allocate memory `dynamically` at `run time` 
- stack => reference to the object || Student1
- heap => actual object || name, rollNo, marks
- new => keyword used to allocate memory to object
- this => keyword used to refer to the current object
- default and overloaded constructor (polymorphism)


- *Code:* [src.com.training.learn.oop.\*.java]
- all objects are stored in heap memory
- Coupling, Cohesion, Association(1-1, 1-N...), Aggregation, Composition.
- Overriding Object.toString() -> Greeting/Contact -> to provide custom string on the call of toString()


- **coupling:** refers to the degree of dependency between different classes or modules. Low coupling is desirable because it promotes better code reusability, maintainability, and flexibility.
- **Cohesion:** in software engineering refers to the degree to which the elements within a module or component belong together. It's a measure of how strongly related and focused the responsibilities of a module are. High cohesion is desirable because it leads to modules that are focused, understandable, and easier to maintain.
- **Association:** Association represents the relationship between the objects. Here, one object can be associated with one object or many objects. There can be four types of association between the objects:
	- One to One
	- One to Many
	- Many to One, and
	- Many to Many


- int arr[]; arr getting defined in the stack
- arr = new int[5]; and now the memory is allocated in the heap.
- int arr[] = new int[5]; // 5 is the size of the array

- ToWatch: 
  - Class format: Traner_notes\src\org\training\learn\model\Book.java
  - Class Object: Traner_notes\src\org\training\OuterClass.java

- instanceof: test whether the object is an instance of the specified type (class or subclass or interface). || obj instanceof className
- Obj.getClass().getName()... many just use vscode to get the methods and variables of the object.

#### How to Create Object in Java [link](https://www.javatpoint.com/how-to-create-object-in-java)
![stack and Heap](https://static.javatpoint.com/images/object-in-memory.png)
Using new Keyword: ClassName cls1 = new ClassName()  || new B1().get().message();    
Using clone() method: @Override public Object clone() throws CloneNotSupportedException {return super.clone(); } || MyClass obj2 = (MyClass) obj1.clone();
Using newInstance() method of the Class class   || MyClass instance1 = (MyClass) myClass.newInstance();
Using newInstance() method of the Constructor class
Using Deserialization
- Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects  

#### Method in Java
> [method-in-java](https://www.javatpoint.com/method-in-java)

##### Method Access Specifier
	same as 👆
1. Static Method
2. Instance Method: need to create obj to access
   1. Accessor Method getVal(): returns the value of the variable
   2. Mutator Method setVal(): sets the value of the variable
3. Abstract Method: abstract void method_name(); (abstract method is a method declared without an implementation)





#### Constructor
> [Link](https://www.javatpoint.com/java-constructor)
**Code**: [src.com.training.learn.constructor.\*.java]
new Greeting() => Constructor of the Greeting Class => Default Constructor
	
Constructor
	->Special method/function which has same name as that of the class
	->Constructor is called with new keyword to return the object of that class
	->purpose of constructor is initializing field variables with default value
	->Please note constructor do not have the return type 
	->If no constructor is provided due inheritance it calls Parent class Default construtor
		i.e. Greeting -> Object -> Object()
	->In java we can override Constructor

	- ClassName(){this(a = 1, b = 4)} => default constructor
	- ClassName(int a, int b){} => overloaded constructor




#### Java Copy Constructor
```java
ClassName(ClassName obj){
  //copy fields
}
```
#### Copying values without constructor
```java
public class Greeting {
  String greeting;
  public Greeting(Greeting obj){
    greeting = obj.greeting;
  }
  public static void main(String[] args) {
    Greeting greeting1 = new Greeting();
    greeting1.setGreeting("Hello");
    Greeting greeting2 = new Greeting(greeting1);
    System.out.println(greeting2.getGreeting());
  }
}
```
#### How to Compare Two Objects in Java [link](https://www.javatpoint.com/how-to-compare-two-objects-in-java)
- The equals() method of the Object class compare the equality of two objects. The two objects will be equal if they share the same memory address.
- - In Java, the == operator compares that two references are identical or not
```java
public class MyClass {
    private int value;

    // Constructor, getters, setters, etc.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass other = (MyClass) obj;
        return value == other.value;
    }
} // When we override the equals() method, it is necessary to override the hashCode() method
```

#### static keyword
> [static-keyword-in-java](https://www.javatpoint.com/static-keyword-in-java)

- static, final, and private methods are bound at compile-time due to their inherent characteristics.
**The static can be:**
1. Variable (also known as a class variable): only one copy | gets special memory | can be accessed by class name | can be accessed by all objects of the class. | auto increment | ![img staticvariable](https://static.javatpoint.com/images/staticvariable.JPG)
2. Method (also known as a class method) | can be accessed by class name | can access only static data members | can change the value of static variables | can be called without creating an object | can't use non-static data member or call non-static method directly. ***
3. Block (static block): used to initialize the static data members | During the time of class loading, even before the main method is loaded, the JVM executes the static block.
4. Nested class TODO: To Learn

Type of methods:
  1. static method:
     - Static Methods
       - public static void main(String[] args) {}
       - static method can call static methods only.
  2. non-static:

- outside classes cannot be static.
- static methods can only access static variables and methods.
- static class can only have static methods and variables. ***
- static class are always created inside the non-static class. ***
- static methods will never be inherited/overridden. (When you define a static method in a subclass with the same name as a static method in the parent class, it won't override the parent class's method; instead, it will simply shadow it. This means that the subclass will have its own static method with the same name, but it won't affect the parent class's method or any other subclasses that might use it.) ***
- static method in class can only access static variables and methods. to access you need to create an object.
- if a class is static 'static class ClassName{}' then automatically all the methods and variables are static.


#### this keyword
1. this can be used to refer current class instance variable. | this.variableName = x |
2. this can be used to invoke current class method (implicitly) | this.methodName(args); |
3. this() can be used to invoke current class constructor. | ClassName(){ this(args); }  | ClassName(arg1, arg2, arg3){} ClassName(arg1, arg2, arg3, arg4){ this(arg1, arg2, arg3); this.arg4 = arg4 } *** |
4. this can be passed as an argument in the method call.  | this.methodName(this); |
5. this can be passed as argument in the constructor call. | A(){ B b=new B(this);  //lines -> B(A obj){} } |
6. this can be used to return the current class instance from the method. | return this; |

#### Local variable
- Local variable: declared withing the functions exist within that function
    1. local variable has block scope. {}
    2. must have data type metioned and initialized before use
    3. depending on it type




### Inheritance
**Code**: [src.com.training.learn.inheritance.\*.java]
#### Inheritance(IS-A)
```java
class Subclass-name extends Superclass-name  
```
- using `extends` keyword
- super(arg for parent constructor) -> for multiple inheritance
- Box(x,y,z) & BoxWeight extends Box: BoxWeight(x,y,z,weight)
  - Box boxweight1 = new BoxWeight(1,2,3,4); // valid all the Box methods and variables are initialized.
  - BoxWeight boxweight1 = new Box(1,2,3); // error BoxWeight.weight is not initialized 
  - you are in boxweight class and you want to set the x, y or z values use super.x = x; super.y = y; super.z = z;.
  - type objName = new className(); => type: access depends on LHS(compile time), object: methods depends on RHS(runtime) eg. parent obj = new chile(); Funk are called from child() and access/definication and declaration are from parent(). code: Traner_notes\src\Splendor.java
Types of Inheritance:
	1. Single Inheritance: A -> B
	2. Multilevel Inheritance: A -> B -> C
	3. Hierarchical Inheritance: A -> B, A -> C, A -> D
	4. Multiple Inheritance: A-> Child, B-> Child, C-> Child
      	- Java does not support multiple inheritance
        	- A.num | B.num | C.num || now Child.num will be ambiguous, so we use interface
	5. Hybrid Inheritance: A -> B, A -> C, B -> D, C -> D
		- does not support Hybrid Inheritance
  1. extendable 
	extends	 		class extends class, interface extends interface
	implements 		class implements interface 

#### Aggregation(HAS-A) open link [aggregation-in-java](https://www.javatpoint.com/aggregation-in-java)



### Polymorphism

#### Method Overloading in Java
#### Method Overriding in Java
> runtime polymorphism or Dynamic Polymorphism

**problem without method overriding:** Eg1:
```java
class Vehicle{  
  void run(){System.out.println("Vehicle is running");}  
}  
class Bike extends Vehicle{  
  public static void main(String args[]){  
  Bike obj = new Bike();  
  obj.run();  
  }  
}  

```
**Example of method overriding** Eg2:
```java
class Vehicle{  
  void run(){System.out.println("Vehicle is running");}  
}
class Bike extends Vehicle{  
  void run(){System.out.println("Bike is running safely");}  
  public static void main(String args[]){  
  Bike obj = new Bike();  
  obj.run();  
  }  
}  
```
**A real example of Java Method Overriding**



#### Covariant Return Type
```java
foo(){return new A();}
obj.foo().print();  
 
```

#### Super Keyword in Java

#### Instance initializer block
```java
class A{  
  {
    System.out.println("instance initializer block is invoked");
  }
}
```
- first static block, then instance block, then constructor, then main method.



### Polymorphism

#### Runtime Polymorphism(Dynamic Method Dispatch, Overriding)
- *Code:* [src.com.training.learn.polymorphism.\*.java]
- ploy = many, morph = forms
1. `compile time(static polymorphism)`: 💀 No such thing in java
   1. `Method Overloading`: same method name with different parameters
   2. No `operator Overloading` in java
   3. Constructor Overloading: same constructor name with different parameters
   4. Method Overloading and Type Promotion:  https://static.javatpoint.com/images/java-type-promotion.png
2. `Run time(dynamic polymorphism)`:
   1. `Method Overriding`: same method name with same parameters in parent and child class
      - @override: to check if the method is overridden or not
      - can't override static, final, private methods
      - earling binding: method call is resolved at compile time [vdo](https://youtu.be/W6s7RZo06nA?si=MC8YR8DY3cmsJG4h)
      - late binding: method call is resolved at runtime
   2. Below is an example of Dynamic Polymorphism	
		Parent obj2 = new Child(); | at compile time Parent obj2 will consider it's own methods but while running it will consider the child methods.
		The obj2 a refrence variable of type Parent
		Who is point to objectof child new Child();
		At runtime JVM will understand obj2 will behave like Child 




- **Java Runtime Polymorphism with Data Member:** A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
```java

class Bike {
    int speedlimit = 90;
}

class Honda3 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]){  
     Bike obj=new Honda3();  
     System.out.println(obj.speedlimit); // 90  
   }
}
```
- **Java Runtime Polymorphism with Multilevel Inheritance**
```java
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog {
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();
    }
} // dog is eating...
```

**Objects have a type:**
- An object is an instance of particular java class,but it is also an instance of its superclass.
```java
class Animal{}  
  
class Dog extends Animal{  
 public static void main(String args[]){  
  Dog d1=new Dog();  
 }  
}  
```


- **Static Binding and Dynamic Binding:** Connecting a method call to the method body is known as binding.
1. Static Binding (also known as Early Binding). 
2. Dynamic Binding (also known as Late Binding).


- **Java instanceof:** sout(obj instanceof ClassName);

- Downcasting with java instanceof operator
```java
- Dog d=new Animal(); // Compile Time Error
- Dog d=(Dog)new Animal(); // compiles successfully but ClassCastException is thrown at runtime
```


#### Final Keyword
**Final can be:** variable, method, class
- can be static
```java
class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}   //Error Compile Time Error
```
- final class can't be extended.
- final method can be inherited but can't be overridden.
```java
class Bike{  
  final void run(){System.out.println("running...");}  
}  
class Honda2 extends Bike{  
   public static void main(String args[]){  
    new Honda2().run();  
   }  
}  
```

- final parameter?
```java
  int cube(final int n){  
   n=n+2;//can't be changed as n is final  
   n*n*n;  
  }  
```





### Java Abstraction: 
> javaTpoing/[John](https://youtu.be/HvPlEJ3LHgE?si=CdM3J1G-NAY9x29W) [Must](https://www.javatpoint.com/difference-between-abstract-class-and-interface)
There are two ways to achieve abstraction in java
    1. Abstract class (0 to 100%)
    1. Interface (100%)
#### Abstract class
- *Code:* [src.com.training.learn.abstractclass.\*.java]
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `extends` Parent{}/public class Daughter `extends` Parent{}
  ```java
  Abstract class:
    1. Constructor / abstract constructor not allowed(abstract classes cannot be instantiated directly)
    2. abstract and non-abstract methods
    3. static/final variables/methods
    4. Not instantiated: can\'t create an object of an abstract class.
    5. Class can't be private or final
    6. abstract static/final methods not allowed(Final/static methods can't override them. so, can't use in child class)(static methods are not override(static methods are belongs to class not object))
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
- *Code:* [src.com.training.learn.interfaceclass.\*.java]
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `implements` Parent{}/public class Daughter `implements` Parent{} | ![ALL](https://static.javatpoint.com/images/core/interfacerelation.jpg) | ![](https://static.javatpoint.com/images/core/multipleinheritance.jpg)
- default methods ***
```java
  class Car extends Vehicle implements Engine, Media, Break
  interface A {foo() bar()}
  interface B extends A {foo()}
  Main implements B
Interface:
    1. variables: final & static only (cant initialize cause no object no constructor)(use: all child class will have same value).
    2. methods: public & abstract by default | !final (final must contain body) | can create private but no use | can have (default/static) or both methods (need to have body)
    3. 
    4. may contains default methods
    5. can't have constructor
    6. can't have instance variables

```
- every method in interface is public and abstract
- Interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
- can't create an object of an interface
- an interface can extend multiple interfaces
- [src\com\training\learn\interfaces\NestedInterface\B.java]

- abstract class can  

- Can't instantiate(abstract class can't be instantiated directly)
- all are public abstract methods
- variables: static and final by default. final cause if you can't create constructor then how you will initialize the variable. static cause, if no static then parent1(value1) and parent2(value1) so child.value will be ambiguous don't know which one to access so all variables are static.
- An interface which has no member is known as a marker or tagged interface

```java
// Defining the interface One
interface One {
    void methodOne();
}
  
// Defining the interface Two
interface Two {
    void methodTwo();
}
  
// Interface extending both the
// defined interfaces
interface Three extends One, Two {
}
```


#### Difference between Abstract class and Interface
1. extends abstractClass, implements interface1, interface2(extends only one abstract class, implements)
2. If adding features `extends`, if just want to implement then `implements`
3. An abstract class can extend another Java class and implement multiple Java interfaces. *** An interface can extend another Java interface only.x    

- Abstract class can have abstract and non-abstract methods. Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
- Abstract class can have final, non-final, static and non-static variables abstract or non-abstract methods. Interface has only static and final variables and public, abstract methods.
- Abstract class can provide the implementation of interface. Interface can't provide the implementation of abstract class.
- The abstract keyword is used to declare abstract class. The interface keyword is used to declare interface.
- can only extend one class but can implements multiple interfaces
  in interface: if we declare fealds is alwasys public static final but in abstract class we can have non-static and non-final fields which is access to every class so abstract is introduced to restrict the access of the fields.
















### Encapsulation
- Encapsulation is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

#### Access Modifiers in Java
- `public`: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
- `Protected`: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
- `default`: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- `private`: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.


#### Data Hiding







### Java Nested & Inner Classes
- *Code:* [src.com.training.learn.nestedclass.\*.java]
#### Java Inner Classes
- can access all the members (data members and methods) of the outer class
#### Nested Class
- A nested class is a member of its enclosing class. 
- Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private. 
- Static nested classes do not have access to other members of the enclosing class. As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. (Recall that outer classes can only be declared public or package private.)


#### Inner Anonymous Classes
1. Class (may be abstract or concrete).
2. Interface

- [Generics in java](https://www.javatpoint.com/generics-in-java)
```java
class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}  
MyGen<Integer> m=new MyGen<Integer>();
```




#### Internal class generated by the compiler:
```java
class or interface interface_name {
    ...
    interface nested_interface_name{   // nested interface must be public but it can have any access modifier // declared static
     ...  
    }
}
```
```java
interface Showable {
    void show();

    interface Message {
        void msg();
    }
} // same as class Showable

class TestNestedInterface1 implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new TestNestedInterface1();// upcasting here
        message.msg();
    }
}
```



































### More
#### Java Lambda Expressions

```java
(argument-list) -> {body}  

```
#### Enum in Java
- predefined set of values that don't change. eg. days of the week.
```java
public enum Booleans{  
  TRUE, FALSE  
}
Booleans b=Booleans.TRUE;  
if (b==Booleans.TRUE){
  //perform action
}

public enum Day{  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
  Day.valueOf("MONDAY"); // MONDAY

```
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
  – A class file packaging tool and so on.
  - (JDK)(software development environment which is used to develop Java applications) -> (JRE)(provide the runtime environment) -> (JVM)(environment in which Java bytecode can be executed)
        - -> javadoc, RMI compiler, debuggers, applet viewer.
  - Java Development Kit (JDK) is the core component of the Java environment. It includes an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development.
  - Java Runtime Environment (JRE) is the runtime environment for Java applications. It is physically existent. It contains the Java Virtual Machine (JVM), the core libraries and other additional components to run applications and applets written in Java.
  - Java Virtual Machine (JVM)(OS Specific) is the `heart` of the Java environment. It is an abstract computing machine that enables a computer to run a Java program. It exists physically. It is a software process that `converts the compiled Java byte code to machine language`.
  - Garbage collection thread: JVM has a garbage collection thread that `automatically` removes the unused memory from the heap memory.
- jvm(platform dependent): .class is a compiled file and can directly run any where. but to generate the .class file we need the jdk which is platform dependent.
  – A documentation generator (javadoc)
```bash
path:      C:\Program Files\Java\jdk-16.0.1\bin
classpath: C:\Program Files\Java\jdk-16.0.1\lib
JAVA_HOME: C:\Program Files\Java\jdk-16.0.1
```
```css
Architecture 
	a. JDK -> Java Development Kit     ->will have files/exe which will support building of java app
	b. JRE -> Java Runtime Environment ->supports execution application build on java (platform independant)
	C. jvm -> java virtual machine (OS specific)
				.java ->compile->.class
				.class-> executed ->.class which is platform independant
```
############################################################################################
Why?
	*Secure : Two way checking of the .class 
		
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
- More than one class in a Folder with package:2
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

- If you import a package, subpackages will not be imported.
- 

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



## Primitive Types
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
Java if you do not provide values/initialize in case of class Field variable
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

## Control Statements
> Javatpoint


## Object Oriented Programming in Java
OOPs (Object-Oriented Programming System)
Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:
  1. Object
  2. Class
  3. Inheritance
  4. Polymorphism
  5. Abstraction
  6. Encapsulation

### Object-Oriented design PRINCIPLEs:

Apart from these concepts, there are some other terms which are used in Object-Oriented design:
  1. **Coupling:** refers to the degree of dependency between different classes or modules. Low coupling is desirable because it promotes better code reusability, maintainability, and flexibility.
  2. **Cohesion:** in software engineering refers to the degree to which the elements within a module or component belong together. It's a measure of how strongly related and focused the responsibilities of a module are. High cohesion is desirable because it leads to modules that are focused, understandable, and easier to maintain.
  3. **Association:** Association represents the relationship between the objects. Here, one object can be associated with one object or many objects. There can be four types of association between the objects:
  	- One to One
  	- One to Many
  	- Many to One, and
  	- Many to Many
  4. **Aggregation:** HAS-A relationship. 
  5. **Composition:** HAS-A relationship with a strong ownership.

OOP SOLID PRINCIPLE :
  1. S SRP :Single Responsibility Principle
  2. O OCP Open/Closed Principle : Open for extenstion Close for modification
  3. L LSP Liskov Substitution Principle: 
  4. I ISP Interface Segregation Principle:
  5. D DSP Dependency Inversion Principle:


### POJO vs JavaBean
> [pojo-in-java](https://www.javatpoint.com/pojo-in-java)
> Every JavaBean is a Pojo, but not every pojo is java bean

#### POJO:
POJO : Plain old Java Object 
**Rules**
1. Every class in Java is POJO 
2. No Extend, No Implement, No outside Annotations(@Entity): when it is not extending any classes except the serialziation package 
4. No extra stuffs or libaries.

```java
publicclass Student{  
  private int id;  
  private String name;  
  // ..
}  
```
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


#### JavaBean:
If any class full fils below its a Java Bean
1. Class has default constructor
2. class has private data members 
3. class has public getter and setter for private datamembers 
4. No public arg-constructor



### Types of classes:
1. Concreate class: class with implementation(POJO, JavaBean) | public class ClassName{}  | Instantiable | Cannot be Abstract
2. Abstract class: class without implementation | public abstract class ClassName{} | can't be instantiated | Interface(100%) |
3. Nested/inner class: class inside a class | public class ClassName{ public [static] class InnerClass{} } | can be instantiated [must do concepts]
   1. Static Classes
   2. Non-static Classes
4. Anonymous class: class without a name | Encapsulation topic | inner class without a name | new InterfaceName(){ //code } | can't be instantiated
5. Singleton class: class with only one object | public class ClassName{ private static ClassName obj = new ClassName();}
6. 'private ClassName(){} public static ClassName getInstance(){ return obj; }



### Singleton class in Java 
**Code:** [src.com.training.learn.singleton.\*.java] and multithreading
> [singleton-class-in-java](https://www.javatpoint.com/singleton-class-in-java)
- Lazy Initialization
- can be instantiated(exactly one object).
- Thread Safety
- Serialization
```java
public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Static method to get the single instance of the class
    public static synchronized Singleton getInstance() {
        // Lazy initialization: create the instance only if it hasn't been created yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singletonInstance1 = Singleton.getInstance();
        // Call a method on the instance
        singletonInstance1.showMessage();

        // Trying to create another instance
        Singleton singletonInstance2 = Singleton.getInstance();

        // Both instances point to the same object
        if (singletonInstance1 == singletonInstance2) {
            System.out.println("Both instances are the same object.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
```

### Class && Object
ref:
	- Kunal OOPs: https://youtube.com/playlist?list=PL9gnSGHSqcno1G3XjUbwzXHL8_EttOuKk&si=wdLQQfKG84VjKypD
	- javatpoint: https://www.javatpoint.com/java-oops-concepts

```java
public class className extends ParentClass implements Interface1, Interface2 {
	// Fields(class members, Instance variables) [A variable which is created inside the class but outside the method is known as an instance variable. 
    // Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.]

	// Constructors

	// Methods (class members, Instance methods, getter and setter methods)
		// local variables, parameters

	// Blocks(first static block, then instance block)
		// static block
		static {
			
		}
    	// instance block
		{

		}

	
	// Nested class

	// Nested interface
}
```

- ClassName objectName=new ClassName(); ClassName is the reference type BUT int val = 10; val is not reference type. its premite type.
- `Student Student1 = new Student();`  (constructor is called)
- Student Student1 => reference to the object(compile time) (by default in gives a unique id)
- allocate memory `dynamically` at `run time` 
- stack => reference to the object || Student1
- heap => actual object || name, rollNo, marks
- new => keyword used to allocate memory to object
- this => keyword used to refer to the current object
- default and overloaded constructor (polymorphism)

- all objects are stored in heap memory
- Coupling, Cohesion, Association(1-1, 1-N...), Aggregation, Composition.
- Overriding Object.toString() -> Greeting/Contact -> to provide custom string on the call of toString()

- int arr[]; arr getting defined in the stack
- arr = new int[5]; and now the memory is allocated in the heap.
- int arr[] = new int[5]; // 5 is the size of the array

- ToWatch: 
  - Class Object: **Code:** [src\com\training\learn\basics\OuterClass.java]
  - Book.class *** HAS-A relationship

- instanceof: test whether the object is an instance of the specified type (class or subclass or interface). || obj instanceof className
- Obj.getClass().getName()... many just use vscode to get the methods and variables of the object.

#### How to Create Object in Java [link](https://www.javatpoint.com/how-to-create-object-in-java)
![stack and Heap](https://static.javatpoint.com/images/object-in-memory.png)
Using new Keyword: ClassName cls1 = new ClassName()  || new B1().get().message();    
Using clone() method: @Override public Object clone() throws CloneNotSupportedException {return super.clone(); } || MyClass obj2 = (MyClass) obj1.clone();
Using newInstance() method of the Class class   || MyClass instance1 = (MyClass) myClass.newInstance();
Using newInstance() method of the Constructor class
Using Deserialization
- Rectangle r1=new Rectangle(), r2=new Rectangle(); //creating two objects  

#### Method in Java
> [method-in-java](https://www.javatpoint.com/method-in-java)

##### Method Access Specifier
	same as 👆
1. Static Method
2. Instance Method: need to create obj to access
   1. Accessor Method getVal(): returns the value of the variable
   2. Mutator Method setVal(): sets the value of the variable
3. Abstract Method: abstract void method_name(); (abstract method is a method declared without an implementation)

##### Local variable
- Local variable: declared withing the functions exist within that function
    1. local variable has block scope. {}
    2. must have data type metioned and initialized before use
    3. depending on it type
    4. local class can't be static

#### Constructor
> [Link](https://www.javatpoint.com/java-constructor)
**Code:** [src.com.training.learn.constructor.\*.java]
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

1. Java Copy Constructor
	```java
	ClassName(ClassName obj){
	//copy fields
	}
	```
2.  Copying values without constructor
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
3. How to Compare Two Objects in Java [link](https://www.javatpoint.com/how-to-compare-two-objects-in-java)
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
- static methods can only access static variables and methods. to access you need to create an object.
- static class can only have static methods and variables. ***
- static class are always created inside the non-static class. ***
- static methods will never be inherited/overridden. (When you define a static method in a subclass with the same name as a static method in the parent class, it won't override the parent class's method; instead, it will simply shadow it. This means that the subclass will have its own static method with the same name, but it won't affect the parent class's method or any other subclasses that might use it.) ***
- if a class is static 'static class ClassName{}' then automatically all the methods and variables are static.


#### this keyword
1. this can be used to refer current class instance variable. | this.variableName = x |
2. this can be used to invoke current class method (implicitly) | this.methodName(args); |
3. this() can be used to invoke current class constructor. | ClassName(){ this(args); }  | ClassName(arg1, arg2, arg3){} ClassName(arg1, arg2, arg3, arg4){ this(arg1, arg2, arg3); this.arg4 = arg4 } *** |
4. this can be passed as an argument in the method call.  | this.methodName(this); |
5. this can be passed as argument in the constructor call. | A(){ B b=new B(this);  //lines -> B(A obj){} } |
6. this can be used to return the current class instance from the method. | return this; |



### Inheritance
**Code:** [src.com.training.learn.inheritance.\*.java]
> Must: Mastek trainee 
>   -> Day5 bankapp06 && bankapp07(***) bankacc -> (saving, sails acc). inheriting.
>   -> Day6 Demo24 Has-a relationship.
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
```java
interface IDeposit{String deposit(double amount);}
interface IWithdraw{String withdraw(double amount) throws InsufficientBalanceException;}
interface IBankService extends IDeposit, IWithdraw{}
abstract class BankAccount implements IBankService {getter/setter hashcode and equals...}
class SavingAccount extends BankAccount{SavingAccount(){} public String withdraw(double amount) throws InsufficientBalanceException {}}
// for this code  got to - *Code:* [src.com.training.learn.exception.\*.java]
```
diagram
```
		IDeposit    IWithdraw
		    |		   |
			IBankService
				|
			BankAccount
				|	
	SavingAccount + CurrentAccount + SalaryAccount
```

#### Aggregation(HAS-A) open link [aggregation-in-java](https://www.javatpoint.com/aggregation-in-java)
> Tree has a Node, Car has a wheel, Department has a teacher




### Polymorphism

#### Runtime Polymorphism(Dynamic Method Dispatch, Overriding)
- *Code:* [src.com.training.learn.polymorphism.\*.java]
- ploy = many, morph = forms
1. `compile time(static polymorphism)`: 💀 No such thing in java
   1. `Method Overloading`: same method name with different paraeemeters
   2. No `operator Overloading` in java
   3. Constructor Overloading: same constructor name with different parameters
   4. Method Overloading and Type Promotion:  https://static.javatpoint.com/images/java-type-promotion.png
2. `Run time(dynamic polymorphism)`:
   1. `Method Overriding`: same method name with same parameters in parent and child class
      - @override: to check if the method is overridden or not
      - can't override static, final, private methods
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
} // as it is premitive it is directly store in stack, in case of methods/object it stores the pointer/reference in stack and the actual object in heap.
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
      method call is resolved at `compile time` same method name but different prameters [vdo](https://youtu.be/W6s7RZo06nA?si=MC8YR8DY3cmsJG4h)
2. Dynamic Binding (also known as Late Binding).
      method call is resolved at runtime.

 
- **Covariant Return Type:** return type of the overriding method can be subclass of the return type of the overridden method.


- **Java instanceof:** sout(obj instanceof ClassName);

- Downcasting with java instanceof operator
```java
- Dog d=new Animal(); // Compile Time Error
- Dog d=(Dog)new Animal(); // compiles successfully but ClassCastException is thrown at runtime
```


#### Super Keyword
> javatpoint



#### Final Keyword
**Final can be:** variablea(stop value change), method(stop method overriding), class(stop inheritance)
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
- final class can't be extended(If you make any class as final, you cannot extend it).
- final method can be inherited but can't be overridden.
```java
class Bike{  
  final void run(){System.out.println("running...");}  
}  
class Honda2 extends Bike{  
   public static void main(String args[]){  
    new Honda2().run();  
   }  
}  // error
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
There are two ways to achieve abstraction in java: showing only essential things to the user and hiding the internal details
    1. Abstract class (0 to 100%)
    2. Interface (100%)
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
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `implements` Parent{}/public class Daughter `implements` Parent{} | ![ALL](https://static.javatpoint.com/images/core/interfacerelation.jpg) | ![All](https://static.javatpoint.com/images/core/multipleinheritance.jpg)
- default methods ***
```java
  class Car extends Vehicle implements Engine, Media, Break
  interface A {foo() bar()}
  interface B extends A {foo()}
  Main implements B
Interface:
    1. variables: final & static only (should initialize cause no object no constructor)(use: all child class will have same value).
    2. methods: public & abstract by default | !final (final must contain body) | can create private but no use | can have (default/static) or both methods (need to have body)
    3. 
    4. may contains default methods
    5. can't have constructor
    6. can't have instance variables

```
- every method in interface is public and abstract
- Interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
- Can't instantiate(abstract class can't be instantiated directly)
- an interface can extend multiple interfaces
- [src\com\training\learn\interfaces\NestedInterface\B.java]
- all are public abstract methods
- variables: static and final by default. final cause if you can't create constructor then how you will initialize the variable. static cause, if no static then parent1(value1) and parent2(value1) so child.value will be ambiguous don't know which one to access so all variables are static.
- An interface which has no member is known as a marker or tagged interface
- **Java Functional Interfaces:** An interface with only one abstract method is called a functional interface. || @FunctionalInterface annotation is used to ensure an interface is a functional interface. || Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
	- can have any number of default, static methods but can contain only one abstract method.
- **marker or tagged interface:** interface which has no member
- **Nested Interface**

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
##### Functional Interface
```java
public interface Runnable {
  run();
};
public interface Comparator<T> {
  int compareTo(T t1, T t2);
};
public interface FileFilter {
  boolean accept(File pathname);
};

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


### Java Encapsulation
- Encapsulation is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
- `Java bean` is the fully encapsulated class because all the data members are private here.
- **Java style guide.Java Package**
#### Access Modifiers in Java
- `public`: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
- `Protected`: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
- `default`: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- `private`: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
#### Encapsulation in Java




### ⚓ Java Nested & Inner Classes
- *Code:* [src.com.training.learn.nestedclass.\*.java]
#### Java Inner Classes
- can access all the members (data members and methods) of the outer class
#### Nested Class
- A nested class is a member of its enclosing class. 
- Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private. 
- Static nested classes do not have access to other members of the enclosing class. As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. (Recall that outer classes can only be declared public or package private.)
- An inner class is a part of a nested class. Non-static nested classes are known as **inner classes**.
nested[inner, static]

##### Types of Nested classes
  > There are two types of nested classes non-static and static nested classes. The non-static nested classes are also known as inner classes.
  1. Non-static nested class (inner class)
  	- Member inner class
  	- Anonymous inner class
  	- Local inner class
  2. Static nested class

#### Inner Anonymous Classes
1. Class (may be abstract or concrete).
2. Interface
```java
Employee specialCase =new PartTimeEmployee(3, "Dominic", "Assistant", 5000, 0, LocalDate.of(1999, 5, 4), 10,4,10) {
	@Override
	public double calculateSalary() {				
		
		return 40000+(baseSalary*this.getHoursPerDay()*this.getWorkingDays());
	}
};
```
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

## Strings
String(string buffer, string pul, string object)
- *Code:* [src.com.training.learn.stringObj.\*.java]
- Javatpoint: https://www.javatpoint.com/java-string & YT(https://youtu.be/Bj9Mx_Lx3q4?si=7elMjycmJjImFxu8)
- String is immutable
- toString() Method


## Collections API in Java [img](https://media.geeksforgeeks.org/wp-content/uploads/20230406131807/Collections-in-Java.webp)
- *Code:* [src.com.training.learn.collections.\*.java]
- [gfg-collections-class-in-java](https://www.geeksforgeeks.org/collections-class-in-java/)
- IS-A
1. List -> ArrayList, LinkedList, Vector, Stack
2. Set -> HashSet, LinkedHashSet, TreeSet
3. Queue -> PriorityQueue, Deque
- HAS-A
4. Map -> Map & SortedMap

- Comparable<T> compareTo(Object o)
- Compartor<T>	 compare(Object o1, Object O2)



```java
Collection<String> c = new ArrayList<String>();
c.add("A");
c.remove("A");
c.contains("A");
c.size();
c.isEmpty(); ... go to the file and check the methods

List<User> users = new ArrayList<>();
Iterator<User> iterator = users.iterator();
while(iterator.hasNext()){
  User user = iterator.next();
  System.out.println(user);
}

Set<User> set = new HashSet<User>(); // no duplicate, unordered -hashcode and equals
SortedSet<User> set = new TreeSet<User>(); // no duplicate, ordered -comparable and comparator

Set<User> set = new LinkedHashSet<User>(); // no duplicate, ordered -insertion order
Set<User> set = new TreeSet<User>(); // no duplicate, ordered -comparable and comparator
Queue<User> queue = new PriorityQueue<User>(); // no duplicate, ordered -natural order
Deque<User> deque = new ArrayDeque<User>(); // no duplicate, ordered -natural order
Map<Integer, User> map = new HashMap<Integer, User>(); // no duplicate, unordered -hashcode and equals
Map<Integer, User> map = new TreeMap<Integer, User>(); // no duplicate, ordered -comparable and comparator
Map<Integer, User> map = new LinkedHashMap<Integer, User>(); // no duplicate, ordered -insertion order
Collection<User> c = new ArrayList<User>();
Comparator<User> comparator = new Comparator<User>(){
  public int compare(User u1, User u2){
	return u1.getName().compareTo(u2.getName());
  }
};

for (Map.Entry<Integer, User> entry : map.entrySet()) {
  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
```
```java
class Registration{
	private static Map<Student, List<Course>> studentCourseMap = new HashMap<Student, List<Course>>(); // where registration is a view which allws to use both objects.
	to itrate
	for (Map.Entry<Student, List<Course>> entry : studentCourseMap.entrySet()) {
		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		for(Course course: entry.getValue()){
			System.out.println(course);
		}
		
	}
}
```


### Java Lambda Expressions & Functional Interfaces & Stream
> *Code:* [src.com.training.learn.lambda.\*.java]
```java
(argument-list) -> {body}  

```
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.forEach(number -> System.out.println(number));
		numbers.forEach((number) -> System.out.println(number));
		numbers.forEach(System.out::println);
		

        // Using lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(number -> number % 2 == 0)
                                          .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Even numbers: " + evenNumbers);

        // Using lambda expression to filter numbers greater than 5
        List<Integer> greaterThanFive = numbers.stream()
                                               .filter(number -> number > 5)
                                               .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Numbers greater than 5: " + greaterThanFive);


        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Sorted numbers in ascending order: " + sortedNumbers);

        // Sorting the list in descending order using lambda expression
        List<Integer> sortedDescNumbers = numbers.stream()
                                                 .sorted((num1, num2) -> num2.compareTo(num1))
                                                 .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        // calculate the average which is greater than 6
        
        OptionalDouble average = numbers.stream()
                                        .filter(number -> number > 6)
                                        .mapToDouble(number -> number)
                                        .average();



        // OptionalDouble averageEven = numbers.stream()
        //                                     .filter(age -> age > 18 == 0)
        //                                     .mapToDouble(age -> age)
        //                                     .average();

    }
}

```
```java
FileFilter filter = (File file) -> file.getName().endsWith(".java");
Runnable r = () -> {
	for (int i = 0; i < 5; i++) {
		System.out.println("Hello world!");
	}
};

Comparator<String> c = (String s1, String s2) -> Integer.compare(s1.length(), s2.length()); -<or>-
Comparator<String> c = (s1, s2)               -> Integer.compare(s1.length(), s2.length()); -<or>-
Comparator<String> c = new Comparator<String>(String s1, String s2) {

    public boolean compareTo(String s1, String s2) {
		Integer.compare(s1.length(), s2.length());
    }
}; 

Function<String, String> f = s -> s.toLowerCase(); -<or>-
Function<String , String> f = String::toLowerCase;

Comparator<Integer> c = (i1, i2) -> Integer.compare(i1, i2);
Comparator<Integer> c = Integer::compare;

List<Customer> list = ...;
list.forEach(customer -> System.out.println(customer));
list.forEach(System.out::println);

Consumer<T> c = p ‐> System.out.println(p);
Consumer<T> c = System.out::println; // Method reference

List<String> list = new ArrayList<>();
Consumer<String> c1 = list::add; // same as c1 = s ‐> list.add(s);
Consumer<String> c2 = System.out::println;
```

3 Categories of operations. 
1. forEach(Consumer) and peek()
2. filter(Predicate) (lazy)
3. map() and flatMap()

```java
List<Integer> ages = ... ;
Stream<Integer> stream = ages.stream();
Integer sum =
stream.reduce(0, (age1, age2) ‐> age1 + age2);

BinaryOperation<Integer> max = (i1, i2) ‐> i1 > i2 ? i1 : i2;
```


```java
comparation for equlality -> equals() and hashCode() method
java.lang.Comparable => obj1.compareTo(obj2) => 1, 0, -1
java.util.Comparator => (obj1, obj2) -> obj1.compareTo(obj2)
```

##### Stream
- are not objects, they are interfaces - can perform operations on a sequence of objects.
- if gives ways to process data efficiently
- it does not holdes any data
- process from right to left
- it's lazy, it does not start processing until it's required
```java
List<Contact> contacts = contactList.findAll();
Consumer<Contact> consumer = (contact) -> System.out.println(contact);
contacts.forEach(consumer); // constacts.forEach((contact) -> System.out.println(contact));


List<Person> persons = ... ;
Map<Integer, Long> result =
persons.stream()
.filter(person ‐> person.getAge() > 20)
.collect(
Collectors.groupingBy(Person::getAge),
Collectors.counting() // the downstream collector
);

List<Person> persons = ... ;
if (persons.isParallel()):
persons.map(person ‐> person.getLastName())
.allMatch(length < 20); 



ages.stream().max()
ages.stream().max().ifPresent(max -> System.out.println(max));
```
Booliean reduction:
1. allMatch()
2. anyMatch()
3. noneMatch()

```java
List<String> list = Arrays.asList("abc1", "abc2", "abc3");
list.stream().map(s -> s.substring(0, 3)).forEach(System.out::println);
```
```java
List<String> list = Arrays.asList("abc1", "abc2", "abc3");
list.stream().map(s -> {
	System.out.println("map: " + s);
	return s.toUpperCase();
}).anyMatch(s -> {
	System.out.println("anyMatch: " + s);
	return s.startsWith("A");
});
```
```java
List<String> list = Arrays.asList("abc1", "abc2", "abc3");
list.stream().map(s -> {
	System.out.println("map: " + s);
	return s.toUpperCase();
}).filter(s -> {
	System.out.println("filter: " + s);
	return s.startsWith("A");
}).forEach(s -> System.out.println("forEach: " + s));
```

```java
		Optional<Integer> minAge=peopleSet.stream()
										  .map(person->person.getAge())
										  .filter(age->age>20)
										  .min(Comparator.naturalOrder());
		if(minAge.isPresent()) {
			System.out.println("Min Age"+minAge.get());
		}
		
		BinaryOperator<Integer> sumOperator=(n1,n2)->n1+n2;
		int result=Stream.of(1,2,3,4,5).reduce(0,sumOperator);
		System.out.println("Number sum: "+result);
		Integer sumAge=peopleSet.stream()
							  .map(person->person.getAge()) // `person.getAge()` will sent to next and stored in `age`
							  .filter(age->age>20)
							  .reduce(0,sumOperator);
```



```java
package com.training.demo.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.training.demo.util.People;

public class Main {

	public static void main(String[] args) {
		People people=new People();
		Set<Person> peopleSet=people.findAll();
		peopleSet.add(new Person(1, "Amit", 17));
		peopleSet.add(new Person(2, "Ajit", 17));
		peopleSet.add(new Person(3, "Ajit", 17));
		peopleSet.add(new Person(4, "Ajit", 17));
		peopleSet.add(new Person(5, "Ajit", 17));
		peopleSet.add(new Person(6, "Ajit", 17));
		peopleSet.add(new Person(7, "Ajit", 17));
		peopleSet.add(new Person(8, "Ajit", 17));
		peopleSet.add(new Person(9, "Ajit", 17));
		peopleSet.add(new Person(10, "Ajit", 17));
		peopleSet.add(new Person(11, "Ajit", 18));
		peopleSet.add(new Person(12, "Ajit", 18));
		peopleSet.add(new Person(11, "Ajit", 19));
		peopleSet.add(new Person(12, "Ajit", 19));
		peopleSet.add(new Person(13, "Ajit", 20));
		peopleSet.add(new Person(14, "Ajit", 20));
		peopleSet.add(new Person(15, "Ajit", 20));
		peopleSet.add(new Person(16, "Ajit", 20));
		peopleSet.add(new Person(17, "Ajit", 20));
		peopleSet.add(new Person(18, "Ajit", 20));
		peopleSet.add(new Person(19, "Ajit", 20));
		peopleSet.add(new Person(20, "Ajit", 20));
		peopleSet.add(new Person(21, "Ajit", 22));
		peopleSet.add(new Person(22, "Ajit", 22));
		peopleSet.add(new Person(23, "Ajit", 25));
		peopleSet.add(new Person(24, "Ajit", 25));
		peopleSet.add(new Person(25, "Ajit", 25));
		peopleSet.add(new Person(26, "Ajit", 25));
		peopleSet.add(new Person(27, "Ajit", 25));
		peopleSet.add(new Person(28, "Ajit", 30));
		peopleSet.add(new Person(29, "Ajit", 30));
		peopleSet.add(new Person(30, "Ajit", 30));

//		oldway(peopleSet);

		System.out.println("Line 52 :");
		peopleSet.stream().filter(p->p.getAge()>20).forEach(System.out::println);
		//filter -> functional interface predicate help us to filter the
		Predicate<Person> p=person->person.getAge()>20;
		Consumer<Person> c=System.out::println;
		System.out.println("Line 56 :");
		peopleSet.stream().filter(p).forEach(c);
		
		System.out.println("As per slide 190");
		Optional<Integer> minAge=peopleSet.stream()
										  .map(person->person.getAge())
										  .filter(age->age>20)
										  .min(Comparator.naturalOrder());
		if(minAge.isPresent()) {
			System.out.println("Min Age"+minAge.get());
		}
		
		BinaryOperator<Integer> sumOperator=(n1,n2)->n1+n2;
		int result=Stream.of(1,2,3,4,5).reduce(0,sumOperator);
		System.out.println("Number sum: "+result);
		Integer sumAge=peopleSet.stream()
										  .map(person->person.getAge())
										  .filter(age->age>20)
										  .reduce(0,sumOperator);
		System.out.println(sumAge);
		
		Optional<Integer> sumOptionalAge=peopleSet.stream()
		.filter(person->person.getAge()>20)
		.map(person->person.getAge())
		.reduce(sumOperator);
		
		if(sumOptionalAge.isPresent()) {
			System.out.println("Avg sum"+sumOptionalAge.get()/10);
		}else {
			System.out.println("Nothing");
		}
		
		
		
		
		
		
	}

	private static void oldway(Set<Person> peopleSet) {
		for(Person p: peopleSet) {
			System.out.println(p);
		}
		//step 1 : extract the age in some collection
		final List<Integer> ageList=new ArrayList<>();
		//step 2  : extract age from person 
		for(Person p: peopleSet) {
			ageList.add(p.getAge());
		}
		//step 3: group of people age>20
		final List<Integer> ageGroupGt20List=new ArrayList<>();
		for(int age: ageList) {
			if(age>20) {
				ageGroupGt20List.add(age);
			}
				
		}
		//step 3: do the iteration ove agelist and get the sum
		int sum=0;
		for(int age:ageGroupGt20List) {
			sum=sum+age;
		}
		final double averageAge=sum/ageList.size();
		System.out.println("Average of age for group gt ageof 20 : "+averageAge);
	}

}
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


```java
// Training notes



Must Read: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html

[11:11 AM] Dhanashree Jawle
Discuss and come up with the solutions where you have implmented 
inteface
abstract class
concrete class
Custom exception
Handling exception 
 
[11:11 AM] Dhanashree Jawle
for your project.



```java

[11:55 AM] Dhanashree Jawle
package com.training.bankapp.util;
 
import java.util.List;
 
public interface IList<T> {
	// CRUD
	// CREATE
	T add(T t);
 
	// RETRIVE - Based on unique id
	T findById(int id);
 
	// RETRIVE - All objects
	List<T> findAll();
 
	// UPDATE
	boolean update(int id, T t);
 
	// DELETE
	boolean delete(int id);
 
}
 
[11:55 AM] Dhanashree Jawle
package com.training.bankapp.util;
 
import java.util.ArrayList;
import java.util.List;
 
import com.training.bankapp.model.BankAccount;
 
public class BankAccountList implements IList<BankAccount> {
 
	static final List<BankAccount> accounts = new ArrayList<>();
 
	public BankAccountList() {
		super();
 
	}
 
	@Override
	public BankAccount add(BankAccount t) {
//		if (accounts.contains(t)) {
//			return null;
//		}else {
//		accounts.add(t);
//		return t;
//		}
		if(!accounts.contains(t)) {
			accounts.add(t);
			return t;
		}
		return null;
	}
 
	@Override
	public BankAccount findById(int id) {
		for (BankAccount account : accounts) {
			if (account.getAccNo() == id) {
				return account;
			}
		}
		return null;
	}
 
	@Override
	public List<BankAccount> findAll() {
		
		return accounts;
	}
 
	@Override
	public boolean update(int id, BankAccount t) {
		for (BankAccount account : accounts) {
			if (account.getAccNo() == id) {
				account.setAccName(t.getAccName());
				account.setBalance(t.getBalance());
				return true;
			}
		}
		return false;
	}
 
	@Override
	public boolean delete(int id) {
		for(BankAccount account:accounts) {
			if(account.getAccNo()==id) {
				accounts.remove(account);
				return true;
			}
		}
		return false;
	}
 
}
 
[11:55 AM] Dhanashree Jawle
package com.training.bankapp;
 
import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.BankAccountList;
 
public class Main {
 
	public static void main(String[] args) {
		System.out.println("Main starts");
		BankAccountList bankAccountList=new BankAccountList();		
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Create Bank Accounts ");
		bankAccountList.add(new SavingAccount(1,"Amit",1000000.00));
		bankAccountList.add(new SavingAccount(2,"Ajit",1000000.00));
		bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
		bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		System.out.println("Find the details of account using accNo:");
		BankAccount account=bankAccountList.findById(3);
		System.out.println(account);
		System.out.println("Lets do the deposit and withdraw operations");
		account.withdraw(99999);
		System.out.println("Called account.withdraw(99999)");
		System.out.println("After withdraw"+account);
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		System.out.println("Lets delete account ");
		bankAccountList.delete(3);
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		
		System.out.println("Main ends");
	}
 
}
 
[11:56 AM] Dhanashree Jawle
package com.training.bankapp;
 
import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.BankAccountList;
import com.training.bankapp.util.InsufficientBalanceException;
 
public class Main {
 
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			BankAccountList bankAccountList=new BankAccountList();		
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Create Bank Accounts ");
			bankAccountList.add(new SavingAccount(1,"Amit",1000000.00));
			bankAccountList.add(new SavingAccount(2,"Ajit",1000000.00));
			bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
			bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
			System.out.println("Find the details of account using accNo:");
			BankAccount account=bankAccountList.findById(3);
			System.out.println(account);
			System.out.println("Lets do the deposit and withdraw operations");
			account.withdraw(99999);
			System.out.println("Called account.withdraw(99999)");
			System.out.println("After withdraw"+account);
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
			System.out.println("Lets delete account ");
			bankAccountList.delete(3);
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
		} catch (InsufficientBalanceException  e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}
 
}
 
package com.training.demo.model;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import com.training.demo.util.People;
 
public class Main {
 
	public static void main(String[] args) {
		People people=new People();
		Set<Person> peopleSet=people.findAll();
		peopleSet.add(new Person(1, "Amit", 17));
		peopleSet.add(new Person(2, "Ajit", 17));
		peopleSet.add(new Person(3, "Ajit", 17));
		peopleSet.add(new Person(4, "Ajit", 17));
		peopleSet.add(new Person(5, "Ajit", 17));
		peopleSet.add(new Person(6, "Ajit", 17));
		peopleSet.add(new Person(7, "Ajit", 17));
		peopleSet.add(new Person(8, "Ajit", 17));
		peopleSet.add(new Person(9, "Ajit", 17));
		peopleSet.add(new Person(10, "Ajit", 17));
		peopleSet.add(new Person(11, "Ajit", 18));
		peopleSet.add(new Person(12, "Ajit", 18));
		peopleSet.add(new Person(11, "Ajit", 19));
		peopleSet.add(new Person(12, "Ajit", 19));
		peopleSet.add(new Person(13, "Ajit", 20));
		peopleSet.add(new Person(14, "Ajit", 20));
		peopleSet.add(new Person(15, "Ajit", 20));
		peopleSet.add(new Person(16, "Ajit", 20));
		peopleSet.add(new Person(17, "Ajit", 20));
		peopleSet.add(new Person(18, "Ajit", 20));
		peopleSet.add(new Person(19, "Ajit", 20));
		peopleSet.add(new Person(20, "Ajit", 20));
		peopleSet.add(new Person(21, "Ajit", 22));
		peopleSet.add(new Person(22, "Ajit", 22));
		peopleSet.add(new Person(23, "Ajit", 25));
		peopleSet.add(new Person(24, "Ajit", 25));
		peopleSet.add(new Person(25, "Ajit", 25));
		peopleSet.add(new Person(26, "Ajit", 25));
		peopleSet.add(new Person(27, "Ajit", 25));
		peopleSet.add(new Person(28, "Ajit", 30));
		peopleSet.add(new Person(29, "Ajit", 30));
		peopleSet.add(new Person(30, "Ajit", 30));
 
		for(Person p: peopleSet) {
			System.out.println(p);
		}
		//step 1 : extract the age in some collection
		final List<Integer> ageList=new ArrayList<>();
		//step 2  : extract age from person
		for(Person p: peopleSet) {
			ageList.add(p.getAge());
		}
		//step 3: do the iteration ove agelist and get the sum
		int sum=0;
		for(int age:ageList) {
			sum=sum+age;
		}
		final double averageAge=sum/ageList.size();
		System.out.println("Average age : "+averageAge);


        // use lambda expression to find the average age and 
        // use lambda expression to find the average age using for each
        final double averageAge1=peopleSet.stream().filter(p->p.getAge()>20).mapToInt(p->p.getAge()).average().orElse(0.0);

        // sort the peopleSet based on age
        peopleSet.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).forEach(System.out::println);
        // sort the peopleSet based on age and name
        peopleSet.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        // stream:
        /*
         * 1. stream does not store the data
         * 2. lazy evaluation(right -> left ) call on demand
         * 3. parallel processing
         * 4. filter, map, reduce, collect
         * 5. stream is not reusable
         * 6. stream is not thread safe, serializable, cloneable
         * 7. 
         * 
         * All reduction operations: collect, count, max, min, reduce, sum & average replace the for loop
        */

        // get the min age
        final int minAge=peopleSet.stream().mapToInt(p->p.getAge()).filter(age->age>20).min().getAsInt(); // output 21

        // use groupingby
        peopleSet.stream().collect(Collectors.groupingBy(p->p.getAge())).forEach((age,p)->System.out.println(age+" "+p));

        Map<Integer, List<Person>> map=peopleSet.stream().collect(Collectors.groupingBy(p->p.getAge()));

        // use reduce
        final int sumOfAge=peopleSet.stream().mapToInt(p->p.getAge()).reduce(0, (a,b)->a+b);
        final int sumOfAge=peopleSet.stream().mapToInt(p->p.getAge()).reduce(0, Integer::sum);
		
	}
 
}
 ```
TODO: Need to complet lambda pdf.





## Exception Handling:
- *Code:* [src.com.training.learn.exception.\*.java]
- Exception and others.. <must>
- Make a notes of multiple throws and one try catch function inside function.....



Exception in java is a Throwable object
Exception terminates the execution
You can handle exception gracefull by writing down try-catch-finally block
Two types or Error
Syntax which is caused at compilation
Logical Error which is detected at run time
Exception occurs at run time and terminates the execution of the code
1. Null Pointer Exception
2. Array index out of bound
3. Devide by zero

-> Any method throws an exception of type java.lang.Exception => Checked Exception 
you must handle checked exception 
i.e. either in main method you write throws or you handle it with try{}catch()

java.lang.Exception

unchecked Exception 
   RuntimeException java.lang.ArithmeticException: /by zero=> Summary
   - no need to handle(try chtch block)

1. Thorwable -> Exception
2. Create custom exception
	a. extends Exception -> must called in try{}catch() () throws exception
	b. extends RuntimeException
3. Always remember we can have multiple catch on single try
```java
try{}
catch(InsufficientBalanceException e) {}
catch (RuntimeException e) {} // maintain the hiriarchy
catch (Exception e) {}
catch (Throwable e) {}
finally{} // used to close resources
```
- custom exceptions



## File io
- **Code:** [src.com.training.learn.fileio.\*.java]
- Complete File io [oracle docs](https://docs.oracle.com/javase/tutorial/essential/io/)


### Serialization and Deserialization in Java [Link](https://www.javatpoint.com/serialization-in-java)


## Blob Data with Oracle DB
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class OracleBlobExample {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/yourDatabase";
        String user = "yourUsername";
        String password = "yourPassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            createTable(conn);
            insertBlobData(conn, "filePath");
            System.out.println("Blob data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String createTableSQL = "CREATE TABLE blob_table (id NUMBER PRIMARY KEY, blob_data BLOB)";
        try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
            pstmt.executeUpdate();
        }
    }

    private static void insertBlobData(Connection conn, String filePath) throws SQLException {
        String insertSQL = "INSERT INTO blob_table (id, blob_data) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setInt(1, 1); // Set your ID
            pstmt.setBlob(2, getBlobData(filePath));
            pstmt.executeUpdate();
        }
    }

    private static InputStream getBlobData(String filePath) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputStream;
    }
}
```

## JDBC: Day12_jdbc_singlton_thread & Day13_jdbcdemo02_junit4
### Working with Maven(Oracle JDBC)
- have a look at jdbc-tuts. ***
- https://maven.apache.org/ - one time jdbc connector(marvin)
create a Maven project: [TO Learn](https://www.javatpoint.com/how-to-create-a-maven-project)
1. Maven
2. org.apache.maven.archetypes:maven-archetype-quickstart
3. version: 1.4
4. groupid: com.projectname
5. artifactid: projectname
6. version: 1.8
7. Goto: https://mvnrepository.com
8. search for a:oracle and select 'Ojdbc8'
9. select the version: 12.2.0.1
10. copy the dependency and paste it in the pom.xml file between <dependencies> </dependencies>
	```xml
	<!-- https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc8 -->
	<dependency>
		<groupId>com.oracle.database.jdbc</groupId>
		<artifactId>ojdbc8</artifactId>
		<version>12.2.0.1</version>
	</dependency>
	``` &&
	```xml
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
	```
	parally change the version `<version>1.8</version>`
11. Right click on the project and select Maven -> Update Project
12. util to connect with db
13. `junit5`: unit testing look jdbcdemo2 ma'ams code.
14. to run a maven project: in the terminal `mvn clean package` `mvn clean install`
15. (tomcat vscode extension) -> install tomcat server and run the project.
### Dynamic Web Project
1. create a project `DynamicWebProject` in eclipse.
2. give project name`web01`
3. select the target runtime as `Apache Tomcat v8.5`
#### Go to `C:\CODE\1]_Lets_Compile\3]_learning_java\JDBC\jdbc-tuts2` to learn more about JDBC
	1. Model
	2. DAO
	3. collection
	4. service
	5. controller.

1. Serialization and Deserialization in Java [Link](https://www.javatpoint.com/serialization-in-java)
2. Hibernate Tutorial [Link](https://www.javatpoint.com/hibernate-tutorial)
3. exception-handling-in-java [Link](https://www.javatpoint.com/exception-handling-in-java)
4. file io
5. jdbc-rowset [Link](https://www.javatpoint.com/jdbc-rowset)


#### JDBC [Link](https://www.javatpoint.com/java-jdbc)
##### hibernate-tutorial: [Link](https://www.javatpoint.com/hibernate-tutorial)
#### DAO: 
- [The DAO Pattern in Java](https://www.baeldung.com/java-dao-pattern) - 🎉[*** imp Has-A relation]
- [DAO Class in Java](https://www.javatpoint.com/dao-class-in-java)
#### Collection: 
#### Services: [Service Locator Pattern and Java](https://www.baeldung.com/java-service-locator-pattern)
#### DTO: [The DTO Pattern (Data Transfer Object)](https://www.baeldung.com/java-dto-pattern)
##### Conclusion:
- DAOs are more granular and deal with one specific entity.
- Services provide macro level functionalities and can end up using more than one DAO.
- Typically, Services are used for defining transaction boundaries to gain atomicity.
- In other words, if you end up updating multiple tables using multiple DAOs, defining transaction boundary at service will help in either committing or rollbacking all the changes done to DB.
- DAO patterns, are used to divide high level business services from low level data accessing APIs
- common operations to be carried out on a model object
##### data-access-object-pattern: [layered-architecture](https://www.geeksforgeeks.org/data-access-object-pattern/)
##### layered-architecture: [layered-architecture](https://medium.com/java-vault/layered-architecture-b2f4ebe8d587)

#### servelate: [Link](https://www.javatpoint.com/servlet-tutorial)
#### [create-a-dynamic-web-project-in-vs-code](https://stackoverflow.com/questions/76013263/how-can-we-create-a-dynamic-web-project-in-vs-code)
##### [life-cycle-of-a-servlet](https://www.geeksforgeeks.org/life-cycle-of-a-servlet/)
##### [JavaServlets](https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaServlets.html)

#### JSP
##### [baeldung.jsp](https://www.baeldung.com/jsp)
##### [javatpoint.jsp](https://www.javatpoint.com/jsp-api)
##### [crud-in-jsp](https://www.javatpoint.com/crud-in-jsp)
##### [jsp_directives](https://www.tutorialspoint.com/jsp/jsp_directives.htm)
##### [jsp_actions](https://www.tutorialspoint.com/jsp/jsp_actions.htm)

#### crud: https://www.javaguides.net/2019/03/jsp-servlet-jdbc-mysql-crud-example-tutorial.html
https://www.tutorialspoint.com/jsp/jsp_syntax.htm
- https://jqueryvalidation.org/
- https://www.geeksforgeeks.org/form-validation-using-jquery/
- https://www.geeksforgeeks.org/postman-tutorial/
- xml from w3 schools

```txt
Web Service Introduction - Architecture : https://www.geeksforgeeks.org/java-web-services/
. WSDL Structure - 							https://www.geeksforgeeks.org/wsdl-introduction/
. Sample WSDL with usage of XML:			https://www.geeksforgeeks.org/xml-basics/
. XSD:										https://www.w3schools.com/xml/schema_intro.asp
. SOAP Service:								https://www.javatpoint.com/soap-web-services
. REST Service / REST Service Operation	   			https://www.digitalocean.com/community/tutorials/restful-web-services-tutorial-java
. Postman Tool Introduction: https://www.geeksforgeeks.org/postman-tutorial/
. SoapUI Tool Introduction
https://www.bing.com/search?q=SoapUI+Tool+Introduction+tutorial&qs=n&form=QBRE&sp=-1&lq=0&pq=soapui+tool+introduction+tutorial&sc=0-33&sk=&cvid=46E4BE1427B74475814C7AA4AAFD8DEF&ghsh=0&ghacc=0&ghpl=				
```
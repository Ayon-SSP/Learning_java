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



## Strings
String(string buffer, string pul, string object)
- *Code:* [src.com.training.learn.stringObj.\*.java]
- Javatpoint: https://www.javatpoint.com/java-string & YT(https://youtu.be/Bj9Mx_Lx3q4?si=7elMjycmJjImFxu8)
- String is immutable
- 
## Collections in Java
- *Code:* [src.com.training.learn.collections.\*.java]
1. Array
2. ArrayList




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

- ClassName objectName=new ClassName();
- *Code:* [src.com.training.learn.oop.\*.java]
- all objects are stored in heap memory
- TODO: Coupling, Cohesion, Association(1-1, 1-N...), Aggregation, Composition.
- Overriding Object.toString() -> Greeting/Contact -> to provide custom string on the call of toString()


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
Using new Keyword: ClassName cls1 = new ClassName() 
Using clone() method: @Override public Object clone() throws CloneNotSupportedException {return super.clone(); } || MyClass obj2 = (MyClass) obj1.clone();
Using newInstance() method of the Class class   || MyClass instance1 = (MyClass) myClass.newInstance();
Using newInstance() method of the Constructor class
Using Deserialization
- Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects  

#### Method in Java
> [method-in-java](https://www.javatpoint.com/method-in-java)
 
#### Constructor
new Greeting() => Constructor of the Greeting Class =>Default Constructor
	
Constructor
	->Special method/function which has same name as that of the class
	->Constructor is called with new keyword to return the object of that class
	->purpose of constructor is initializing field variables with default value
	->Please note constructor do not have the return type 
	->If no constructor is provided due inheritance it calls Parent class Default construtor
		i.e. Greeting -> Object -> Object()
	->In java we can override Constructor


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

#### Java static keyword
> [static-keyword-in-java](https://www.javatpoint.com/static-keyword-in-java)
>
- static, final, and private methods are bound at compile-time due to their inherent characteristics.
**The static can be:**
1. Variable (also known as a class variable): only one copy | gets special memory | can be accessed by class name | can be accessed by all objects of the class. | auto increment | ![img staticvariable](https://static.javatpoint.com/images/staticvariable.JPG)
2. Method (also known as a class method) | can be accessed by class name | can access only static data members | can change the value of static variables | can be called without creating an object | can't use non-static data member or call non-static method directly. ***
3. Block (static block): used to initialize the static data members | During the time of class loading, even before the main method is loaded, the JVM executes the static block.
4. Nested class

Type of methods:
  1. static method:
     - Static Methods
       - public static void main(String[] args) {}
       - static method can call static methods only.
  2. non-static:

- outside classes canot be static.
- static methods can only access static variables and methods.
- static class can only have static methods and variables. ***
- static class are always created inside the non-static class. ***

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

### Java Abstraction: javaTpoing/[John](https://youtu.be/HvPlEJ3LHgE?si=CdM3J1G-NAY9x29W)
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
- public `abstract` class Parent{`abstract` void methodsFoo();} || public class Son `extends` Parent{}/public class Daughter `extends` Parent{}X  

```java
Interface:
    1. variables: final & static only
    2. methods: public & abstract by default | !final (final must contain body) | can create private but no use |
    3. 
    4. may contains default methods
    5. can't have constructor
    6. can't have instance variables

```
- every method in interface is public and abstract
- Interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
- can't create an object of an interface
- an interface can extend multiple interfaces




- Can't instantiate(abstract class can't be instantiated directly)
- all are public abstract methods
- variables: static and final by default. final cause if you can't create constructor then how you will initialize the variable. static cause, if no static then parent1(value1) and parent2(value1) so child.value will be ambiguous don't know which one to access so all variables are static.





#### Difference between Abstract class and Interface
1. extends abstractClass, implements interface1, interface2(extends only one abstract class, implements)









### Polymorphism
#### Final Keyword
#### Dynamic Polymorphism(Overriding)






### Encapsulation
#### Data Hiding






### super and this keyword





### Abstraction:



#### Difference between Abstract class and Interface
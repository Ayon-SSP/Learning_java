## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

jvm: platform dependent(.class -> native code)









Learning Source:
	ref:
  	- Oracle Docs: https://docs.oracle.com/javase/tutorial
  	- Kunal OOPs: https://youtube.com/playlist?list=PL9gnSGHSqcno1G3XjUbwzXHL8_EttOuKk&si=wdLQQfKG84VjKypD
  	- javatpoint: https://www.javatpoint.com/java-oops-concepts



Architecture: 
- ![](https://static.javatpoint.com/images/jdk2.png)
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
path: C:\Program Files\Java\jdk-16.0.1\bin
classpath: C:\Program Files\Java\jdk-16.0.1\lib
JAVA_HOME: C:\Program Files\Java\jdk-16.0.1


Architecture 
	a. JDK -> Java Development Kit     ->will have files/exe which will support building of java app
	b. JRE -> Java Runtime Environment ->supports execution application build on java
	C. jvm -> java virtual machine 
				.java ->compile->.class
				.class-> executed
JDK8 	
>=JDK9 -> modules 	

Oracle Database=>installer =>JRE

install -> 32 bit
		   64 bit
		   
	path
	classpath
	JAVA_HOME
============================================================================
1. Keywords
2. data type
3. variable.: types of variable, scope variable
4. Opearators
5. Dicision Control statement: ifelse,switch case
6. Looping  Control statement: do-while,while,for-loop,enhanced forloop
7. Array, Collection,Generics,lambda
8. Reusable -> Function 
9. OOP class,object, OOP principle
============================================================================
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
############################################################################################
Run the Java program:
  Step 1 >javac Main.java =>Main.class
  Step 2 >java Main 


  Step1 -> a. Syntax -> Main.class
  Step2 -> java Main-> loading the class-> checking is it valid file-> if valid -> output
                                    else     -> error							
############################################################################################
1. .java file must have one public class and it should be saved with the name of public class
	e.g. public class Greeting {} => Greeting.java 
		 public class Main2 {}  => Main2.java
2. Class name are meaning full and following PascalCase

we understood what is package?
How to compile the code which has first line as package -> javac -d . *.java 
How to execute -> java com.training.Main3 (using the classified name of the class)
How to import classes from the other package? -> import -> public 
com.training.Main3.java
com.training.Greeting.java
org.training.Greeting.java

d:\workspace\javaws
c:\workspace\javaws

com.training.zomato
com.training.swiggy

javadoc tags
Some of the commonly used tags in documentation comments:

Tag	Syntax	Description
{@docRoot}	{@docRoot}	to depict relative path to root directory of generated document from any page.
@author	@author name - text	To add the author of the class.
@code	{@code text}	To show the text in code font without interpreting it as html markup or nested javadoc tag.
@version	@version version-text	To specify "Version" subheading and version-text when -version option is used.
@since	@since release	To add "Since" heading with since text to generated documentation.
@param	@param parameter-name description	To add a parameter with given name and description to 'Parameters' section.
@return	@return description	Required for every method that returns something (except void)

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










### Array:
	- 
















- OOPS
  - static block: loaded even before object creation.
  - object block: only if we create obj.

```bash
javac -d . Main.java
java com.trainer.Main
# more than one class in a Folder
javac -d . *.java # where the .java files are dependent on each other.
```
######################################################
project Name: always in small case (followed by some number only during training)
e.g. bankapp for training bankapp01/demo01
class Name: PascalCase  Greeting.java, Student.java, BankAccount.java
object Name: camelCase	greeting,student,bankAccount
variable : camelCase 	balance
MethodName: camelCase   withdraw()
packagename : all small case e.g. com.training.bankapp or com.training.demo
######################################################

- Local variable: declared withing the functions exist within that function
    1. local variable has block scope. {}
    2. must have data type metioned and initialized before use
    3. depending on it type
    4. Naming convention:
       - variable -> cameCase -> number1, totalAmount(alphanumeric, numbers start with 2nd charater)
       - constant -> UPPER_CASE -> PI, MAX_VALUE
       - method -> camelCase -> calculateArea(), getArea()
       - class -> PascalCase -> Circle, Rectangle
       - package -> smallCase -> com.trainer.java
          - com.training.zomato
          - com.training.swiggy
       - interface -> PascalCase -> Shape, Drawable
       - enum -> PascalCase -> WeekDays, Months
       - annotation -> PascalCase -> Override, Deprecated
       - exception -> PascalCase -> IOException, SQLException
       - thread -> camelCase -> mainThread, childThread

Primitive Types(simple types):
  – byte, short, int, and long for integer values
  – float and double for real/fractional values
  – char for letters, digits, symbols, punctuation
  – boolean for true and false
Literals(constants values):
  - values of one of these types
  – 'A', -7, 3.5, true
  eg. int x = 10; [variable var_name = value;] where 10(value) is literal.

Type of methods:
  1. static method:
     - Static Methods
       - public static void main(String[] args) {}
       - static method can call static methods only.
  2. non-static:


Main main=new Main();

Main main => variable in your function pointing to the real object 
new Main() => actual object which has a memory
new	=> keyword used to allocate a memory to object
Main() => default constructor/non parameterised constructor 
	=> used in allocation of memory along with new keyword and always returns object
	=> Its a special method which don't have a return type

Creating project certain -> business need
package-> com.zomato
			controller
			view
			model 
			
use case - > package
use case -> 
Main.class


8 Data types
Primitive: byte,short,int,long,float,double,char,boolean
Wrapper Class:Byte,Short,Integer,Long,Float,Double,Char,Boolean

Programming 
Networking   Source <====> Destination => Object
1. wrapping		int->Integer
2. unwrapping  Integer=>int
3. 


Java Numeric Default :  check(package com.training.demo;)
Number without decimal : int			123,12345
Number with decimal    : double 		12.12
Float : 12.12F
Long  : 123L

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

*Incase of local variables we must follow 
	1. declare
	2. initialize
	3. use



###########################################################
Lets create a simple Greeting class 
this greeting class should have a message variable which can be edited 
1. class: Greeting => encapsulation
2. field variable called message which is private
3. functions to change the value : 
	getMessage(): return message   -> getting the value	
	setMessage(String m):message=m -> updating value
#############################################################
Project must have one public class with public void static main(String [] args){}:- Main.java/App.java
Project all classes should be kept inside relevant packages 
package for Main.java => com.training.demo.Main.java
for classes which represents data => com.training.demo.model 
for classes which represents controllers => com.training.demo.controller
for classes which represents data access logic => com.training.demo.dao
for classes which represents services => com.training.demo.services


String concatenation : we used + 
System.out.println(""+greeting1.getGreetingNo());
greeting1.getGreetingNo()=> calling a method on greeting1 object		



new Greeting()=> Constructor of the Greeting Class =>Default Constructor
Constructor
	->Special method/function which has same name as that of the class
	->Constructor is called with new keyword to return the object of that class
	->purpose of constructor is initializing field variables with default value
	->Please note constructor do not have the return type 
	->If no constructor is provided due inheritance it calls Parent class Default construtor
		i.e. Greeting -> Object -> Object()
	->In java we can override Constructor	


create a project demo06
				 com.training.demo.Main.java
					main()
						Person p1=new Person();
						Person p2=new Person();
						//print the uid and name for p1 and p2					
						
				 com.training.demo.Person
					private int uid;
					private String name;

Greeting 

Contact		 id   name		phoneNo		email
			  1  Ajit 		9876543210  amit@some.com 		
			  2  Ajit 		9876543210  amit@some.com 		
			  3  Ajit 		9876543210  amit@some.com 		
			  4  Ajit 		9876543210  amit@some.com 		
			  
Object to STrin conversion which is done by 
Overriding toString() 
Overriding -> Parent and child 
Parent -> object 
Child -> Contact 		
Object class is a parent of all classes in Java 
Inheritance => Object Hierarchical 

public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }		  
		
contact1.toString(): com.training.demo.model.Contact@626b2d4a
contact1.toString(): com.training.demo.model.Contact@5e91993f
contact1.toString(): com.training.demo.model.Contact@1c4af82c
contact1.toString(): com.training.demo.model.Contact@379619aa

1, Ajit, 9876543210, ajit@some.com		
		
System.out.println(greeting2);		=> toString() method 
		
1. Local variable -> function paratmeters {} variable 
2. Field/Instance -> class , private, the get initialised when constructor => multiple copies
3. statick variable-> single copy   ***


Assignment 1 : 
1. Create a projet assign01 
	Main.java -> Create object of Book Class where Book (id,bookName,authorName)
2. Create a projet assign02 
	Main.java -> Create object of Student Class where Student (id,studentName,courseName)
3. Create a projet assign03 
	Main.java -> Create object of Product Class where Product (id,pid,productName,unitPrice)
	
In all above assignment :
1. Creting 2 object of given class
2. override the toString() alt+s+s
3. logic for public methods -> getter/setter for instance variables for each model class	
4. ensure that you are having default and overloaded constructor for each class

Day 3
Java has own in build classes 
Problem/Requirement need of different class is their =>Customization 
OOP
Abstraction
Encapsulation
Inheritance
Polymorphism		
######################################################	

1. Class
	public 
		private data member/field/instance variable
		public methods 
2. Object
	ClassName objectName=new ClassName();
3. Constructor
		Special Method which donot have return type
		it is always called with new keyword and returns object of the class
		initializes the datamember/field/instance variable
		overload the constructor 
		if you overload constructor you must mention default constructor
		if you are not adding any constructor by default it calls default constructor Object
		Arbitrary Number of Arguments: [Link](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)
4. Overriding Object.toString()-> Greeting/Contact -> to provide custom string on the call of toString()
######################################################
basic: demo
application : bankapp01...

We need to create 3 bank accounts accNo,accName,balance
two withdraw() and deposit() >>>> balance

1. 3 Constructor
	BankAccount()
	BankAccount(accNo,accName,balance)
	BankAccount(accName,balance)
2. use of Static variable
	static counter=>assign unique values to accno
######################################################
project Name: always in small case (followed by some number only during training)
e.g. bankapp for training bankapp01/demo01
class Name: PascalCase  Greeting.java, Student.java, BankAccount.java
object Name: camelCase	greeting,student,bankAccount
variable : camelCase 	balance
MethodName: camelCase   withdraw()
packagename : all small case e.g. com.training.bankapp or com.training.demo
######################################################
POJO : Plain old Java Object
What is POJO?
Every class in Java is POJO 
when it is not extending any classes except the serialziation package 

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
######################################################
Java allows overloading of function
1. Function name is same
2. There is change in the parameters
	a. number of parameters
	b. order of paramenters 

Difference between bankapp01 and bankapp02
1. In bankapp01 we have used BankAccount(1,"Amit",222222) constructor
	where we are providing all the details of an object 
2. In bankapp02 we have created account object using BankAccount("Amit",222222.00) 
	where we used a static variable to provide the accNo value
	
As in Real time when we open an Bank Account, the bank system generates the account number.
To achieve this same logic through Java Programming we used static Variables
Why Static Variables?
1. These are class variables 
2. Every object can access them 
3. Its a single copy
4. It helped us to auto increment the value of accNo

### Static variable as data member in the BankAccount
### static variable inside a method
When on instance/class variable you provide only getter method that variable is ReadOnly
When on instance/class variable you provide getter and setter method that variable is ReadWrite Editable

//static block which gets called even before an object is created 
//init satic block where we can do initializatio	
	
1. Static	 ->variable,functions, iniUtblock
2. non static ->variable,functions,initblock
	
use default and overloaded constructor (excluding auto generated variable) for : Creation
use all datamember constructor for Reading/retriving data.
	Summary
	1 How to create objects using different construtors
	2.How to use static and non static variables
	3.How to use static and non static functions
	4. Class variable-> static varaibles
	5. class methods=> static methods in a class
	6. use of init blocks 
		a. static=> called only once and used to initialise the static variables
		b. non-static=>called everytime an object is created used to initialise the object/instance variable
	7. Arrays in java : 1 dimensional array
		a. Primitive array : int
		b. REference type array: String
	8. For loop
		a. basic for loop
		b. For each / Enhanced for loop
		
	
	
- outside classes canot be static.
- static methods can only access static variables and methods.
- static class can only have static methods and variables.
- static class are always created inside the non-static class.
	
	
	
	
	
	
	
#######################################
Point 1:
1. Always create a Java Bean with overloaded constructor and overide a toString() method
2. if creating any model class it must be a java bean
3. System.out.println(account); => System.out.println(String.valueof(obj));=>toString()
4. this.accNo=++counter;=> 
++counter=>	++ pre increment counter=counter+1 =>it will increment the value and assign
counter++=>	++ post increment counter=counter+1 =>it will assign the value and then increment
5. We have created 	private static int counter = 0; in BankAccount class
	a. Its a private static variable in BankAccount class
	b. As per the definitio nof static variable you can get its value by Class name
		BankAccount.getCounter()
	c. You dont need object for accessing Static variable data
	d. However you can access the static variable data  using objects also
		account1.getCounter()
	e. There is single copy of static variable created for all object 	
	f. Static variable in side the class are called Class Variable


### Array
```java
public class className extends ParentClass implements Interface1, Interface2{
	// Fields(class members, Instance variables) [A variable which is created inside the class but outside the method is known as an instance variable. Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.]

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
- int arr[]; arr getting defined in the stack
- arr = new int[5]; and now the memory is allocated in the heap.
- int arr[] = new int[5]; // 5 is the size of the array

- ToWatch: 
  - Class format: Traner_notes\src\org\training\learn\model\Book.java
  - Class Object: Traner_notes\src\org\training\OuterClass.java

OOPS:
ref:
	- Kunal OOPs: https://youtube.com/playlist?list=PL9gnSGHSqcno1G3XjUbwzXHL8_EttOuKk&si=wdLQQfKG84VjKypD
	- javatpoint: https://www.javatpoint.com/java-oops-concepts
	- 











- instanceof: test whether the object is an instance of the specified type (class or subclass or interface). || obj instanceof className
- Obj.getClass().getName()... many just use vscode to get the methods and variables of the object.
### How to Create Object in Java [link](https://www.javatpoint.com/how-to-create-object-in-java)
Using new Keyword: ClassName cls1 = new ClassName()
Using clone() method: @Override public Object clone() throws CloneNotSupportedException {return super.clone(); } || MyClass obj2 = (MyClass) obj1.clone();
Using newInstance() method of the Class class   || MyClass instance1 = (MyClass) myClass.newInstance();
Using newInstance() method of the Constructor class
Using Deserialization

### How to Compare Two Objects in Java [link](https://www.javatpoint.com/how-to-compare-two-objects-in-java)


- coupling: refers to the degree of dependency between different classes or modules. Low coupling is desirable because it promotes better code reusability, maintainability, and flexibility.
- Cohesion: in software engineering refers to the degree to which the elements within a module or component belong together. It's a measure of how strongly related and focused the responsibilities of a module are. High cohesion is desirable because it leads to modules that are focused, understandable, and easier to maintain.
- Association: Association represents the relationship between the objects. Here, one object can be associated with one object or many objects. There can be four types of association between the objects:
	- One to One
	- One to Many
	- Many to One, and
	- Many to Many

A class in Java can contain: [correct order](C:\CODE\1]_Lets_Compile\3]_learning_java\java_coffee\practiceProjects\assign01\src\com\training\demo\model)
  Fields
  Methods
  Constructors
  Blocks
  Nested class and interface

## `Student Student1 = new Student();`  (constructor is called)
- Student Student1 => reference to the object(compile time) (by default in gives a unique id)
- allocate memory `dynamically` at `run time` 
- stack => reference to the object || Student1
- heap => actual object || name, rollNo, marks
- new => keyword used to allocate memory to object
- this => keyword used to refer to the current object
- default and overloaded constructor (polymorphism)

### Constructor [Link](https://www.javatpoint.com/java-constructor)
	- Traner_notes\src\PrivateConstructorDemo.java
	- ClassName(){this(a = 1, b = 4)} => default constructor
	- ClassName(int a, int b){} => overloaded constructor

- in `java premitive datatypes` are not created as objects(they are stored in stack it self) but String is created as object. (objects are stored in stack memory) but 10, 2.95, 'a', 9_452_123 are `stored directly in the compiled code` cause they are objects.
  - `String str = new String("Hello");` // str is stored on the stack, but the String object "Hello" is stored on the heap
- what ever things are stored in the stack it give a unique id to it. that unique id -> contains the address of the object in the heap/stored directly in the compiled code.
- when a non-premitive is `final` we canot reassign it.
- static method in class can only access static variables and methods. to access you need to create an object.
- if a class is static 'static class ClassName{}' then automatically all the methods and variables are static.
### Inheritance	
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
	6. 

### Polymorphism: prepare from javatpoint
- ploy = many, morph = forms
1. `compile time(static polymorphism)`:
   1. `Method Overloading`: same method name with different parameters
   2. No `operating Overloading` in java
   3. Constructor Overloading: same constructor name with different parameters
   4. Method Overloading and Type Promotion:  https://static.javatpoint.com/images/java-type-promotion.png
2. `Run time(dynamic polymorphism)`:
   1. `Method Overriding`: same method name with same parameters in parent and child class
      - @override: to check if the method is overridden or not
      - can't override static, final, private methods
      - earling binding: method call is resolved at compile time
      - late binding: method call is resolved at runtime
### Abstraction
- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
#### abstract class
- A class that is declared as abstract is known as an abstract class. It needs to be extended and its method implemented. It cannot be instantiated.
- parent will give just the definition not the implementation(body)
- child class must override the abstract methods || if inheriting any abstract then it must be abstract class
- Cannot create an object of an abstract class || can't create abstract constructor || static and final methods can be in abstract class cause we can't override them.


### Encapsulation
- Encapsulation is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

### Access Modifiers in Java
- `public`: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
- `Protected`: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
- `default`: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- `private`: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

#### Method Access Specifier
	same as 👆
1. Static Method
2. Instance Method: need to create obj to access
   1. Accessor Method getVal(): returns the value of the variable
   2. Mutator Method setVal(): sets the value of the variable
3. Abstract Method: abstract void method_name(); (abstract method is a method declared without an implementation)

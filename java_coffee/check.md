







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
	
############################################################################################
1. 

we understood what is package?

d:\workspace\javaws
c:\workspace\javaws

com.training.zomato
com.training.swiggy













# OOPS:










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

### Anonymous Classes: Traner_notes\src\org\training\learn\AnonymousInnerClasses.java

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
  1. extendable 
	extends	 		class extends class, interface extends interface
	implements 		class implements interface 

### Polymorphism: prepare from javatpoint
- ploy = many, morph = forms
1. `compile time(static polymorphism)`: 💀 No such thing in java
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
   2. Below is an example of Dynamic Polymorphism	
		Parent obj2 = new Child();
		The obj2 a refrence variable of type Parent
		Who is point to objectof child new Child();
		At runtime JVM will understand obj2 will behave like Child 
	- Traner_notes\src\org\training\learn\Demo.java
	- Traner_notes\src\org\training\learn\Circle.java
  

### Abstraction: Traner_notes\src\com\training\learn\abstractclass\\*.java


### Interface
- every method in interface is public and abstract
- Interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
- can't create an object of an interface

#### Difference between Abstract class and Interface
- Abstract class can have abstract and non-abstract methods. Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
- Abstract class can have final, non-final, static and non-static variables abstract or non-abstract methods. Interface has only static and final variables and public, abstract methods.
- Abstract class can provide the implementation of interface. Interface can't provide the implementation of abstract class.
- The abstract keyword is used to declare abstract class. The interface keyword is used to declare interface.
- can only extend one class but can implements multiple interfaces
  in interface: if we declare fealds is alwasys public static final but in abstract class we can have non-static and non-final fields which is access to every class so abstract is introduced to restrict the access of the fields.

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





#### Nested Class
- A nested class is a member of its enclosing class. 
- Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private. 
- Static nested classes do not have access to other members of the enclosing class. As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. (Recall that outer classes can only be declared public or package private.)




Day4:
	Array
	1. Dyanmic Array -> public static void main(String [] args) 
		String [] args =>dynamic array
		java com.training.demo.Main 10 20 30 40 50 		-> args.length=5
		java com.training.demo.Main Amit Ankit Ajit Sumit ->args.length=4
	String to Integer conversion Parsingto int
	int num=Integer.parseInt("11111") => 11111 as number on which we can do the arithmatic operations
	// Print sum of 10 numbers 
	int sum=0;
	for (int num :numbers){
		sum=sum+num;
	}
	sysout("Sum"+sum);

	Q.I was asking if we are directly going to assign value of one array to an other array then what is going to happen to ref variable.
	e.g. 

		int[] numbers1={10,20,30,40,50};
		int[] numbers2=numbers1;
		
		Both numbers1 and numbers2 are pointing to same array object

	Super Entities:	
	class Parent {}
	interface MyInterface {}
	Sub Entity ==> Inheritance (extends class, implements interface)
	class Child extends Parent implements MyInterface {}
	Below is an example of Dynamic Polymorphism	
		Parent obj2 = new Child();
		The obj2 a refrence variable of type Parent
		Who is point to objectof child new Child();
		At runtime JVM will understand obj2 will behave like Child
		
		
		BankAccount account=new BankAccount()
		BankAccount
		SavingAccount nikhil
		CurrentAccount Shumbham 
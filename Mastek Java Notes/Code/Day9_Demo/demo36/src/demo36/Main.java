package demo36;

import com.training.demo.model.Student;

public class Main {

	public static void main(String[] args) {
		//Primitive == compares values 
		//Object == compares are they refering to same memory location
		
		Student student1=new Student(1,"Amit");
		Student student2=new Student(2,"Amit");

		System.out.println("student1==student2 "+ (student1==student2));
		
		Student student3=new Student(2,"Amit");
		
		System.out.println("student2==student3 "+ (student2==student3));
		
		Student student4=student1;
		Student student5=student2;
		System.out.println("student1==student4 "+ (student1==student4));
		System.out.println("student2==student5 "+ (student2==student5));
		
		
	}

}

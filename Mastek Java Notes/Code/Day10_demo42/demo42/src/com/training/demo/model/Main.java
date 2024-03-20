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

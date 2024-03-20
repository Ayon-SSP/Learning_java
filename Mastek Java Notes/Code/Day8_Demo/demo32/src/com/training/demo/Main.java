package com.training.demo;

import java.time.LocalDate;

import com.training.demo.model.Employee;
import com.training.demo.model.FullTimeEmployee;
import com.training.demo.model.PartTimeEmployee;

public class Main {
	/*
	 * class abstract `Employee` implement `ISalary{calculateSalary();}`
	 * `FullTimeEmployee{calculateSalary(){}}` extends `Employee` 
	 * `PartTimeEmployee{calculateSalary(){}}` extends `Employee`
	 */

	public static void main(String[] args) {
		Employee fullTimeEmp = new FullTimeEmployee(1, "John Doe", "Manager", 50000, 5000, LocalDate.of(1999, 1, 4),10);
		Employee partTimeEmp = new PartTimeEmployee(2, "John Smith", "Assistant", 8000, 0, LocalDate.of(1999, 5, 4), 10,8,10);
		System.out.println("John Doe salary is: ");
		System.out.println(fullTimeEmp.calculateSalary());
		System.out.println("John Smith salary is: ");
		System.out.println(partTimeEmp.calculateSalary());
//		Hour's based charges 
//		1hr-5000
//		4 hours for 10 days=>40hr*5000=>200000
//		for next 16 days =>40K	

		// Anonymous class:
		Employee specialCase =new PartTimeEmployee(3, "Dominic", "Assistant", 5000, 0, LocalDate.of(1999, 5, 4), 10,4,10) {
			@Override
			public double calculateSalary() {				
				
				return 40000+(baseSalary*this.getHoursPerDay()*this.getWorkingDays());
			}
		};
		System.out.println("Domic salary is: ");
		System.out.println(partTimeEmp.calculateSalary());		
	}

}

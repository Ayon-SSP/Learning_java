package com.training.demo.model;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int empNo, String empName, String job, double baseSalary, double commission,
			LocalDate hireDate, int departmentNo) {
		super(empNo, empName, job, baseSalary, commission, hireDate, departmentNo);
	}

	@Override
	public double calculateSalary() {

		return baseSalary + commission;
	}

}

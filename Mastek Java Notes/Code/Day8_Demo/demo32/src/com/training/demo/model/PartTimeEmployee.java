package com.training.demo.model;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {
	
	private int hoursPerDay;
	private int workingDays;
	
	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int empNo, String empName, String job, double baseSalary, double commission,
			LocalDate hireDate, int departmentNo) {
		super(empNo, empName, job, baseSalary, commission, hireDate, departmentNo);
	}
	

	

	public PartTimeEmployee(int empNo, String empName, String job, double baseSalary, double commission,
			LocalDate hireDate, int departmentNo, int hoursPerDay, int workingDays) {
		super(empNo, empName, job, baseSalary, commission, hireDate, departmentNo);
		this.hoursPerDay = hoursPerDay;
		this.workingDays = workingDays;
	}

	@Override
	public double calculateSalary() {

		return this.baseSalary*this.hoursPerDay*this.workingDays;
	}

	public int getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

}

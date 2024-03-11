package com.training.demo.model;

import java.time.LocalDate;

public abstract class Employee implements ISalary {

	protected int empNo;
	protected String empName;
	protected String job;
	protected double baseSalary;
	protected double commission;
	protected LocalDate hireDate;
	protected int departmentNo;

	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, String job, double baseSalary, double commission, LocalDate hireDate,
			int departmentNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.baseSalary = baseSalary;
		this.commission = commission;
		this.hireDate = hireDate;
		this.departmentNo = departmentNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", baseSalary=" + baseSalary
				+ ", commission=" + commission + ", hireDate=" + hireDate + ", departmentNo=" + departmentNo + "]";
	}

}

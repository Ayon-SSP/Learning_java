package com.training.demo.model;
//Car has engine
//to start a car -> start engine :=>uses
public class Car {
	private int carNo;
	private Engine engine;
	private String brand;
	private String varient;
	private String color;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carNo, Engine engine, String brand, String varient, String color) {
		super();
		this.carNo = carNo;
		this.engine = engine;
		this.brand = brand;
		this.varient = varient;
		this.color = color;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", engine=" + engine + ", brand=" + brand + ", varient=" + varient + ", color="
				+ color + "]";
	}
	
	public boolean start() {
		return engine.startEngine();
	}
}

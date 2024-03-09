package com.training.learn.interfaces;

public class Car extends Vehicle implements Engine, Media, Break {

    private static final String MODEL = "V8";
    private static final int PRICE = 78000;
    private static final String COLOR = "Black";
    private static final String TYPE = "Sedan";
    private static final int SEATS = 5;
    private static final String ENGINE = "V8";
    private static final String TRANSMISSION = "Automatic";
    private static final String FUEL = "Gasoline";
    private static final int FUEL_CAPACITY = 20;
    private static final int FUEL_CONSUMPTION = 10;
    private static final String FUEL_TYPE = "Regular";
    private static final int FUEL_EMISSION = 200;
    private static final int FUEL_EFFICIENCY = 20;
    private static final int FUEL_ECONOMY = 200;
    private static final int FUEL_COST = 2;
    private static final int FUEL_PRICE = 3;
    private static final int FUEL_TANK = 20;

    public int getWheels() {
        return 4;
    }

    public int getDoors() {
        return 4;
    }

    public void start() {
        System.out.println("Starting the engine...");
    }

    public void stop() {
        System.out.println("Stopping the engine...");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void decelerate() {
        System.out.println("Decelerating...");
    }

    public void turn() {
        System.out.println("Turning...");
    }

    public void changeGear() {
        System.out.println("Changing gear...");
    }

    public void play() {
        System.out.println("Playing media...");
    }

    public void pause() {
        System.out.println("Pausing media...");
    }

    public void record() {
        System.out.println("Recording media...");
    }

    public void rewind() {
        System.out.println("Rewinding media...");
    }

    public void forward() {
        System.out.println("Forwarding media...");
    }

    public void eject() {
        System.out.println("Ejecting media...");
    }

    public void insert() {
        System.out.println("Inserting media...");
    }

    public void powerOn() {
        System.out.println("Powering on media...");
    }

    public void powerOff() {
        System.out.println("Powering off media...");
    }

    public void apply() {
        System.out.println("Applying the break...");
    }

    public void release() {
        System.out.println("Releasing the break...");
    }

    public void hold() {
        System.out.println("Holding the break...");
    }

    public void printModel() {
        System.out.println("Model: " + MODEL);
    }

    public void printPrice() {
        System.out.println("Price: " + PRICE);
    }

    public void printColor() {
        System.out.println("Color: " + COLOR);
    }

    public void printType() {
        System.out.println("Type: " + TYPE);
    }

    public void printSeats() {
        System.out.println("Seats: " + SEATS);
    }

    public void printEngine() {
        System.out.println("Engine: " + ENGINE);
    }

    public void printTransmission() {
        System.out.println("Transmission: " + TRANSMISSION);
    }

    public void printFuel() {
        System.out.println("Fuel: " + FUEL);
    }

    public void printFuelCapacity() {
        System.out.println("Fuel Capacity: " + FUEL_CAPACITY);
    }

    public void printFuelConsumption() {
        System.out.println("Fuel Consumption: " + FUEL_CONSUMPTION);
    }

    public void printFuelType() {
        System.out.println("Fuel Type: " + FUEL_TYPE);
    }

    public void printFuelEmission() {
        System.out.println("Fuel Emission: " + FUEL_EMISSION);
    }

    public void printFuelEfficiency() {
        System.out.println("Fuel Efficiency: " + FUEL_EFFICIENCY);
    }

    public void printFuelEconomy() {
        System.out.println("Fuel Economy: " + FUEL_ECONOMY);
    }

    public void printFuelCost() {
        System.out.println("Fuel Cost: " + FUEL_COST);
    }

    public void printFuelPrice() {
        System.out.println("Fuel Price: " + FUEL_PRICE);
    }

    public void printFuelTank() {
        System.out.println("Fuel Tank: " + FUEL_TANK);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.decelerate();
        car.turn();
        car.changeGear();
        car.stop();
        car.play();
        car.pause();
        car.stop();
        car.record();
        car.rewind();
        car.forward();
        car.eject();
        car.insert();
        car.powerOn();
        car.powerOff();
        car.apply();
        car.release();
        car.hold();
        car.printModel();
        car.printPrice();
        car.printColor();
        car.printType();
        car.printSeats();
        car.printEngine();
        car.printTransmission();
        car.printFuel();
        car.printFuelCapacity();
        car.printFuelConsumption();
        car.printFuelType();
        car.printFuelEmission();
        car.printFuelEfficiency();
        car.printFuelEconomy();
        car.printFuelCost();
        car.printFuelPrice();
        car.printFuelTank();
    }

}
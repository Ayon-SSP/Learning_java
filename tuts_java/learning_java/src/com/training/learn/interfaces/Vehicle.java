package com.training.learn.interfaces;

public abstract class Vehicle {

    private static final String MODEL = null;
    private static final int PRICE = 0;
    private static final String COLOR = null;
    private static final String TYPE = null;
    private static final int SEATS = 0;
    private static final String ENGINE = null;
    private static final String TRANSMISSION = null;
    private static final String FUEL = null;
    private static final int FUEL_CAPACITY = 0;
    private static final int FUEL_CONSUMPTION = 0;
    private static final String FUEL_TYPE = null;
    private static final int FUEL_EMISSION = 0;
    private static final int FUEL_EFFICIENCY = 0;
    private static final int FUEL_ECONOMY = 0;
    private static final int FUEL_COST = 0;
    private static final int FUEL_PRICE = 0;
    private static final int FUEL_TANK = 0;

    
    public abstract int getWheels();
    public abstract int getDoors();


    public void printModel(){
        System.out.println("Model: " + MODEL);
    }
    
    public void printPrice(){
        System.out.println("Price: " + PRICE);
    }
    
    public void printColor(){
        System.out.println("Color: " + COLOR);
    }
    
    public void printType(){
        System.out.println("Type: " + TYPE);
    }
    
    public void printSeats(){
        System.out.println("Seats: " + SEATS);
    }
    
    public void printEngine(){
        System.out.println("Engine: " + ENGINE);
    }
    
    public void printTransmission(){
        System.out.println("Transmission: " + TRANSMISSION);
    }
    
    public void printFuel(){
        System.out.println("Fuel: " + FUEL);
    }
    
    public void printFuelCapacity(){
        System.out.println("Fuel Capacity: " + FUEL_CAPACITY);
    }
    
    public void printFuelConsumption(){
        System.out.println("Fuel Consumption: " + FUEL_CONSUMPTION);
    }
    
    public void printFuelType(){
        System.out.println("Fuel Type: " + FUEL_TYPE);
    }
    
    public void printFuelEmission(){
        System.out.println("Fuel Emission: " + FUEL_EMISSION);
    }
    
    public void printFuelEfficiency(){
        System.out.println("Fuel Efficiency: " + FUEL_EFFICIENCY);
    }
    
    public void printFuelEconomy(){
        System.out.println("Fuel Economy: " + FUEL_ECONOMY);
    }
    
    public void printFuelCost(){
        System.out.println("Fuel Cost: " + FUEL_COST);
    }
    
    public void printFuelPrice(){
        System.out.println("Fuel Price: " + FUEL_PRICE);
    }
    
    public void printFuelTank(){
        System.out.println("Fuel Tank: " + FUEL_TANK);
    }
}

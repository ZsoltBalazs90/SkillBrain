package VehicleHW;
/*
Write a Java program to create a vehicle class hierarchy.
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type.
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
 */

import java.util.Scanner;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String fuelType;
    private int maxSpeed;

    public Vehicle(String brand, String model, int year, String fuelType, int maxSpeed) {
        this.brand= brand;
        this.model= model;
        this.year= year;
        this.fuelType= fuelType;
        this.maxSpeed= maxSpeed;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getFuelType() {
        return fuelType;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void calcul(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti km parcursi: ");
        double kmParcursi= scanner.nextInt();
        System.out.println("Introduceti cantitatea de combustibil alimentat: ");
        double cantitatealimentata= scanner.nextInt();
        double consum= (cantitatealimentata/ kmParcursi)* 100;
        System.out.println("Vehicului a folosit "+ consum+ " de combustibil la 100 de km");
    }
}

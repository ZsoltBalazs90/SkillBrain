package VehicleHW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Truck myTruck= new Truck("Scania", "Seria R", 2022, "Diesel", 100);
        myTruck.truckPrinter();
        myTruck.calcul();

    }
}

package VehicleHW;

public class Truck extends Vehicle {
    public Truck(String brand, String model, int year, String fuelType, int maxSpeed){
        super(brand, model, year, fuelType, maxSpeed);
    }
    public void truckPrinter(){
        System.out.println("Brandul de camion este: "+getBrand()+ "\n"+
                "Modelul: "+ getModel()+ "\n"+ "Anul de fabricatie: "+ getYear()+"\n" +
                "Combustibulul folosit pentru funcionare: "+getFuelType()+ "\n"+
                "Viteza maxima a camionului: "+ getMaxSpeed());
    }
}

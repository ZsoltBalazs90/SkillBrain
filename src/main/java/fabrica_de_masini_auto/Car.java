package fabrica_de_masini_auto;

// Clasa cu rol de core - reprezintă structura unei mașini
public class Car {
    private String color;
    private String engineType;
    private String traction;
    private String wheelDiameter;
    private String bodyType;
    private String doorNumber;

    // Constructor pentru mașina "default"
    public Car() {
        this.color = "Rosu";
        this.engineType = "Benzina 1.2";
        this.traction = "Fata";
        this.wheelDiameter = "15\"";
        this.bodyType = "Sedan";
        this.doorNumber = "5";
    }

    // Constructor cu parametri pentru mașina personalizată
    public Car(String color, String engineType, String traction, String wheelDiameter, String bodyType, String doorNumber) {
        this.color = color;
        this.engineType = engineType;
        this.traction = traction;
        this.wheelDiameter = wheelDiameter;
        this.bodyType = bodyType;
        this.doorNumber = doorNumber;
    }

    // Metoda de afișare a detaliilor mașinii
    public String toString() {
        return "Mașina asamblată cu următoarele specificații:\n" +
                "Culoare: " + (color != null ? color : "Rosu") + "\n" +
                "Motorizare: " + (engineType != null ? engineType : "Benzina 1.2") + "\n" +
                "Tractiune: " + (traction != null ? traction : "Fata") + "\n" +
                "Diametru Roata: " + (wheelDiameter != null ? wheelDiameter : "15\"") + "\n" +
                "Tip Caroserie: " + (bodyType != null ? bodyType : "Sedan") + "\n" +
                "Numar Portiere: " + (doorNumber != null ? doorNumber : "5") + "\n";
    }
}

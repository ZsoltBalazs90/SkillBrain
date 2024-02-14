package fabrica_de_masini_auto;

// Clasa cu rol de runner
public class CarFactoryRunner {
    public static void main(String[] args) {
        // Exemplu de utilizare a fabricii de mașini
        Car customCar = new Car("Albastru", "Diesel 1.6", "Spate", "17\"", "Coupe", "3");
        System.out.println(customCar);

        // Exemplu de utilizare a mașinii default
        Car defaultCar = new Car();
        System.out.println(defaultCar);

        // Exemplu de utilizare a masinii custom combinat cu cel default
        Car mixedCar= new Car("Negru", "Electric", "AWD", "18\"", null, null);
        System.out.println(mixedCar);

    }
}

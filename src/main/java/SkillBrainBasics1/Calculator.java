package SkillBrainBasics1;

import java.util.Scanner; // un pachet preinstalat in JDK

public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n Sa calculam pe niste numere! \n ");
        System.out.println(" Introduceti primul numar fractionar: ");

        Scanner scanner= new Scanner(System.in); // se instantiaza ca un obiect, tipul - numele variabilei
        double numar1= scanner.nextDouble();

        System.out.println(" Introduceti al doilea numar fractionar: ");
        double numar2= scanner.nextDouble();


        Double rezultatInmultire= inmultire(numar1, numar2);
        System.out.println(" Rezultatul inmultirii este: "+ rezultatInmultire);

        double rezultatAdaugare= adaugare(numar1, numar2);
        System.out.println(" Rezultatul adaugarii este: "+ rezultatAdaugare);

        double rezultatScadere= scadere(numar1, numar2);
        System.out.println(" Rezultatul scaderii este: "+ rezultatScadere);

        double rezultatImpartire= impartire(numar1, numar2);
        System.out.println(" Rezultatul impatirii este: "+ rezultatImpartire);

        double rezultatModulo= modul((int)numar1, (int)numar2);
        System.out.println(" Rezultatul modulo este: "+ rezultatModulo); // este nevoie de downcasting deoarece trimitem o variabila de tip
                                                                         // double la o metoda care accepta
                                                                         // valori doar de tip int

        double random= genereazaNumarRandom(rezultatScadere, rezultatInmultire);
        System.out.println(" Numarul random generat intre: "+ rezultatScadere+ " si "+ rezultatInmultire+ " este "+ random);
    }

    public static double inmultire( double nr1, double nr2) { // prima metoda, variabilele din metoda nu trebe sa
                                                       // coincida cu cel declara mai devreme
        double rezultat= nr1* nr2;
        return rezultat;
    }

    public static Double adaugare( double uno, double dos) {
        double rezultat= uno+ dos;
        return rezultat;
    }

    public static double scadere( Double numar1, Double numar2) {
        Double rezultat= numar1- numar2;
        return rezultat;
    }

    public static Double impartire( Double numar1, double numar2){
        return numar1/ numar2;           // nu este nevoie de a vrea o variabilal neaparat, se poate da direct return
    }

    public static int modul(int nr1, Integer nr2){
        return nr1% nr2;
    }

    public static double genereazaNumarRandom( double minim, double maxim) {
        return Math.random()*(maxim- minim)+ minim;
    }
}
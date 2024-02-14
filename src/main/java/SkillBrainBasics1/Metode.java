package SkillBrainBasics1;

public class Metode {
    public static void main(String[] args) { // metoda main
        System.out.println("Printeaza ");    // apelarea metodei pintln

        primaMetoda();
        douaMetoda(6.2);
        System.out.println(treiaMetoda(5));
    }
    // de definit tipul de acces
    // de definit tipul returnat
    // numele metodei( parametri) { bloc de cod; }
    // metoda trebuie apelata dintr-o alta matoda, in momentul de fata apelam metoda in metoda main

    static void primaMetoda() {   // parametri sunt optionali
        System.out.println("Prima mea metoda ");
    }

    static void douaMetoda( double dublu){
        double rezultat= dublu* 2;
        System.out.println(rezultat );
    }

    static int treiaMetoda( int intreg) {
        int rezultat= intreg * intreg;
        return rezultat;
    }

}
// doua tipuri de metode, predefinite de JDK si metode definite de utilizator
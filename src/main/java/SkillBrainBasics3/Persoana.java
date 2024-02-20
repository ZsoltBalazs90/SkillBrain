package SkillBrainBasics3;

public class Persoana {

    public static String SPECIE= " homo- sapiens"; // variabilele statice tin de clasa si nu au nevoie de instantiere "speciala"

    // atribute- modeleaza caracteristicile unui obiect
    String nume;
    int varsta;
    String adresa;

    // constructori- are numele classei
    Persoana() {
        nume= "Maria";
        varsta= 25;
        adresa= "Str. Bucium Nr.45";
    }

    Persoana( String nume, int varsta) {
        this.nume= nume;
        this.varsta= varsta;
    }


    // metode- definesc actiunile pe care un obiect le poate avea
    void plimbare(){
        System.out.println(" Eu ma plimb in parc. ");
    }

    void gateste(){
        System.out.println(" Eu gatesc cina. ");
    }

    public static boolean respira( int dataDecedarii) {
//        if ( dataDecedarii> 0) {
//            return false;
//        } else {
//            return true;
//        }

//        nume - variabilele non statice nu pot fi instantiate in metode statice sau dintr-o zona statica
//        ori ce accesam intr-o metroda statica trebuie sa fie si ele statice


        return dataDecedarii > 0 ? false : true;  // operator tenar, reprezinta acceasi lucru ca si if-ul de sus
    }

}

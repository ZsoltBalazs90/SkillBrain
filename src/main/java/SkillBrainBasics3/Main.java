package SkillBrainBasics3;

public class Main {
    public static void main(String[] args) {
        Persoana persoana= new Persoana();
        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);

        persoana.plimbare();
        persoana.gateste();

        System.out.println(Persoana.SPECIE);                    // accesarea variabilelor statice se poate face si pe classa dar si pe obiect
                                                                // obiectul apartinand de classa respectiva pe care s-a creat variabila statica
                                                                // si metoda statica
        System.out.println(Persoana.respira(0));

        System.out.println(persoana.SPECIE);                    // aici primim atentionare doar pentru faptul ca am apelat variabila/metoda statica
                                                                // pe obiect si nu pe clasa
        System.out.println(persoana.respira(12));

        Persoana persoana1= new Persoana(" Eszti", 16);
        System.out.println(persoana1.nume);
        System.out.println(persoana1.varsta);
        System.out.println(persoana1.adresa);
        // variabilele neinstatiate vor primi valoarea null in cazul variabilelor de tip string
        // valoarea 0 pentru variabilele de tip int, long, double...
        // false in vazul variabilelor de tip boolean

        persoana1.plimbare();
        persoana1.gateste();
    }
}

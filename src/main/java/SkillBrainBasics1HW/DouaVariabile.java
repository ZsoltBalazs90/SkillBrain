package SkillBrainBasics1HW;

import java.util.Scanner;

// Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
//stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
public class DouaVariabile {
    public static void main(String[] args) {
        douaVariabile();
    }

    public static void douaVariabile() {
        Scanner scanner= new Scanner(System.in);

        System.out.println(" Introduceti primul numar: ");
        double prima= scanner.nextDouble();
        System.out.println(" Introduceti al doilea numar: ");
        double doua= scanner.nextDouble();

        System.out.println("\n Primul numar introdus este: "+ prima+ "\n"+
                " Al doilea numar introdus este: "+ doua);

    }
}

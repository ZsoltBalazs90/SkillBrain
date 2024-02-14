package SkillBrainBasics1HW;
// Scrieti un program in care cititi o propozitie de la tastatura.

import java.util.Scanner;

public class DeLaTastatura {
    public static void main(String[] args) {
        System.out.println("\n Scrieti o propozitie de la tastatura: ");
        Scanner scanner= new Scanner(System.in);

        String propozitaIntrodusa= scanner.nextLine();
        System.out.println("\n Propozitia introdusa este: "+ "\n"+ propozitaIntrodusa);

    }
}

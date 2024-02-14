package SkillBrainBasics2HW;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
Daca numarul introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul
“Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).
*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Introduceti un numar de la tastatura: ");
        double numarIntrodus= scanner.nextDouble();

        Random random= new Random();
        double numarRandom= random.nextDouble(100)+ 1;
        System.out.println(" Numarul random generat este: "+ "\n"+ numarRandom);
        System.out.println(" ");

        if ( numarIntrodus < numarRandom){
            System.out.println(" Numarul introdus este mai mic decat numarul random generat. ");
        } else if ( numarIntrodus > numarRandom) {
            System.out.println(" Numarul introdus este mai mare decat numarul random generat. ");
        } else {
            System.out.println(" Numarul introdus este egal cu numarul random generat. ");
        }
    }
}

package SkillBrainBasics2HW;
/*
Definiti un array de char-uri.
Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.
 */

public class Main4 {
    public static void main(String[] args) {
        char[] array= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j'};

        System.out.println(" Arrayul de char contine urmatoarele litere: ");
        for (int i= 0; i< array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println(" \n");
        System.out.println(" Fiecarea al doilea element din array este: ");
        for (int i= 1; i< array.length; i += 2) {
            System.out.print(array[i]+ " ");
        }
    }
}

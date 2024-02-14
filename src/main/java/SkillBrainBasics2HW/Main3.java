package SkillBrainBasics2HW;
/*
Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
Initializati array-ul.
Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
 */

public class Main3 {
    public static void main(String[] args) {
        String[][] bidimensional= {
                {" mare ", " pere ", " prune "},
                {" copt ", " necopt ", " stricat ", " deteriorat", " aproape copt" }
        };

        System.out.println(" Arrayul cu 2 dimensiuni este urmatoarea: ");
        for (int i= 0; i< bidimensional.length; i++) {
            for (int j= 0; j< bidimensional[i].length; j++){
                System.out.print(bidimensional[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println( " Primul element din pria dimensiune: "+ bidimensional[0][0]);
        System.out.println( " Ultimul element din prima dimensiune: "+ bidimensional[0][2]);

        System.out.println( " Primul element din a doua dimensiune: "+ bidimensional[1][0]);
        System.out.println( " Ultimul element din a doua dimensine: "+ bidimensional[1][4]);

    }
}

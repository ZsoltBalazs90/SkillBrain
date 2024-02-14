package SkillBrainBasics2HW;

import java.util.ArrayList;

/*
Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
 */
public class Main8 {
    public static void main(String[] args) {
        //int[] array= {0, 1, 2, 3, 4, 5};
         int[] array= {};
        if (array.length == 0) {
            System.out.println(" Arrayul este gol.");
        } else {
            System.out.println(" Arrayul Nu este gol! ");
        }


        ArrayList<Integer> lista= new ArrayList<>();
        lista.add(54);
        lista.add(0, 2);
        lista.add(0, 12);

        if (lista.isEmpty()){
            System.out.println(" Lista este goala. ");
        } else {
            System.out.println(" Lista nu este goala! ");
        }
    }
}

package SkillBrainBasics2HW;
/*
Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
 */

import java.util.ArrayList;

public class Main7 {
    public static void main(String[] args) {
        Integer[] array= {0, 1, 2, 3, 4};
        System.out.println(" Avem urmatorul array cu elemente de integeri: ");
        for (int i= 0; i< array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        System.out.println(" Calculam suma tuturor elementelor din array. ");
        int suma= 0;
        for (int i= 0; i< array.length; i++) {
            suma = suma + array[i];
        }

        System.out.println(" Suma tuturor elementelor este: " +suma);

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        int sumalist= 0;
        for (int i= 0; i< arrayList.size(); i++ ){
            sumalist += arrayList.get(i);
        }

        System.out.println(" Suma tuturor elementelor este: "+ sumalist );

    }
}

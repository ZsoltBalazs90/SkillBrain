package SkillBrainBasics2;

import java.util.ArrayList;

public class While {
    public static void main(String[] args) {
        /*
        while (conditie) {
            corp bucla
            update_counter
            }
         */

        int i= 0;
        while( i< 7) {
            System.out.println(" I este egal cu: "+ i);
            i++;
        }
        System.out.println("\n");

                // valori primitive
        double[] numere= {21.4, 43.6, 5, -15.4};
        int ii= 0;
        while (ii< numere.length) {
            System.out.println(" Indexul este "+ ii+ ", valoarea este "+ numere[ii]);
            ii++;
        }
        System.out.println("\n");
                // nu putem folosi variabile primitive, deci folosim valori neprimitive
        ArrayList<Double> lista= new ArrayList<>();
        lista.add(23.4);
        lista.add(-12.3);
        lista.add(9d);      // pentru a nu confuda variabila cu unul Integer se pune un "d" la finalul numarului

        int iii= 0;
        while (iii< lista.size()){
            System.out.println(" Indexul este "+ iii+ ", valoarea este "+ lista.get(iii));
            iii++;
        }
        System.out.println("\n");

        int j= lista.size() -1;     // se pune -1 pentru ca se incepe numerotarea de la 0, iar al cincelea element este defapt 4
        while (j >= 0) {
            System.out.println(" Indexul este "+ j+ ", valoarea este "+ lista.get(j)+ "\n");
            j--;
        }


        // se calculeaza suma variabilelor din array-ul si arraylistul de mai jos

        double[] dowhilenumere= {8, 9, 3.5, 5.6, -9};
        ArrayList<Double> dowhilelista= new ArrayList<>();
        dowhilelista.add(42d);      // aparent daca nu se pune "d" la finalul numarului de double il considera integer
        dowhilelista.add(-12.1);
        dowhilelista.add(3.5);
        dowhilelista.add(9d);

        double sumaArray= 0;
        int z= 0;
        do {
            sumaArray= sumaArray+ dowhilenumere[z];
            z++;
        } while (z < dowhilenumere.length);
        System.out.println(" Suma este egala cu: "+ sumaArray);


        double sumaArraylist= 0;
        int x= 0;
        do {
            sumaArraylist= sumaArraylist+ dowhilelista.get(x);
            x++;
        } while (x< dowhilelista.size());
        System.out.println(" Suma din Arraylist este egala cu: "+ sumaArraylist);

    }
}

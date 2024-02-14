package SkillBrainBasics2HW;
/*
Definiti un array de double, cu valori zecimale.
Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
 */
public class Main5 {
    public static void main(String[] args) {
        double[] array= { 13.4, 4.5, 5.3, 78.5, 41.1, 9.9, 46.4, 4.5 };

        System.out.println(" Arrayul de double are urmatoarele valori zecimale: ");
        for (int i= 0; i< array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        System.out.println(" ");
        System.out.println(" Rezolvarea la problema in sine: ");
        for (int i= 0; i< array.length; i++){
            if (array[i] == 4.5){
                System.out.println(" Pozitia cu valoarea de 4.5 este urmatoarea: "+ i);
            }
            if ( array[i]>= 5) {
                System.out.println(" Elementul cu valoarea de: "+array[i] +" este un element penste 5. ");
            }
        }


    }
}

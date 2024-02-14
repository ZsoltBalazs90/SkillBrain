package SkillBrainBasics2HW;
/*
Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
Altfel, sa se afiseze mesajul “Index valid” pe ecran.
 */

public class Main6 {
    public static void main(String[] args) {
        int[] array= {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(" Avem urmatorul array: ");
        for (int i= 0; i< array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        System.out.println(" ");
        System.out.println(" Daca iteratia este la 2 va sari peste, iar daca este la 7 se va opri: ");
        for (int i= 0; i< array.length; i++) {
            if ( i == 2 ) {
                i++;
            }
            if ( i == 7) {
                break;
            }
            System.out.print( array[i]+ " ");
        }

    }
}

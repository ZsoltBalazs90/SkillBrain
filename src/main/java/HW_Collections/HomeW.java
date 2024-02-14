package HW_Collections;
// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class HomeW {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Blue");

        System.out.println("\n"+ " Lista de culori contine urmatoarele elemente: "+ "\n"+ colors+ "\n");

// Write a Java program to iterate through all elements in an array list.
        System.out.println(" Iterarea de culori folosind bucla for: ");
        for (int i= 0; i< colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println("\n");

// Write a Java program to insert an element into the array list at the first position.
        colors.set(0, "Banane");
        System.out.println(" Noua liste de culori dupa schimbarea primului element:"+ "\n"+ colors+ "\n");

// Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(" Al treilea element din lista este: "+ "\n"+ colors.get(2));

    }
}

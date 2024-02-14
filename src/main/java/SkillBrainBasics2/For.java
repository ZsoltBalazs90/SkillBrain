package SkillBrainBasics2;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        /*
        for(initializare; conditie; incrementare/decrementare){
         corp bucla
         }
         */
        System.out.println("\n");

        for(int i= 0; i<4; i++){
            System.out.println(" Valoarea variabilei i este: "+ i);
        }
        System.out.println("\n");

        Integer[] numere= {21, 3, 4, 65, 34};
        for (int i= 0; i< numere.length; i++){   // iterarea se poate incepe de la ori ce numar, i++ poate fi si alt calcul gen (i+= 2)
            System.out.println(" Elementul "+ i+ " este egal cu "+ numere[i]);
        }
        System.out.println("\n");



        //FOR EACH
        for (Integer numar : numere){
            System.out.println(" Valoarea elementului: "+ numar);
        }
        System.out.println("\n");


        ArrayList<String> list= new ArrayList<>();
        list.add("mere");
        list.add("pere");
        list.add("prune");
        list.add("lamaie");

        for (int i= 0; i< list.size(); i++){
            System.out.println(" Elementul la indicele " +i + " este egal cu "+ list.get(i));
        }
        System.out.println("\n");

        //FOR EACH
        for (String element: list){
            System.out.println(" Valoarea elementului din Arraylist este: "+ element);
        }

    }
}

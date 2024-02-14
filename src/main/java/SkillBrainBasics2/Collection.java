package SkillBrainBasics2;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        String[] studenti= new String[10];
        studenti[0]= "Mihai";
        studenti[1]= "Alex";
        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]+ "\n");    // null

        String[] fructe= {"mere", "pere", "banane"};

        ArrayList<String> list= new ArrayList<>();
        ArrayList<Integer> inturi= new ArrayList<>();   // nu se pot aloca variabile primitive

        list.add("mere");                   // .add(), se foloseste pentru a adauga o variabila la lisa
        list.add("pere");
        System.out.println(list+ "\n");

        System.out.println(list.get(0));    // .get(), pentru a scoate o singura valoare din lista
        System.out.println(list.get(1));
        //  System.out.println(list.get(3));  aici vom primi o erroare de compilare comparativ cu null in cazul arrayurilor
        // pentru ca nu este predefinit lungimea la inceput acesta se extinde si se micsoreaza dupa caz

        list.set(0, "Banane");          //set- se foloseste pentru a schimba o valoare din lista cu o alta valoare
        System.out.println(list);

        list.remove(0);                 // remove - se foloseste la stergerea unui element din lista
        System.out.println(list);
        System.out.println(list.get(0));

        list.add("ananas");
        list.add("avocado");
        list.add("portocale");


        System.out.println(list.size());        //size- se foloseste pentru pentru a afla lungimea/ marimea unei liste

        list.clear();   // clear- se foloseste pentru a sterge toate elementele din lista
        System.out.println(list);
        System.out.println(list.size());

    }
}

package SkillBrainBasics2;

public class Arrays {
    public static void main(String[] args) {
        // tip si un nume

        String[] studenti;
        int numere[];

        studenti= new String[10];  // se declara ca si un obiect
        numere= new int[5];        // deoarece un array este un obiect

        double[] duble= new double[7];

        studenti[0]= "Mihai";
        studenti[1]= "Anamaria";

        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]); // valoarea este null

        System.out.println(numere[0]);  // valoarea este 0

        // Array Literal
        String[] literal = {"Alexandru", "mere", "masa"};
        System.out.println(literal[0]);                     // daca e sa incarcam sa apelam de exemplu literal[5]
        System.out.println(literal[1]);                     // vom primi o erroare pentru ca in stringul literal sunt
        System.out.println(literal[2]);                     // doar 3 elemente, 0,1 si 2
    }
}

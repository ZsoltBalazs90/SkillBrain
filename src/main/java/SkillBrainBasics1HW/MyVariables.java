package SkillBrainBasics1HW;
// Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
//String si un boolean, apoi apelati metoda din metoda “main”

public class MyVariables {
    public static void main(String[] args) {
        myVariables();

    }

    public static void myVariables() {
        int a= 9;
        String ab= " O variabila.";
        boolean abc= true;
        System.out.println(" Variabila int este: "+ a+ "\n"+
                " Variabila String este: "+ ab+ "\n"+
                " Variabila boolean este: "+ abc);
    }
}

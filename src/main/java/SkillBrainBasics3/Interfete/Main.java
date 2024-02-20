package SkillBrainBasics3.Interfete;

public class Main {
    public static void main(String[] args) {
        Caine caine= new Caine();

        caine.mananca();
        caine.sunet();
        caine.reproducere();
        caine.vaneaza();

        Labrador labrador= new Labrador();

        labrador.mananca();
        labrador.sunet();
        labrador.reproducere();
        labrador.vaneaza();
        System.out.println(labrador.rasa());

        System.out.println(caine.inteligenta);

    }
}

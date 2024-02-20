package SkillBrainBasics3.Abstractizare;

public class Main {
    public static void main(String[] args) {
        Cerc cerc= new Cerc(3.2, 10.1, -5.5); // accesam constructorul din classa Cerc, unde avem doar un singur constructor cu
                                                            // trei variabile

        System.out.println(cerc.raza);
        System.out.println(cerc.x);
        System.out.println(cerc.y);

        System.out.println(cerc.getX());
        System.out.println(cerc.getY());

        System.out.println(cerc.aria());
        System.out.println(cerc.perimetru());
    }
}

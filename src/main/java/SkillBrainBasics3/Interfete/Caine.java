package SkillBrainBasics3.Interfete;

public class Caine implements Mamifer, AnimalDeCompanie{

    @Override
    public void mananca() {
        System.out.println(" Eu sunt un caine si imi place sa mananc oase. ");
    }

    @Override
    public void sunet() {
        System.out.println(" Ham- Ham! ");
    }

    @Override
    public void reproducere() {
        System.out.println(" Eu sunt un caine si imi hranesc puii cu lapte. ");
    }

    @Override
    public void vaneaza() {
        System.out.println(" Eu sunt un caine de companie si nu pot vana. ");
    }
}

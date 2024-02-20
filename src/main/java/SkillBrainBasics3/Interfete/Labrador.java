package SkillBrainBasics3.Interfete;

public class Labrador extends Caine{
    // subclassa labrador va mosteni prin extindere toate variabilele si metodele pe care la are classa parinte caine

    public String rasa= "Labrador";

    public String rasa() {
        return rasa;
    }

    @Override
    public void mananca() {
        System.out.println(" Eu sunt un labrador si imi place peddegree. ");
    }
}

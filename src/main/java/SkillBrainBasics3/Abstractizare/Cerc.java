package SkillBrainBasics3.Abstractizare;

public class Cerc extends ObiectGrafic {
    double raza;

    Cerc(double raza, double x, double y){
        super(x, y);  // new ObiectGrafic (x, y); deoarece Cerc extands ObiectGrafic acesta find classa parinte
                        // iar classa copil acceseaza constructorul din classa parinte prin keywordul super
        this.raza= raza;
    }

    public double aria() {
        return Math.PI * raza * raza;
    }

    public double perimetru() {
        return 2* Math.PI * raza;
    }
}

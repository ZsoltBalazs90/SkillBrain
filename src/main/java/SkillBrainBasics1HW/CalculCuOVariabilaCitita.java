package SkillBrainBasics1HW;
// Scrieti un program incare cititi de la tastatura un numar, si
//calculati:
//- rezultatul sumei cu 5
//- rezultatul scaderii cu 12.3
//- rezultatul inmultirii cu -3.2
//- rezultatul impartirii cu 4
//- rezultatul modulului cu 6

import java.util.Scanner;

public class CalculCuOVariabilaCitita {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n"+ " Introduceti un numar: ");
        double numar= scanner.nextDouble();

        double adunare= numar+ 5;
        double scadere= numar- 12.5;
        double inmultire= numar* (-3.2);
        double inpartire= numar/ 4;
        double modulo= numar% 6;

        System.out.println("\n"+ " Rezultatul adunari cu numarul 5 este: "+ adunare+ "\n"+
                " Rezultatul scaderi cu numarul -12.5 este: "+ scadere+ "\n"+
                " Rezultatul inmultiri cu numarul -3.2 este "+ inmultire+ "\n"+
                " Rezultatul inpartiri cu numarul 4 este: "+ inpartire+ "\n"+
                " Rezultatul modulo cu numarul 6 este: "+ modulo);

    }
}

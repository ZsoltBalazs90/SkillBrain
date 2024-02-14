package SkillBrainBasics2;

public class Instructiunii {
    public static void main(String[] args) {
        // instructiunea IF- ELSE


        int numar= -5;

        if (numar< 0){
            System.out.println(" Numarul este mai mic decat 0. ");
        } else {
            System.out.println(" Am intrat pe ramura else. ");
        }
        System.out.println(" Dupa instructiunea IF. "+ "\n");

        // instructiunea IF- ELSE- IF
        int nota= 6;
        if (nota == 10) {
            System.out.println(" Studentul a primit nota maxima. ");
        } else if (nota == 9) {
            System.out.println(" Studentul a primit nota 9. ");
        } else if (nota <9 && nota >8) {
            System.out.println( " Studentul a primit nota intre 8 si 9. ");
        } else {
            System.out.println(" Studentul a luat nota sub 8. "+ "\n");
        }

        // Istructiunea SWICH
       String ziua= "Luni";
        if (ziua == "Sambata"){
            System.out.println("Azi este sambata! ");
        } else if (ziua == "Duminica") {
            System.out.println("Azi este duminica!");
        } else {
            System.out.println("A trecut weekendul!"+ "\n");
        }

        switch (ziua){                                                   // este necesar folosirea cuvantului cheie break
            case "Sambata": {                                            // pentru a opri executia instructiuni swich
                System.out.println("Ziua sambata - swich.");             // cand a atins blocul cod de executie
                break;
            } case "Duminica": {                                         // accepta doar char, byte, short, int- primitive
                System.out.println("Ziua duminica - swich.");            // Character, Byte, Short, Integer, String- nonprmitive
                break;                                                   // pentru ca in spate se foloseste ==
            } default: {
                System.out.println("Nu este weekend - swich."+ "\n");
                break;           // nu este necesar folosirea cuvantului break deoarece in isnstructiunea swich
            }                    // nu mai sunt alte conditii de verificat
        }


        // operatorul ternar
        // conditie? instructiunea true: instructiunea fals

        System.out.println(numar<0 ? " Instructiunea a fost true. ": " Instructiunea a fost falsa. ");

    }
}

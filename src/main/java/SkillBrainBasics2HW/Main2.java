package SkillBrainBasics2HW;

import java.util.Scanner;

/*
 Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
 Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere,
 si afisati rezultatul pe ecran:-‘a’: adaugare-‘s’: scadere-‘i’: inmultire-‘p’: impartire-‘m’: modul.
 Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
*/
public class Main2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Introduceti primul numar: ");
        double numar1= scanner.nextDouble();
        System.out.println(" Introduceti al doilea numar: ");
        double numar2= scanner.nextDouble();
        System.out.println(" ");
        System.out.println(" Introduceti un caracter de la tastatura pentru a efectua o operatie: "+ "\n"+
                            " -a -pentru adunare"+ "\n"+
                            " -s -pentru scadere"+ "\n"+
                            " -i -pentru inmultire"+ "\n"+
                            " -p -pentru impartire"+ "\n"+
                            " -m -pentru modulo");
        char caracter= scanner.next().charAt(0);
        scanner.close();

        double rezultat;
        switch ( caracter ) {
            case 'a':
                rezultat= numar1+ numar2;
                System.out.println(" Rezultatul adunarii este: "+ rezultat);
                break;
            case 's':
                rezultat= numar1- numar2;
                System.out.println(" Rezultatul scaderii este: "+ rezultat);
                break;
            case 'i':
                rezultat= numar1* numar2;
                System.out.println(" Rezultatul inmultirii este: "+ rezultat);
                break;
            case 'p':
                if (numar2 != 0) {
                    rezultat = numar1 / numar2;
                    System.out.println(" Rezultatul impartirii este: " + rezultat);
                } else {
                    System.out.println(" Impartirea cu 0 nu este posibila! ");
                }
                break;
            case 'm':
                rezultat= numar1% numar2;
                System.out.println(" Rezultatul modulului este: "+ rezultat);
                break;
            default:
                System.out.println(" Caracterul introdus nu este valabil! ");


        }
    }
}

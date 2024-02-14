package Enum;

import java.sql.SQLOutput;

public class Marti {
    public static void main(String[] args) {
        Luni luni= Luni.Aprilie;
        System.out.println(luni);

        System.out.println(ExeDoi.CIORBA);

        System.out.println(ExeDoi.CIORBA.getFeldeMancare());
    }

}

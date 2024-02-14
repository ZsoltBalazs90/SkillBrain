package SkillBrainBasics1;

public class Operatori {
    public static void main(String[] args) {
        // +, -, *, /
        // %- returneza restul
        System.out.println( 6% 4); // restul de la impartire este 2

        // ++, --, incrementeza sau decrementeaza
        int a= 7;
        a++;
        System.out.println(a); // 8

        // comparatie intre operanti
        // <, >, <=, >=, ==

        int c= 8;
        int d= 9;
        System.out.println(c< d);// true, returneza o variabila tip boolean
        boolean var= 10== 8;
        System.out.println(var);// fals

        // &&, ||   si, sau
        boolean var2= (5== 4)&& (5== 5);
        System.out.println(var2); // fals, pentru ca 5 nu este = si cu 4 si cu 5
    }
}

package SkillBrainBasics2;

public class ArraysMulti {
    public static void main(String[] args) {

        String[][] bidimensional= new String[3][6];
        String[][][] tridimensional= new String[2][3][1];

        bidimensional[0][0]= " Curs ";
        bidimensional[2][1]= " Capitol ";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[2][1]);

        String[][] multidimensional= {
                {"laptop", "masa"},     // multidimensional[0][0], multidimensional[0][1]
                {"tastatura"}           // multidimensional [1][0]
        };

        System.out.println(multidimensional[0][0]);
        System.out.println(multidimensional[0][1]);
        System.out.println(multidimensional[1][0]);
    }
}

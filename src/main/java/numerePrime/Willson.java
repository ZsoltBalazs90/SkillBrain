package numerePrime;

public class Willson {
    public static boolean isPrime (int n) {
        if( n <= 1) {
            return false;
        }
        long factorial= 1;
        for (int i= 1; i<= n-1; i++) {
            factorial= (factorial* i)% n;
        }
        return (factorial== n-1);
    }

    public static void main(String[] args) {
        System.out.println(" Numerele prime pana la 30 sunt: ");
        for (int i= 2; i<= 30; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

public class Eratostene {
    public static void isPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        System.out.println("Numere prime pana la " + n + " sunt:");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i );
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit = 30;
        isPrimes(limit);
    }
}

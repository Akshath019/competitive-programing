import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLong()) {
            long t = sc.nextLong();

            while (t-- > 0) {
                long n = sc.nextLong();

                if (n < 4 || n % 2 == 1) {
                    System.out.println(-1);
                } else {
                    // (n + 5) / 6 is the integer equivalent of ceil(n / 6)
                    long minBuses = (n + 5) / 6;
                    long maxBuses = n / 4;

                    System.out.println(minBuses + " " + maxBuses);
                }
            }
        }
        sc.close();
    }
}

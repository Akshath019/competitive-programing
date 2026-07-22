import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] prefix = new long[n + 1];
            long totalSum = 0;

            // Build prefix sum
            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();
                totalSum += x;
                prefix[i] = totalSum;
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                long rangeSum = prefix[r] - prefix[l - 1];
                long length = r - l + 1;

                long newSum = totalSum - rangeSum + (length * k);

                if (newSum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
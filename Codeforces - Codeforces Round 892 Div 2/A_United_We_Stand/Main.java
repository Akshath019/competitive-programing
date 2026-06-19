import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long mn = a[0];

            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            for (long x : a) {
                if (x == mn) {
                    b.add(x);
                } else {
                    c.add(x);
                }
            }

            if (c.isEmpty()) {
                System.out.println(-1);
                continue;
            }

            System.out.println(b.size() + " " + c.size());

            for (long x : b) {
                System.out.print(x + " ");
            }
            System.out.println();

            for (long x : c) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
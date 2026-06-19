import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Already not sorted
            boolean notSorted = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    notSorted = true;
                    break;
                }
            }

            if (notSorted) {
                System.out.println(0);
                continue;
            }

            int minGap = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++) {
                minGap = Math.min(minGap, arr[i] - arr[i - 1]);
            }

            System.out.println(minGap / 2 + 1);
        }

        sc.close();
    }
}
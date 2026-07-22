import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Initial value (handles n = 1)
            int ans = a[n - 1] - a[0];

            // Case 1: Make some element the first element
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, a[i] - a[0]);
            }

            // Case 2: Make some element the last element
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, a[n - 1] - a[i]);
            }

            // Case 3: Rotate completely inside the array
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, a[i] - a[i + 1]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
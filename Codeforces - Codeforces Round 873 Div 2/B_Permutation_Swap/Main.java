// B. Permutation Swap

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;

            for (int i = 1; i <= n; i++) {
                if (arr[i] != i) {
                    ans = gcd(ans, Math.abs(arr[i] - i));
                }
            }

            System.out.println(ans);
        }
    }
}
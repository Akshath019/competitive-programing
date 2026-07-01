import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            int totalTwos = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] == 2) {
                    totalTwos++;
                }
            }

            // All 1s => product on both sides is always 1
            if (totalTwos == 0) {
                System.out.println(1);
                continue;
            }

            // Odd number of 2s cannot be split equally
            if (totalTwos % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int need = totalTwos / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    count++;
                }

                if (count == need) {
                    System.out.println(i + 1); // 1-based index
                    break;
                }
            }
        }

        sc.close();
    }
}
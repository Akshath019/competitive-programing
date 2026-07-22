import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long test = sc.nextLong();

        while (test-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int n = s.length();
            int m = t.length();

            int[] frequencyInT = new int[26];

            for (int i = 0; i < m; i++) {
                frequencyInT[t.charAt(i) - 'A']++;
            }

            StringBuilder temp = new StringBuilder(s);

            for (int i = n - 1; i >= 0; i--) {
                char ch = temp.charAt(i);

                if (frequencyInT[ch - 'A'] > 0) {
                    frequencyInT[ch - 'A']--;
                } else {
                    temp.setCharAt(i, '.');
                }
            }

            StringBuilder finalString = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (temp.charAt(i) != '.') {
                    finalString.append(temp.charAt(i));
                }
            }

            if (finalString.toString().equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
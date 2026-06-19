//  A. Cover in Water

import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int cnt = 0;

                for (char c : s.toCharArray()) {
                    if (c == '.') cnt++;
                }

                System.out.println(cnt);
            }
        }
    }
}
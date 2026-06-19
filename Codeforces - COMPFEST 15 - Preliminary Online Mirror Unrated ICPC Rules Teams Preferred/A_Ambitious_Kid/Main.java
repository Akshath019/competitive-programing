//  A. Ambitious Kid

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for(int i = 0 ;i < n ; i++) {

            int m = sc.nextInt();
            if (m == 0) {
                min = 0;
                System.out.println("0");
                break;

            }
            if (m < 0) {
                m = -1 * m;
            }
            min = Math.min(min, m);
        }
        if(min !=0) {
            System.out.println(min);
        }
    }
}
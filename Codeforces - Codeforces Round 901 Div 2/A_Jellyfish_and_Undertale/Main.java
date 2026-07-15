//  A. Jellyfish and Undertale

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long ans = b;

            for(int i = 0 ; i < n ; i++){
                long num = sc.nextLong();


                ans+=Math.min(num ,a-1);

            }

            System.out.println(ans);
        }
    }
}
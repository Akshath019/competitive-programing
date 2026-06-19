//  B. Blank Space

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int cnt = 0;
            int max =  Integer.MIN_VALUE;


            for(int i = 0 ; i < n ;i++){
                int m = sc.nextInt();
                if(m == 0){
                    cnt++;
                    max = Math.max(max , cnt);

                }else{
                    cnt = 0;
                }
            }
            max = (max == Integer.MIN_VALUE) ? 0 : max;
            System.out.println(max);
        }
        
    }
}
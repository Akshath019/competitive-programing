//  A. Array Coloring

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int m = sc.nextInt();

            int[] arr = new int[m];
            for(int i = 0 ; i < m ; i++){
                arr[i] = sc.nextInt();
            }
            int even = 0;
            int odd =0;

            for(int n : arr){
                if( n%2 == 0){
                    even += n;
                }else{
                    odd += n;
                }
            }

            if( (even % 2) == 0 && (odd % 2)  == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



        }
        
    }
}
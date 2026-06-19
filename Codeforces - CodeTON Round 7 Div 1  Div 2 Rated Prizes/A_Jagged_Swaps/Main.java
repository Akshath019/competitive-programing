//  A. Jagged Swaps

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int first = sc.nextInt();


            if(first == 1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            for(int i = 1  ; i < n ;i++){
                sc.nextInt();
            }

        }
        
    }
}